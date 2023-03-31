package com.kyk.ch07Project1;

public class MainClass04 {

	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		
		System.out.println("x = " + p.x + ",y = " + p.y + ",z = " + p.z);
		
	}
}

class Point {
	int x, y;
	
	Point(int x, int y) { //return type이 없고 클래스명과 이름이 동일한 메서드는 생성자
		//생성자의 보통은 파라메터 값을 받아 멤버변수 값을 초기화 하는데 사용
		this.x = x; //파라메터의 변수명과 멤버변수의 변수명이 같을 시 this로 구분
		this.y = y;
		
	}
}

class Point3D extends Point {
	int z; //int x,y는 상속된 멤버변수이므로 작성 필요 없음
	
	//생성자
	Point3D(int x, int y, int z) {
		//자식 클래스는 부모클래스의 생성자를 첫 줄에서 호출해야 하는데 부모 클래스 생성자가 기본형이 아니면 명시적으로 작성
		super(x,y); //부모클래스의 생성자 호출로 x,y를 설정, 부모클래스의 x,y는 상속한 자식클래스의 변수에도 설정
		this.z = z;
		
	}
}