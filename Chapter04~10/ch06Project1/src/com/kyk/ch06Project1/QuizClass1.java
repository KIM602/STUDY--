package com.kyk.ch06Project1;

public class QuizClass1 {

	public static void main(String[] args) {
		/*
		 * 1. �̸��� MyClass�� Ŭ���� �����
		 * 2. MyClass�� ��ü(�ν��Ͻ�) myObj�� ����
		 * 3. MyClass�� �ν��Ͻ��� myObj�̰� ��� ������ int x=5�� �� �̸� �������� ��
		 * 4. MyClass�� �ν��Ͻ��� myObj�̰� ��� �޼���� public void myMethod() { }�� �� �̸� ȣ��
		 * 5. MyClass�� �ν��Ͻ������� String name, int age, String phone�� ��
		 *		�� ������ ������ �ʱ�ȭ �� �� �ִ� �����ڸ� ����ÿ�.
		 * 6. ArrayŬ������ ScannerŬ������ ����ڰ� ����� Ŭ�������� ����ϰ� ��
		 * 		import.java.util.*;
		 * 7. main�޼��忡�� ���� Ŭ������ �ִ� static�޼��� myMethod()�� ȣ���Ͻÿ�
		 * 8. main�޼��忡�� myMethod("John");���� ȣ�� �� �� �ִ� �޼��带 ���弼��
		 * 9. static int plusMethod(int x, int y)�� �����ε��� �޼��带 �ϳ� ���弼��
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
