package com.kyk.ch03Project4;

public class QuizClass {

	public static void main(String[] args) {
		/*
		 * 1. 10 곱하기 5를 출력
		 * 2. 10 나누기 5를 출력
		 * 3. 10을 3으로 나눈 나머지를 출력
		 * 4. x를 10으로 선언하고 증감연산자를 이용하여 1을 증가 시킴
		 * 5. x값에 5를 더하여 x에 저장
		 * 6. x값에 7로 나눈 나머지를 x에 대입
		 */
		
		System.out.println(10 * 5);
		System.out.println(10 / 5);
		System.out.println(10 % 3);
		
		int x = 10;
		System.out.println(++x);
		System.out.println(x++);
		
		x +=5;
		x %= 7;
	}
}
