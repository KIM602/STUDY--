package com.kyk.ch04Project1;

import java.util.Scanner;

public class MainClass09 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1; //1���� 100������ ������ �� ����
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			//��ó�� �ѹ��� ������ { }�� ����ÿ� ���
			System.out.println("1�� 100������ ������ �Է��ϼ���.>");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");
			}
			else {
				System.out.println("�� ū ���� �ٽ� �õ��غ�����.");
			}
		}while(input != answer); //while() �ڿ� �� ;�� ǥ��
		
		System.out.println("�����Դϴ�.");
		
		scanner.close();
		
	}

}
