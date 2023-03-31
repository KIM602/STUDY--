package com.kyk.ch06Project1;

public class QuizClass1 {

	public static void main(String[] args) {
		/*
		 * 1. 이름이 MyClass인 클래스 만들기
		 * 2. MyClass의 객체(인스턴스) myObj를 생성
		 * 3. MyClass의 인스턴스는 myObj이고 멤버 변수가 int x=5일 때 이를 가져오는 법
		 * 4. MyClass의 인스턴스는 myObj이고 멤버 메서드는 public void myMethod() { }일 때 이를 호출
		 * 5. MyClass의 인스턴스변수가 String name, int age, String phone일 때
		 *		이 세개의 변수를 초기화 할 수 있는 생성자를 만드시오.
		 * 6. Array클래스와 Scanner클래스를 사용자가 만드는 클래스에서 사용하게 함
		 * 		import.java.util.*;
		 * 7. main메서드에서 같은 클래스에 있는 static메서드 myMethod()를 호출하시오
		 * 8. main메서드에서 myMethod("John");으로 호출 할 수 있는 메서드를 만드세요
		 * 9. static int plusMethod(int x, int y)를 오버로딩한 메서드를 하나 만드세요
		 * 		static int plusMethod(int x, int y, int z)
		 * 		static int plusMethod(float x, int y, int z)
		 */
		
		MyClass myObj = new MyClass();
		System.out.println(myObj.x);
		
		myObj.myMethod();
		
		myMethod();
		
		myMethod("John");
		
	}
	
	static  void myMethod() {
		
	}
	
	static void myMethod(String name) {
		System.out.println("John");
	}

}

class MyClass {
	int x = 5; 
	String name;
	int age;
	String phone;
	
	public void myMethod(String name, int age, String phone) {
		
	}
	
	public void myMethod() {
	}
	

}
