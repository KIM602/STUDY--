package com.kyk.ch06Project1;

public class MyMath3 {
	int add(int a, int b) {
		System.out.println("int add(int a, int b) - ");
		return a+b;
	}
	
	//���� �޼��� �����ε���(����Ÿ��, �̸� ���� �Ķ���� �̸� ���� �Ķ������ ���������� ���� �ٸ��Ƿ� �����ε�
		int add(int[] a) {
			System.out.println("int add(int[] a) - ");
			int result = 0;
			for(int i = 0 ; i < a.length ;  i++) {
				result += a[1];
			
			}
			return result;
		}
		
	//���� add������ �����ε� �ƴ�(����Ÿ���� Ʋ��)
	long add(int a, long b) {
		System.out.println("long add(int a, long b) - ");
		return a + b;
	}
	
	long add(long a, int b) { //���� �޼���� �Ķ���� �̸��� ���� ���������� �ٸ��Ƿ� �����ε��̴�
		System.out.println("long add(long a, long b) - ");
		return a + b;
	}
	
	long add(long a,long b) { //���� �޼���� �Ķ�����̸��� ���� ���������� �ٸ��Ƿ� �����ε���
		System.out.println("long add(long a, long b) - ");
		return a + b;
	}
}

