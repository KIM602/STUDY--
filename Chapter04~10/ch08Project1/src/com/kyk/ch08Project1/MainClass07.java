package com.kyk.ch08Project1;

public class MainClass07 {

	public static void main(String[] args) throws Exception {
		//throws Exception�� ����ó���� main�� ȣ���� ������ ����(jvm)
		method1();
	}
	
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception();
		//���Ƿ� Exception���ܸ� �߻� �������� try~catch�� ����ó���� ���ϰ� throws�� ���ܸ� �ڱ⸦ ȣ���� �޼���� ����
	}
}
