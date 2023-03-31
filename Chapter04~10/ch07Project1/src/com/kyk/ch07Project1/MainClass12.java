package com.kyk.ch07Project1;

public class MainClass12 {

	public static void main(String[] args) {
		Child3 c = new Child3();
		c.method1(); //Child3�� �����ǵ� method1
 		c.method2(); //Child3�� ������ �������̽��� default�޼��� method2
 		MyInterface.staticMethod(); //�������̽��� static�޼��� ȣ��
 		MyInterface2.staticMethod1();
	}

}

interface MyInterface { //interfaceŰ���带 �ٿ��� ����
	//�ڹ� 1.8���� ��� ������ ������ �� �޼���
	public static final int SPADE = 4; //���
	int CLOVER = 1; //�����ڸ� ���� ����
	
	public abstract String getCardNumber(); //�߻�޼��� ������ �̻���
	String getCardKind(); //�����ڸ� ������ ���
	
	//�ڹ� 1.8���� ��� ������ ������ �� �޼���(abstract �޼��� �ƴ�)
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	
	static void staticMethod() { //Ŭ�����޼��嵵 �ڹ� 1.8���� ���
		 System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	//�߻�޼���� ����� ����
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
	//��Ӱ� ������ ���ÿ� �ϴ� Ŭ���� �������̽� ������ ���� ����(2��) Ŭ���� ����� 1���� ����
	//�߻�޼��� ����
	public String getCardNumber() {
		return "";
	}
	

	public String getCardKind() { //�������̽��� public abstract�� ������ ��� public�� �� ����ϰ� �ۼ�
		return "";
	}
	
	//�������̽��� default�޼��� method1�� ������
	@Override
	public void method1() {
		System.out.println("method1() in Child");
	}
}