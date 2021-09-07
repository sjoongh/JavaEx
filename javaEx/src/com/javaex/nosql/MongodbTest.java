package com.javaex.nosql;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;

public class MongodbTest {
	// 기본 IP
	static String MONGODB_IP = "127.0.0.1";
	// 기본 port
	static int MONGODB_PORT = 27017;
	// DB_NAME 설정
	static String DB_NAME = "javaMongo";
	// collection 이름 설정
	static String COLL_NAME = "testCollection";

	public static void main(String[] args) {
//		connect();	
//		testInsert();
//		getCollection(DB_NAME, COLL_NAME);
//		testInsertMany();
//		testFindFirst();
//		testFindAll();
//		testFindFilter();
//		testUpdateOne();
//		testUpdateMany();
		testDeleteAll();
	}
	
	// 삭제
	private static void testDeleteAll() {
		// 해당 DB의 collection을 호출
		MongoCollection<Document> collection =
				getCollection(DB_NAME, COLL_NAME);
		DeleteResult res = collection.deleteMany(new Document());
		System.out.println(res.getDeletedCount()+"개 레코드 삭제");
	}
	
	// 여러 문서 업데이트
	private static void testUpdateMany() {
		MongoCollection<Document> collection =
				getCollection(DB_NAME, COLL_NAME);
		
		Bson filter = Filters.eq("species", "인간");
		
		Bson doc = new Document("$set", new Document("method", "updateMany")
				.append("updateDate", new Date()));
		
		UpdateResult res = collection.updateMany(filter, doc);
		
		System.out.println(res.getModifiedCount()+"개 업데이트");
	}
	
	private static void testUpdateOne() {
		// getcollection(DB_NAME과 COLL_NAME)을 받아옴
		MongoCollection<Document> collection =
				getCollection(DB_NAME, COLL_NAME);
		// 업데이트 조건
		Bson filter = Filters.eq("species", "인간");
		// 갱신 내역
		Bson doc = new Document("$set", new Document("method", "updateOne"));
		
		UpdateResult res = collection.updateOne(filter, doc);
		
		System.out.println(res.getModifiedCount()+"개 업데이트");
		
	}
	
	// 조건 검색
	private static void testFindFilter() {
		MongoCollection<Document> collection = 
				getCollection(DB_NAME, COLL_NAME);
		
		// 필터 생성
//		Bson bsonFilter = Filters.regex("species", "인간");
		// 복합 조건
//		species = 인건이거나 gender = 여성인 레코드
		// Filters.or은 or연산과 같은기능
		// Filters.eq는 where조건처럼 조건문 사용하겠다는 의미
		// mongoDB는 Bson으로 구성되어 있으므로
		// Bson에 Filters조건을 걸어 해당 데이터를 가져옴
		Bson bsonFilter = Filters.or(
				Filters.eq("species", "인간"),
				Filters.eq("gender", "여성"));
		// find로 bsonFilter의 조건에 맞는것을 찾아옴
		// .iterator로 조건에 해당하는 모든 요소를 가져올 수 있음
		// MongoCursor<document>는 조건에 맞는 전체 document를 가져옴
		// 찾아온 데이터를 cursor이 리턴함
		MongoCursor<Document> cursor =
				collection.find(bsonFilter).iterator();
		while (cursor.hasNext()) {
			Document doc = cursor.next();
			// Bson으로 된 데이터를 Json형식으로 user가 읽을 수 있게 바꿔서 출력해줌
			System.out.println(doc.toJson());
		}
		cursor.close();
	}
	
	// 문서 전체 find
	private static void testFindAll() {
		MongoCollection<Document> collection =
				getCollection(DB_NAME, COLL_NAME);
		
		// find 메서드는 Cursor 반환
		MongoCursor<Document> cursor = collection.find().iterator();
		
		// 루프(요소가 없을때까지)
		while(cursor.hasNext()) { // 뒤에 남은 레코드가 있다
			// 커서 뒤로 이동
			Document doc = cursor.next();
			System.out.printf("%s, %s, %s, %s%n",
					doc.get("id"),
					doc.get("name"),
					doc.get("species"),
					doc.get("gender"));
			System.out.println("JSON"+doc.toJson());
		}
		// 커서 닫기
		cursor.close();
	}
	
	private static void testFindFirst() {
		MongoCollection<Document> collection =
				getCollection(DB_NAME, COLL_NAME);
		// find() -> Cursor가 반환
		Document doc = collection.find().first();
		// Document 출력
		System.out.println("DOC"+doc);
		// 필드 확인 get("필드명")
		System.out.printf("%s, %s, %s, %s%n",
				doc.get("id"),
				doc.get("name"),
				doc.get("species"),
				doc.get("gender"));
		// Document -> JSON 출력: toJson
		System.out.println("JSON"+doc.toJson());
	}
	
	private static void testInsertMany() {
		// 여러 Document Insert
		// insertMany(배열)
		List<Document> docs = new ArrayList<>();
		// 문서 생성 -> list 추가
		Document doc = new Document("name", "고길동")
				.append("species", "인간")
				.append("gender", "남성");
		docs.add(doc);
		doc = new Document("name", "도우너")
				.append("species", "외계인")
				.append("gender", "남성");
		docs.add(doc);
		doc = new Document("name", "또치")
				.append("species", "조류")
				.append("gender", "여성");
		docs.add(doc);
		doc = new Document("name", "영희")
				.append("species", "인간")
				.append("gender", "여성");
		docs.add(doc);
		
		System.out.println("삽입할 문서들"+docs);
		
		// 여러 문서 insert
		MongoCollection<Document> collection = getCollection(DB_NAME, COLL_NAME);
		collection.insertMany(docs);
	}
	
	private static MongoCollection<Document>
	getCollection(String dbName, String collName) {
		// DB 접속
		MongoClient client = connect();
		
		// 데이터베이스 선택
		MongoDatabase db = client.getDatabase(dbName);
		// 컬렉션 선택
		MongoCollection<Document> collection = (MongoCollection<Document>) db.getCollection(collName);
		
		System.out.println("DataBase"+db);
		System.out.println("Collection"+collection);
		
		return collection;
	}
	
	private static void testInsert() {
		// JSON(BSON) Document 생성
		Document doc = new Document("name", "둘리")
				.append("species", "공룡")
				.append("gender", "남성");
		System.out.println("문서:"+doc);
		System.out.println("JSON:"+doc.toJson());
		
		// 컬렉션 얻기
		MongoCollection<Document> collection = 
				getCollection(DB_NAME, COLL_NAME);
		// 1개의 문서 INSERT
		collection.insertOne(doc);
	}
	
	private static MongoClient connect() {
		// MongoDB에 접속
		MongoClient client = MongoClients.create();
		
		System.out.println(client);
		return client;
	}
}
