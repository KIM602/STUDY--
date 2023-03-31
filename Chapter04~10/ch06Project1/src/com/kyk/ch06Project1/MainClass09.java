package com.kyk.ch06Project1;

public class MainClass09 {

	public static void main(String[] args) {
		//클래스(static)메서드는 객체 생성 없이 클래스.메서드로 호출
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));
		
		//인스턴스메서드는 인스턴스를 생성 후 사용
		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 100L;
		
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}

}
