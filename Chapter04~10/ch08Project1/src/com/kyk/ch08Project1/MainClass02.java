package com.kyk.ch08Project1;

public class MainClass02 {

	public static void main(String[] args) {
		System.out.println(1);
	
		try {
			System.out.println(0/0); //���п��� ó�� ���ϴ� ���(���� �߻��ϴµ� ArithmeticException���� �߻�)
			//���ܰ� �߻��ϸ� �ش� ���ܸ� ó���ϴ� catch��Ͽ��� �̸� ó���Ͽ� ���α׷� ���� ���� ���� �ܰ踦 ����
			//���ܹ߻� ������� �� ������ try���� ���� �ȵ�
			System.out.println(2);
		}
		
		catch(ArithmeticException ae) {
			//ArithmeticException Ŭ������ ������꿹�ܸ� ó���ϴ� Ŭ������ java.lang�� �־� import �ʿ� ����
			System.out.println(3);
		}
		System.out.println(4);
		
		System.out.println(5/0); //����ó�� �ȵ�
		//���ܹ߻� ���� �ڵ�� ������ ����
		System.out.println(5);
	}

}
