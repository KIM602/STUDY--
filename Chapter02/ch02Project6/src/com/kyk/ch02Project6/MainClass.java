package com.kyk.ch02Project6;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//�ܼ�â���� �Է��� �޴� ���� ó���ϴ� Ŭ����
		//new�� �����ڸ� ȣ���ϴ� Ű����
		//�����ڴ� Ư�� �޼���� Ŭ�����̸��� �̸��� �����ϰ� ����Ÿ���� ����
		
		System.out.print("�ȳ� : ���ڸ� ������ �ϳ� �Է����ּ���.>");
		String input = scanner.nextLine();
		//nextLine()�޼���� ���͸� ġ�� ������ �Է��� ���� ��ȯ
		//next()�޼���� ������ ������ �Է°��� ��ȯ
		//nextLine()�� �Է��� ���� String(���ڿ�)�� ��ȯ
		//nextLine()�� �Է��������� ���
		int num = Integer.parseInt(input);
		//IntegerŬ������ �ڹٰ� �����ϸ� ���� ���� ó�� Ŭ�����̴�.
		//parseInt(���ڿ�)�޼���� ���ڿ��� �������ִ� �޼����̸� ������ ���ڿ��� ����� ����
		
		System.out.println("�Է³��� :"+input);
		System.out.printf("num=%d%n",num);
		
	}

}
