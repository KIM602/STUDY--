package com.kyk.ch03Project3;

public class MainClass {

	public static void main(String[] args) {
		int i = -10; // -�� ��ȣ�� ��Ÿ���� ������, ������ ����(����)
		i = +i; // i�� +��ȣ ���� ( *1) �̹� ������� ������ ���ÿ��� ���� �̸��� ���
		System.out.println(i);
		
		i = -10;
		i = -i; // -i�� -����( * -1)
		System.out.println(i);
	}

}
