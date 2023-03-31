package com.kyk.ch07Project1;

public class MainClass03 {

	public static void main(String[] args) {
		Child2 ch1 = new Child2();
//		ch1.method();
		System.out.println("ch1.x = " + ch1.x);
	}

}

class Parent2 {
	int x = 10;
}

class Child2 extends Parent2 {
	//int x로 중첩정의 안하면 부모의 int x를 그대로 사용
	void method() {
		System.out.println("x = " + x); //Parent2의 x 그대로 사용
		System.out.println("this.x = "  + this.x); // Parent2의 x 그대로 사용
		System.out.println("super = " + super.x); // Parent2의 x 그대로 사용
	}
}