package com.kyk.ch06Project1;

//call by reference(참조형 매개변수)
public class MainClass06 {

	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d); //메서드 호출, d는 전달한 값으로 인자라고 부르며 d객체임, static메서드인 change메서드를 static메서드안에서 호줄시는 클래스, 이름이 필요 없음
		//static메서드이므로 객체 만들어서 사용 할 필요 없음
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	
	//메서드 정의
	//static붙은 메서드는 클래스형 메서드
	static void change(Data2 d) { //Dta2객체가 파라메터이므로 call by reference로 전달되는 값이 주소값
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
		//String 객체는 클래스형 객체이나 불변(immutable)객체로 변경해도 호출한 곳에서는 변경이 안됨. 즉, 기본형으로 사용
		//나중에 배우는 StringBuffer나 StringBuild를 사용해야 한다.
	}

}

class Data2 {
	int x; //인스턴스형 변수
	
	//기본형 생성자로 다른 생성자가 없을 시 생략 무방
	//생성자는 리턴타입이 없고 이름이 클래스명인 특수 메서드
	//기본형은 ()의 파라메터가 없음
	public Data2()  {
		super(); //생략해도 무방
	}
}