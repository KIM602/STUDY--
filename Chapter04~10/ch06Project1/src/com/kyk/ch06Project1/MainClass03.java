package com.kyk.ch06Project1;

public class MainClass03 {

	public static void main(String[] args) {
		Tv1 t1 = new Tv1(); //t1은 주소를 가짐
		Tv1 t2 = new Tv1(); //t1과 다른 주소
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t2 = t1; //객체(참조형변수)를 대입하면 참조변수값인 주소값이 대입
		
		t1.channel = 7;
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
	}

}
