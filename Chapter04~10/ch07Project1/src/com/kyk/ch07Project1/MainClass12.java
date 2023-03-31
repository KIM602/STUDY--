package com.kyk.ch07Project1;

public class MainClass12 {

	public static void main(String[] args) {
		Child3 c = new Child3();
		c.method1(); //Child3의 재정의된 method1
 		c.method2(); //Child3의 구현한 인터페이스의 default메서드 method2
 		MyInterface.staticMethod(); //인터페이스의 static메서드 호출
 		MyInterface2.staticMethod1();
	}

}

interface MyInterface { //interface키워드를 붙여서 만듬
	//자바 1.8부터 사용 가능한 구현이 된 메서드
	public static final int SPADE = 4; //상수
	int CLOVER = 1; //제어자를 생략 가능
	
	public abstract String getCardNumber(); //추상메서드 제어자 미생략
	String getCardKind(); //제어자를 생략한 경우
	
	//자바 1.8부터 사용 가능한 구현이 된 메서드(abstract 메서드 아님)
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	
	static void staticMethod() { //클래스메서드도 자바 1.8부터 사용
		 System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	//추상메서드와 상수는 없음
	default void method3() {
		System.out.println("method3() in MyInterface2");
	}
	
	static void staticMethod1() {
		System.out.println("staticMethod() in MyInterface2");
	}
}

class Parent3 {
	public void method4() {
		System.out.println("method4() in Parent3");
	}
}

class Child3 extends Parent3 implements MyInterface, MyInterface2 {
	//상속과 구현을 동시에 하는 클래스 인터페이스 구현은 다중 가능(2개) 클래스 상속은 1개로 제한
	//추상메서드 구현
	public String getCardNumber() {
		return "";
	}
	

	public String getCardKind() { //인터페이스에 public abstract이 생략된 경우 public을 꼭 기억하고 작성
		return "";
	}
	
	//인터페이스의 default메서드 method1을 재정의
	@Override
	public void method1() {
		System.out.println("method1() in Child");
	}
}