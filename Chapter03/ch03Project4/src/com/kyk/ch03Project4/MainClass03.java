package com.kyk.ch03Project4;

public class MainClass03 {

	public static void main(String[] args) {
		int x = 10;
		int y = 8;
		
		System.out.printf("%d��%d�� ������,%n",x,y);
		System.out.printf("���� %d�̰�, �������� %d�Դϴ�.%n", x/y,x%y);
		
		//x % y���� %�� ������ ���ϱ� ������(��ⷯ��������)�� ������ �� ��ȯ
		//printf�� ��¹� �� ������ ������ �� ��� %d�����ڴ� 10������ ǥ��, %n�� �ٹٲٱ�
		
		boolean b = (0.1 == 0.1f); //==�� �������� ��
		System.out.println(b);
		double a = 0.1;
		float c = 0.1f;
		
	}

}
