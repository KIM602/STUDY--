package com.kyk.ch03Project2;

public class MainClass {

	public static void main(String[] args) {
		int i = 5, j = 0;
		
		j = ++i; //++�� ������ ���� �����ڷ� ���� ���� ó�� �� 1�� �����ϹǷ� j�� 6
		System.out.println("j = ++i; ���� ��, i = " + i + " ,j = " + j);
		
		i = 5;
		j = 0;
		
		j = i++; //������ ���� ������ �̹Ƿ� ���Կ����� ���� �ϹǷ� j=5 �׷� �� i�� 1 �����Ͽ� 6
		System.out.println("j = i++; ���� ��, i = " + i + " ,j = " + j);
		
		i = 5;
		j = 5;
		
		System.out.println(i++); //�������̹Ƿ� ����Ŀ� �����ϹǷ� 5
		System.out.println(++j); //�������̹Ƿ� ������ ��ó�� �ϹǷ� 6
	}

}
