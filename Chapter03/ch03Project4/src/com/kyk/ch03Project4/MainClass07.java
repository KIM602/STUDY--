package com.kyk.ch03Project4;

public class MainClass07 {

	public static void main(String[] args) {
		
		double pi = 3.141592;
		long result = Math.round(pi);
		//round(double�� ��)�̸� long������ ��ȯ(�Ҽ��� ù��°���� �ݿø�)
		System.out.println("result : " + result);
		
		//�Ҽ��� �����ڸ��� �̿��Ͽ� �ݿø��� �ڸ��� ��ŭ 10�� �ڸ��� ��ŭ ������ ���ѵ� �� ����ŭ �Ҽ������� ����
		double shortPi = Math.round(pi * 1000) / 1000.0;
		//3.141592 * 1000�� ������ 3141.592�� �Ҽ��� ù��°���� �ݿø� 3142
		//3142 / 1000.0�̸� ������ 3.142
		System.out.println(shortPi);
	}
}
