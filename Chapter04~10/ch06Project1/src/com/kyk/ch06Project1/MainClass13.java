package com.kyk.ch06Project1;

public class MainClass13 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
	}

}

class Car2 {
	String color;
	String gearType;
	int door;

	Car2() {
		this("white", "auto", 4); //다른 생성자를 호출, 맨 첫줄에서 함
	}
	
	Car2(String color) {
		this(color, "auto", 4);
	}
	
	Car2(String color, String gearType, int door) {
		//this는 클래스의 객체 자신
		//멤버변수명과 파라메터명이 같을 시 혼돈을 피하기 위해 멤버변수 앞에 this를 붙임
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

