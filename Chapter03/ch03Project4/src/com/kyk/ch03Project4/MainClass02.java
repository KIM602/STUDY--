package com.kyk.ch03Project4;

public class MainClass02 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		
		//byte c = a + b; byte, short, char���� int���� �����Ƿ� ���� �� �ǿ����ڸ� int�� ����ȯ�ؼ� �����ϸ� ����� int
		//byte c = (byte)a + b; a�� byte�� ����ȯ�ϴ��� ���� b�� ����� int�� �Ǿ� ����
		byte c = (byte)(a + b); // a + b�� ������ int�̳� ����� ����ȯ (byte)�� ����ȯ �Ͽ� ���� ����
		
		int a1 = 2000000;
		int b1 = 1000000;
		
		//long c1 = a1 * b1; // int * int�� int�ε� ���� int�� ���� 2100000000�̿��� �����÷ο� �Ǿ� ���� �����ϰ� ��
		long c1 = (long)a1 * b1; //long * int�� long * long ������ �ϰ� ����� long���� ����
		System.out.println(c1);
		
	}

}
