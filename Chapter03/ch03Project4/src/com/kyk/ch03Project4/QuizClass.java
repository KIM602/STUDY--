package com.kyk.ch03Project4;

public class QuizClass {

	public static void main(String[] args) {
		/*
		 * 1. 10 ���ϱ� 5�� ���
		 * 2. 10 ������ 5�� ���
		 * 3. 10�� 3���� ���� �������� ���
		 * 4. x�� 10���� �����ϰ� ���������ڸ� �̿��Ͽ� 1�� ���� ��Ŵ
		 * 5. x���� 5�� ���Ͽ� x�� ����
		 * 6. x���� 7�� ���� �������� x�� ����
		 */
		
		System.out.println(10 * 5);
		System.out.println(10 / 5);
		System.out.println(10 % 3);
		
		int x = 10;
		System.out.println(++x);
		System.out.println(x++);
		
		x +=5;
		x %= 7;
	}
}
