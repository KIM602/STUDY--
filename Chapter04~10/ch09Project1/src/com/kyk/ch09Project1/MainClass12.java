package com.kyk.ch09Project1;

public class MainClass12 {

	public static void main(String[] args) {
		//숫자형태의 문자열을 기본형이나 wrapper 인스턴스로 변환
		int i = new Integer("100").intValue();
		int i2 = Integer.parseInt("100"); //parse는 기본형으로 변환
		Integer i3 = Integer.valueOf("100"); //valueOf는 인스턴스로 변환
		
		//숫자형 문자열에 진법 적용
		int i4 = Integer.parseInt("100",2); //100은 2진수, 출력은 10진수
		int i5 = Integer.parseInt("100",8);
		int i6 = Integer.parseInt("100",16);
		int i7 = Integer.parseInt("FF",16);
		//int i8 = Integer.parseInt("FF"); 진법이 없으므로 10진수인데 10진수에는 FF가 없음
		//NumberFormatException발생
		
		Integer i9 = Integer.valueOf("100",2);
		Integer i10 = Integer.valueOf("100",8);
		Integer i11 = Integer.valueOf("100",16);
		Integer i12 = Integer.valueOf("FF",16);
		//Integer i13 = Integer.valueOf("FF"); //NumberForException발생
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println("100(2) -> "+i4);
		System.out.println("100(8) -> "+i5);
		System.out.println("100(16) -> "+i6);
		System.out.println("FF(16) -> "+i7);
		
		//wrapper클래스 인스턴스는 자동으로 데이터형Value()가 붙어서 실행되어 기본형으로 출력
		//intValue(), longValue(), floatValue()...
		System.out.println("100(2) -> "+i9);
		System.out.println("100(8) -> "+i10);
		System.out.println("100(16) -> "+i11);
		System.out.println("FF(16) -> "+i2);
	}
}