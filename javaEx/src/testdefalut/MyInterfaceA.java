package testdefalut;
// 수정인터페이스
public interface MyInterfaceA {
	public void method1();


// 디폴트 메소드
public default void method2() {
	System.out.println("MyInterface-method2 실행");
}
}