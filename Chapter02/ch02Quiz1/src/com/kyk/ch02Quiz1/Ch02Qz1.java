package com.kyk.ch02Quiz1;

public class Ch02Qz1 {

	public static void main(String[] args) {
		/*
		 * 문제 1 : I am learning Java를 출력하고 줄을 바꾸세요.
		 * 문제 2 : 5 * 6 값을 출력하고 줄을 바꾸세요.
		 * 문제 3 : 한줄짜리 주석 이곳은 한줄 주석입니다 만들기
		 * 문제 4 : 여러줄 수용 주석 이곳은 1번째 줄 주석, 이곳은 2번째 줄 주석을 만드세요.
		 * 문제 5 :
		 *   4바이트 정수 myNum을 만들고 5를 대입(정수값의 기본형은 4바이트 정수)
		 *   4바이트 실수 myFloatNum을 만들고 5.99f 대입
		 *   2바이트 문자형변수 myLetter를 만들고 D를 대입
		 *   1바이트 논리형변수 myBool을 만들고 false를 대입
		 *   문자열 변수 myText를 만들고 Hello값 대입
		 *   8바이트 정수 변수 myLong을 만들고 5000L을 대입
		 *   8바이트 실수 myDouble을 만들고 11.22를 대입(실수값의 기본형은 더블형)
		 *   
		 *   위의 변수들을 출력하세요.
		 */
		
		
		System.out.println("I am learning Java");
		System.out.println(5*6);
		//이곳은 한줄 주석입니다.
		/* 
		 * 이곳은 첫번째 줄 주석
		 * 이곳은 두번째 줄 주석
		 */
		int myNum = 5;
		float myFloatNum = 5.99f; //f는 float값을 나타내는 접미사
		char myLetter = 'D'; //char값은 ' '안에 넣어줌
		boolean myBool = false; //boolean값은 true와 false 두개만 있음
		String myText= "Hello"; //String값은 " "안에 넣어주고 기본형 변수가 아니고 참조형임
		long myLong = 5000L; //long형 값에는 뒤에 L을 첨가
		double myDouble = 11.22; //실수값 기본형은 double형임
		//변수 출력시는 변수 이름을 넣어주면 됨
		
		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(myText);
		System.out.println(myLong);
		System.out.println(myDouble);
		
		//이클립스에서는 저장하면 자동으로 컴파일되어 바이트코드(기계어)인 .class파일을 만듬
	}

}
