package com.kyk.ch04Project1;

public class MainClass07 {

	public static void main(String[] args) {
		//for���� �⺻ ������ (�ʱ�ȭ�� ; ���Ǻ� ; ������), �ʿ� ���� �κ��� �Ƚ��൵ ��, ���� ��� �����ݷ����� �����ؾ� ��
		for(int i = 1;i <= 3;i++) {
			System.out.println("Hello");
		}
		
		int sum = 0; //�հ� ����
		for(int i = 1 ; i <= 5 ; i++) { //�ݺ����� i�� for�� �ȿ����� ��� ������ ���� ����)
			sum += i ; //sum = sum + i
			System.out.printf("1���� %2d ������ ��: %2d%n", i, sum);
		}
		
		//��øfor��
		for(int i = 1 ; i <= 5 ; i++) {
			//��ø �ݺ�
			for(int j = 1 ; j <= i ; j++) { //�ܺ� for�� i�� ���� ��ø for���� �ݺ��� ����
				System.out.println("*");
			}
			System.out.println(); //�ٸ� �ٲٴ� ����Ʈ
		}
	}
}
