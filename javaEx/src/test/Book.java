package test;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1; // 재고 있음
	}
	
	public void rent() {
		if (stateCode == 1) {
			// 재고 있음
			stateCode = 0; // 대여중
			System.out.printf("%s가 대여 되었습니다.", title);
		} else {
			// 대어중
			System.out.println("이미 대여중인 책입니다.");
		}
	}
	
	public void print() {
		System.out.printf("%d 책 제목: %s, 작가: %s 대여 유무: %s",
				bookNo, title, author, stateCode == 1 ? "재고있음": "대여중");
	}
	
	public int getBookNo() {
		return bookNo;
	}
}
