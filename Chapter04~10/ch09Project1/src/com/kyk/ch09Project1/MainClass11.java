package com.kyk.ch09Project1;


//wrapper클래스는 기본형의 클래스형
//Byte, Character, Short, Integer, Long, Float, Double, Boolean 8개임
//클래스이무로 첫 자는 대문자이고, 기본형과 동일하나 char과 int는 약어가 아닌 정식 단어
//숫자형인 Byte, Short, Integer, Long, Float, Double은 상위클래스인 추상클래스 Number를 가짐 
public class MainClass11 {

	public static void main(String[] args) {
		Integer i = new Integer(100); //int의 wrapper사용인데 가급적 사용을 지양
		Integer i1 = 100; //생성자보다 기본형 값 대입
		Integer i2 = new Integer(100);
		
		System.out.println("i == i2 ? " + (i == i2));
		//wrapper클래스의 equals도 값을 비교하도록 자바에서 재정의
		System.out.println("i.equals(i2) ? " + i.equals(i2)); //true
		System.out.println("i.equals(i2) = " + i.compareTo(i2));
		//compereTo메서드는 숫자로 두 숫자를 비교하여 같으면 0, 다르면 0이 아닌 숫자
		System.out.println("i.toString() = " + i.toString());
		//숫자를 문자열로 반환
		System.out.println("MAX_VALUE = " + Integer.MAX_VALUE); //최대 정수값
		System.out.println("MIN_VALUE = " + Integer.MIN_VALUE); //최소 정수값
		System.out.println("SIZE = " + Integer.SIZE + " bits"); //bit수
		System.out.println("BYTES = " + Integer.BYTES + " bytes"); //바이트수
		System.out.println("TYPE = " + Integer.TYPE); //기본데이터형
	}

}
