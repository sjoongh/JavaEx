package test;

public class Car {
	String company = "현대";
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	void model(String model) {
		this.model = model;
	}
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속:" +this.speed+"km/h)");
		}
	}
	
	Car() {}
	
	// Car 2에 들어감 String 하나
	Car(String model) {
		// 맨 밑의 Car를 호출함
		this(model, "은색", 700);
	} 
	// Car 5에 들어감, String가 두개
	Car(String model, String color) {
		// 맨 밑의 Car를 호출함
		this(model, "금색", 500);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
//	--------------------------------------------------------
//	int gas;
//	
//	void setGas(int gas) {
//		this.gas = gas;
//	}
//	boolean isLeftGas() {
//		if(gas == 0) {
//			System.out.println("no gas");
//			return false;
//		}
//		System.out.println("ok gas");
//		return true;
//		}
//}
//	-------------------------------------------------------------
	//클래스 내부에서 메소드 호출
//	public class Calculator {
//		int plus(int x, int y) {
//			int result = x + y;
//			return result; // 3. result로 반환
//		}
//		double avg(int x, int y) {
//			double sum = plus(x, y); // 2. plus 호출
//			double result = sum / 2;
//			return result;
//		}
//		void execute() {
//			double result = avg(7, 10); // 1. avg 호출
//			println("실행결과:"+result); // 4. println 호출
//		}
//		void println(String message) {
//			System.out.println(message); // 5. message 출력
//		}
//	}
// ---------------------------------------------------
//private 타입 fieldName; --> 필드 접근 제한자: private
//
// Getter
//public 리턴타입 getFieldName() { 
//--> 접근 제한자 public, 리턴타입: 필드타입, 메소드 이름 : get + 필드이름(첫문자 대문자)
//	return fieldName; --> 리턴값: 필드값
//}
//
// Getter --> boolean일 때
// public boolean isStop() { 
// --> 필드 타입이 boolean일 경우에는 get으로 시작하지 않고 is로 시작하는 것이 관례이다
//	return stop;
//}
// Setter
//public void setFieldName(타입 fieldName) {
//	this.fieldName = fieldName;
//}
// 검증 코드나 변환 코드는 필요에 따라 추가해야 한다
// -------------------------------------------------------

