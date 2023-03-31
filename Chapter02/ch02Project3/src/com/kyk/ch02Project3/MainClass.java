package com.kyk.ch02Project3;

public class MainClass {
	//{ }블록 밖에 선언되는 변수는 전역변수로 기본값을 가짐
	/*
	 * boolean은 false, 숫자형은 0, char는 'u\0000', 참조형은 null
	 */
	static int age;
	static String name = "kim";
	static char ch; //기본값이 스페이스
	public static void main(String[] args) {
		//전역변수는 메서드 안에서 사용 가능
		System.out.println(age); //age는 기본 값이므로 0
		System.out.println(name);
		System.out.println(ch);
		//메서드안에서 선언하는 변수는 모두 로컬(지역)변수로 선언과 함게 초기화 값을 주어야만 에러 없음
		String name1 = "Ja" + "Va"; //+는 문자열결합연산자(concate)
		String str = name1 + 8.0; //문자열 + 숫자는 숫자를 문자열로 처리해서 결합
		
		System.out.println(name1);
		System.out.println(str);
		
		System.out.println(7 + " "); //7이 문자열로 처리됨
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + ""); //7 + 7은 숫자이므로 + 연산
		System.out.println("" + 7 + 7);
	}

}
