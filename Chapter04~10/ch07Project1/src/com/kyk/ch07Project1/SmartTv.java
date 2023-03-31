package com.kyk.ch07Project1;

//extends키워드를 사용하여 Tv클래스를 상속
//Tv는 parent클래스이고 SmartTv는 child클래스이다.
public class SmartTv extends Tv {
	//Tv클래스(Object클래스가 포함됨)를 상속
	//상속은 멤버변수와 멤버메서드만 상속하고 생성자와 초기화블록은 제외
	//Tv클래스의 멤버변수에 추가하여 사용할 멤버변수
	boolean caption;
	//Tv클래스의 멤버메서드에 추가하여 사용할 멤버 메서드
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
	
	//기본형 생성자는 묵시적
}
