package com.kyk.ch04Project1;

import java.util.Scanner;

public class MainClass05 {

	public static void main(String[] args) {
		
		System.out.println("���� ���� �Է��ϼ���.>");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		//month���� switch���� �Ķ���ͷ� ���(���ǽ�)
		//month���� ��ġ�ϴ� case�� ��ó�� �� ���� �� ������ ��ó�� ������ break���� ����
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("������ ������ ���Դϴ�.");
				break; //3,4,5 ��� �̰����� switch���� ����
			case 6: case 7: case 8:
				System.out.println("������ ������ �����Դϴ�.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("������ ������ �����Դϴ�.");
				break;
			default:
				System.out.println("������ ������ �ܿ��Դϴ�.");
		}
		
		System.out.println("switch�� ���Դϴ�.");
		
		scanner.close();
		
	}

}
