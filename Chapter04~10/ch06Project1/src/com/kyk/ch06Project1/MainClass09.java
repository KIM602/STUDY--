package com.kyk.ch06Project1;

public class MainClass09 {

	public static void main(String[] args) {
		//Ŭ����(static)�޼���� ��ü ���� ���� Ŭ����.�޼���� ȣ��
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));
		
		//�ν��Ͻ��޼���� �ν��Ͻ��� ���� �� ���
		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 100L;
		
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}

}
