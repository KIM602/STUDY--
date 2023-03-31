package com.kyk.ch06Project1;

//call by value 즉, 메서드 파라메터가 기본형인 경우
public class MainClass07 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x); //메서드 호출(인자가 정수 10, 인자값은 파라메터의 데이터형 값)
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x); //10
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
		//반환형이 void이므로 return생략 가능
		return;
	}

}

class Data {
	int x;
}
