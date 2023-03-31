package com.kyk.ch02Project6;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//콘솔창에서 입력을 받는 것을 처리하는 클래스
		//new는 생성자를 호출하는 키워드
		//생성자는 특수 메서드로 클래스이름과 이름이 동일하고 리턴타입이 없음
		
		System.out.print("안내 : 두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
		//nextLine()메서드는 엔터를 치기 전까지 입력한 값을 반환
		//next()메서드는 공백을 만나면 입력값을 반환
		//nextLine()은 입력한 값을 String(문자열)로 반환
		//nextLine()은 입력전까지는 대기
		int num = Integer.parseInt(input);
		//Integer클래스로 자바가 제공하며 정수 관련 처리 클래스이다.
		//parseInt(문자열)메서드는 문자열로 변경해주는 메서드이며 정수형 문자열만 사용이 가능
		
		System.out.println("입력내용 :"+input);
		System.out.printf("num=%d%n",num);
		
	}

}
