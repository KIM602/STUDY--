package com.kyk.ch09Project1;

public class MainClass03 {

	public static void main(String[] args) {
		Card c1 = new Card(); //각각의 주소를 갖는 참조변수 인스턴스
		Card c2 = new Card();
		
		//toString()은 오버라이드 안하고 Object것으로 사용
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		//String java.lang.Object.toString()
		//java.lang.Object클래스의 toString()로 리턴타입은 String
		
		Card2 c21 = new Card2(); //파라메터없는 생성자 호출
		Card2 c22 = new Card2("HEART", 10); //파라메터 두개를 지닌 생성자 호풀
		
		System.out.println(c21.toString());
		System.out.println(c22.toString());
		
	}
}

class Card {
	String kind;
	int number;
	
	Card() {
		this("SPACE", 1); //다른 생성자 호출
	}
	
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
}

class Card2 {
	String kind;
	int number;
	
	Card2() {
		this("SPADE", 1); //다른 생성자 호출
	}
	
	Card2(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	//toString메서드 오버라이드(클래스의 멤버 값들을 변환시 사용)
	@Override
	public String toString() {
		return " kind : " + kind + ", number : " + number;
	}
}
