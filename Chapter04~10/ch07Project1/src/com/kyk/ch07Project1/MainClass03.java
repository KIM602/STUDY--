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
	//int x�� ��ø���� ���ϸ� �θ��� int x�� �״�� ���
	void method() {
		System.out.println("x = " + x); //Parent2�� x �״�� ���
		System.out.println("this.x = "  + this.x); // Parent2�� x �״�� ���
		System.out.println("super = " + super.x); // Parent2�� x �״�� ���
	}
}