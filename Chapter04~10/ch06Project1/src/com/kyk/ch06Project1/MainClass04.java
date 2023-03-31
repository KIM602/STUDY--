package com.kyk.ch06Project1;

public class MainClass04 { //public은 접근 제한자로 어떤 패키지의 클래스에서 접근
	//클래스의 구성 요소는 멤버변수, 멤버메서드, 생성자(생성자가 명시적으로 보이지 않을 시 기본 생성자가 있음) 
	//필요한 구성 요소만 작성(메서드와 기본생성자만 있음)
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		//클래스멤버변수 접근은 클래스이름.클래스변수명으로 접근
		Card c1 = new Card(); //Card클래스의 기본 생성자를 이용하여 인스턴스 생성
		c1.kind = "Heart"; //kind는 인스턴스변수이므로 인스턴스명.인스턴스변수명으로 접근
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
		
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		//c1객체의 width, height 변경은 static값을 변경
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
		//static값이 변경되었으므로 c2도 변경
	}

}

class Card { //접근제한자 없는 경우는 friendly 또는 default이며 동일 패키지에서만 접근 가능
	String kind; //인스턴스 멤버 변수
	int number; //인스턴스 멤버 변수
	static int width = 100; //클래스멤버변수(static, 공유) 선언시에 값을 저장
	static int height = 250;
	//Card클래스는 멤버변수와 기본생성자만 있고 메서드는 없음
}