package com.kyk.ch06Project1;

public class MainClass15 {
	//Ŭ���������� ���� ������ �� Ŭ���� �ʱ�ȭ ���(static���) ����
	//Ŭ���� �ε��� static�κ��� ���� �Ŀ� main�޼��� ����
	static int[] arr = new int[10];
	
	static {
		for(int i = 0 ;i < arr.length ; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
	}
		
	public static void main(String[] args) {
		for(int x : arr) {
			System.out.println(x);
		}
	}
}
