package com.kyk.ch08Project1;

public class MainClass03 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); //ArithmeticException���� �߻�
			System.out.println(4); //���� �߻� �����̹Ƿ� ���� �ȵ�
		}
		
		catch(ArithmeticException ae) {
			if (ae instanceof ArithmeticException) {
				//instanceof�����ڸ� �̿��Ͽ� ae�� ArithmeticException�� �ν��Ͻ����� ����
				System.out.println("true");
				//catch���� ó���ϸ� �� ������ catch���� ó�� ���ϰ� try~catch���� ����
			}
			System.out.println(ae.toString());
			System.out.println("RrithmeticException");
		}
		
		catch(Exception e) {
			System.out.println("Exception"); //ArithmeticException �̿��� ���ܴ� ���⿡�� ó��
		}
		System.out.println(6);
	}
}
