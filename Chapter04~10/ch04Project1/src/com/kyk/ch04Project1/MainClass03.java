package com.kyk.ch04Project1;

import java.util.Scanner;

public class MainClass03 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.println("점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		//내가 만든 현재 패키지와 동일한 패키지의 클래스이거나 java.lang에서 제공하는 클래스가 아닌 경우에는 import 해야한다.
		score = scanner.nextInt(); //키보드를 통해 입력하고 엔터시 처리-숫자가 아니면 에러
		
		//if ~ else if ~ else에서는 true를 만나면 해당 블록을 실행하고 if관련 문으로 나오게됨
		if(score >= 90) {
			grade = 'A';
		}
		else if(score >= 80) {
			grade = 'B';
		}
		else if(score >= 70) {
			grade = 'C';
		}
		else { //else는 그 외의 모든 조건을 나타내므로 ( )없음
			grade = 'D';
		}
		
		System.out.println("당신의 학점은 " + grade +"입니다.");
		
		scanner.close();
		
	}
}
