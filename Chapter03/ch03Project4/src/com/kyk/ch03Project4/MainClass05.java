package com.kyk.ch03Project4;

import java.util.Scanner;

public class MainClass05 {

	public static void main(String[] args) {
		//Ű���� �Է��� �޾Ƶ��̴� ��ü Scanner��ü �����
		//()�ӿ� ���� �Ķ����(����)�� System.in
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.println("���ڸ� �ϳ� �Է��ϼ���.>");
		
		String input = scanner.nextLine(); //����Ű�� ������ �׶����� �Է��� ���� ��ȯ
		ch = input.charAt(0);
		System.out.println("ch[0] : " + ch);
		//charAt(���ι�ȣ)�޼���� StringŬ������ �����ϴ� �޼���� ���ι�ȣ�� ���� ��ȯ
		if(ch >= 0 && ch <= '9' ) {
			//��ȣ���� true�̷��� 0 <= ch <= 9
			//if���� ()���� ����� true���߸� { }������ ����
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
		}
		
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("�Է��Ͻ� ���ڴ� �������Դϴ�.");
		}
		
		//!�����ڴ� ������ �����ڷ� boolean���� �ݴ�� ����
		boolean b = false;
		System.out.println("!b = " + !b);
		
		scanner.close();
	
	}

}
