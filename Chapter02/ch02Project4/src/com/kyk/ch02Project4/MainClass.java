package com.kyk.ch02Project4;

public class MainClass {

	public static void main(String[] args) {
		int x = 10, y = 5;
		//������ ������ ���� ���� �ΰ��� ������ ���ٿ� ǥ��
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		
		int tmp = x; //�� �������� ��ȯ�ϱ� ���ؼ� �ӽ� ������ ����� ���, �׷��� ������ ������ x���� ������
		x = y;
		y = tmp;
		
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		
	}

}
