package com.kyk.ch04Project1;

import java.util.Scanner;

public class MainClass03 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.println("������ �Է��ϼ���.>");
		Scanner scanner = new Scanner(System.in);
		//���� ���� ���� ��Ű���� ������ ��Ű���� Ŭ�����̰ų� java.lang���� �����ϴ� Ŭ������ �ƴ� ��쿡�� import �ؾ��Ѵ�.
		score = scanner.nextInt(); //Ű���带 ���� �Է��ϰ� ���ͽ� ó��-���ڰ� �ƴϸ� ����
		
		//if ~ else if ~ else������ true�� ������ �ش� ����� �����ϰ� if���� ������ �����Ե�
		if(score >= 90) {
			grade = 'A';
		}
		else if(score >= 80) {
			grade = 'B';
		}
		else if(score >= 70) {
			grade = 'C';
		}
		else { //else�� �� ���� ��� ������ ��Ÿ���Ƿ� ( )����
			grade = 'D';
		}
		
		System.out.println("����� ������ " + grade +"�Դϴ�.");
		
		scanner.close();
		
	}
}
