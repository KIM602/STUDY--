package com.kyk.ch06Project1;

public class MainClass03 {

	public static void main(String[] args) {
		Tv1 t1 = new Tv1(); //t1�� �ּҸ� ����
		Tv1 t2 = new Tv1(); //t1�� �ٸ� �ּ�
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
		t2 = t1; //��ü(����������)�� �����ϸ� ������������ �ּҰ��� ����
		
		t1.channel = 7;
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
	}

}
