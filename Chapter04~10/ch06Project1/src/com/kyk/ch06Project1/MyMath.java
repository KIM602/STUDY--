package com.kyk.ch06Project1;

public class MyMath {
	//static�� ���� �ν��Ͻ�����޼���� ���ÿ��� �ν��Ͻ�����ó�� �ν��Ͻ�.�޼���() 
	long add(long a, long b) { //return type�� long���� add�޼���� �Ķ���ͷ� long���� a,b�� ���´�
		long result = a + b;
		return result; //return type�� long���̹Ƿ� long���� return
	}
	
	long subtract(long a, long b) {
		return a - b;
	}
	
	long multiply(long a, long b) {
		return a * b;
	}
	
	double divide(double a, double b) {
		return a / b;
	}
}
