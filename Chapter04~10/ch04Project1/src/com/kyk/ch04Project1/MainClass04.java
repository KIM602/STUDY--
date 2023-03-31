package com.kyk.ch04Project1;

import java.util.Scanner;

public class MainClass04 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.println("점수를 입력해주세요.>");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		System.out.printf("당신의 점수는 %d입니다.%n", score);
		
		if(score >= 90) {
			grade = 'A';
			//내부 if문으로 중첩 if문이라 한다
			//내부 if문은 외부 if문의 조건을 만족한 경우에만 적용
			if(score >= 98) {
				opt = '+';
			}
			else if(score < 94) {
				opt = '-';
			}
		}
		else if(score >= 80) {
			grade = 'B';
			if(score >= 88) {
				opt = '+';
			}
			else if(score < 84) {
				opt = '-';
			}
		}
		else {
			grade = 'C';
		}
		
		System.out.printf("당신의 학점은 %c%c입니다.%n",grade,opt);
		//%c는 char형 지시자
		
		scanner.close();
	}

}
