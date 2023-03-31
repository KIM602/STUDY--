package com.kyk.ch07Project1;

//상속하는 클래스가 없는 경우 extends Object가 생략 되어 있음
//Object는 자바의 최상위클래스로 11개의 메서드를 가지고 있음
public class Tv extends Object {
	
	//멤버 인스턴스 변수
	boolean power; //기본값 false가 저장
	int channel; // 기본값은 0
	
	//인스턴스 멤버 메서드
	void power() {
		power = !power;
		//return; void시는 return문 생략 가능
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
	
	//생성자가 명시적으로 보이지 않으므로 기본 생성자가 숨겨져있음
	/*
	 * public Tv( ) {  } 
	 */
}
