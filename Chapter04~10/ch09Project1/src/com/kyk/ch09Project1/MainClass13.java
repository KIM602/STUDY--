package com.kyk.ch09Project1;

public class MainClass13 {

	public static void main(String[] args) {
		int i = 10;
		//기본형을 wrapper클래스의 인스턴스로 변환(형변환 생략가능)
		Integer intg = (Integer)i; //Integer intg = Integer.valueOf(i);
		//Integer intg = i; 해주면 기본형 i가 자동으로 오토박싱됨
		Object obj = (Object)i; //Object obj = (Object)Integer.valueOf(i);
		
		Long lng = 100L;
		//Long lng1 = new Long(100L); 생성자로 wrapper클래스 인스턴스 생성은 삼가하라
		int i2 = intg + 10; //wrapper참조형과 기본형간의 연산 가능
		//wrapper인스턴스 intg는 언박싱이 되어 기본형으로 바뀜
		long l = intg + lng; //참조형 간의 덧셈도 가능(언박싱에 의해 기본형으로 변환하여 연산)
		
		Integer intg2 = 20; //오토박싱
		int i3 = (int)intg2; //참조형을 기본형으로 형변환도 가능(형변환 생략가능)
		
		Integer intg3 = intg2 + i3; //i3가 오토박싱되어 연산 가능(wrapper클래스간 연산 가능)
		
		//wrapper 인스턴스는 자동으로 기본형으로 찍힘
		System.out.println("i = " + i);
		System.out.println("intg = " + intg);
		System.out.println("obj = " + obj);
		System.out.println("lng = " + lng);
		System.out.println("lntg + 10 = " + i2);
		System.out.println("intg + lng = " + l);
		System.out.println("intg2 = " + intg2);
		System.out.println("i3 = " + i3);
		System.out.println("intg + i3 = " + intg3);
	}
}
