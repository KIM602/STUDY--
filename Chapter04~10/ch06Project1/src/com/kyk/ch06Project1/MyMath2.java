package com.kyk.ch06Project1;

public class MyMath2 {
	long a, b; //instance ����
	
	//�ν��Ͻ������� �޼��� �ȿ��� ����ϹǷ� �޼��嵵 �ν��Ͻ��޼���
	long add() {
		return a + b; //a,b�� ��ü�� ������� �� ����� ��ü�� a,b��
	}
	long subtract() {
		return a - b;
	}
	
	long multiply() {
		return a * b;
	}
	
	double divide() {
		return a / b;
	}
	
	//�޼��� �ȿ��� �ν��Ͻ� ������ ������� �ʰ� �Ķ���ͺ���(���ú���)�� ����ϹǷ� �ν��Ͻ��� ������� static����
	static long add(long a, long b) {
		//�ν��Ͻ� ���� a, b�� �Ķ���� ���� a, b�� ���� ��쿡�� ���� ������ �Ķ���� ���� a, b�� �켱
		return a + b;
	}
	
	static long subtract(long a, long b) {
		return a - b;
	}
	
	static long multiply(long a, long b) {
		return a * b;
	}
	
	static double divide(long a, long b) {
		return a / (double)b;
	}
} 
