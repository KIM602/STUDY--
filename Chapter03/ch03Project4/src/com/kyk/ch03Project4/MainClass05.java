package com.kyk.ch03Project4;

import java.util.Scanner;

public class MainClass05 {

	public static void main(String[] args) {
		//키보드 입력을 받아들이는 객체 Scanner객체 만들기
		//()속에 들어가는 파라메터(인자)는 System.in
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.println("문자를 하나 입력하세요.>");
		
		String input = scanner.nextLine(); //엔터키를 누를시 그때까지 입력한 값을 반환
		ch = input.charAt(0);
		System.out.println("ch[0] : " + ch);
		//charAt(색인번호)메서드는 String클래스가 제공하는 메서드로 색인번호의 문자 반환
		if(ch >= 0 && ch <= '9' ) {
			//괄호안이 true이려면 0 <= ch <= 9
			//if문은 ()안의 결과가 true여야만 { }안으로 들어옴
			System.out.println("입력하신 문자는 숫자입니다.");
		}
		
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("입력하신 문자는 영문자입니다.");
		}
		
		//!연산자는 논리부정 연산자로 boolean값을 반대로 변경
		boolean b = false;
		System.out.println("!b = " + !b);
		
		scanner.close();
	
	}

}
