package com.kyk.ch07Project1;

public class MainClass02 {

	public static void main(String[] args) {
		Child c = new Child(); //���� ���
		c.method();
		
	}
}

class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 20; //�θ�Ŭ������ ��������� ��ø �����Ͽ� �θ� ������ ������
	void method() {
			System.out.println("x = " + x); //�ڱ�Ŭ������ �ν��Ͻ��̹Ƿ� ��ü ���� ���
			System.out.println("this.x = " + this.x); //this�� �� Ŭ������ ��ü
			System.out.println("super.x = " + super.x); //���� Ŭ���� Parent�� ��Ÿ���� Ű����
	}
}