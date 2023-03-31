package com.kyk.ch07Project1;

public class MainClass06 {

	public static void main(String[] args) {
		
		Card c = new Card();
		//c.NUMBER = 5; final은 변경이 안되므로 에러
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		
		System.out.println(c.toString());
		
	}

}

class Card extends Object { //extends Object 생략
	/*
	final int NUMBER = 10; //인스턴스 final변수(상수), 원래 상수는 선언시에 초기화 해야함
	final String KIND = "kkkk"; 
	*/
	
	//생성자를 통하여 인스턴스상수(final인스턴스변수-상수)는 초기화가 가능
	final int NUMBER;
	final String KIND;
	
	Card() {
		this("HEART",1); //동일 클래스의 다른 생성자 호출
	}
	
	Card(String kind, int num) {
		 KIND = kind;
		 NUMBER = num;
	 }
	 
	 @Override //재정의 오버라이드를 나타내는 어노테이션 (기능을 수행하는 주석)
	 public String toString() { //부모클래스 Object의 메서드를 재정의
		 return "" + KIND + " " + NUMBER;
	 }
}