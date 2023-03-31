package com.kyk.ch07Project1;

public class MainClass02 {

	public static void main(String[] args) {
		Child c = new Child(); //포함 방식
		c.method();
		
	}
}

class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 20; //부모클래스의 멤버변수를 중첩 정의하여 부모 변수는 가려짐
	void method() {
			System.out.println("x = " + x); //자기클래스의 인스턴스이므로 객체 없이 사용
			System.out.println("this.x = " + this.x); //this는 이 클래스의 객체
			System.out.println("super.x = " + super.x); //상위 클래스 Parent를 나타내는 키워드
	}
}