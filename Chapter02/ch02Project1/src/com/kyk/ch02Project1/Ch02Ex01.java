package com.kyk.ch02Project1;

public class Ch02Ex01 {
	public static void main(String[] args) {
		System.out.println("Hello, world"); //문자열 Hello, world를 출력하고 줄바꿈,ln=line new
		System.out.print("Hello"); //화면에 Hello를 출력하고 줄바꿈 안한다.
		System.out.println("World");
		//System.out은 println이나 print를 가진 객체
		
		System.out.print("3+5="); //" "안의 내용은 문자열로 그대로 표시
		System.out.println(3+5); //" "가 아닌 계산식은 계산된 결과가 나옴
		
		//사칙연산 출력
		System.out.println(5+3); //연산의 결과값 출력
		System.out.println(5-3);
		System.out.println(5*3); //곱하기 연산
		System.out.println(5/3); //나누기는 정수값(소수점이 없는 수)만 나옴(1, 정수/정수이므로 정수 나옴)
		
		
	}
}
