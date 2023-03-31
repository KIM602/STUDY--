package com.kyk.ch12Project1;

import java.util.HashMap;

public class QuizTest {

	public static void main(String[] args) {
		//1번
		HashMap <String, Integer> map = new HashMap<String, Integer>();
		//제네릭의 타입파라메터는 참조형이어야 한다.
		
		System.out.println("//2번//");
		Product1<String> abc = new Product1<String>();
		//인스턴스를 선언하고 생성시에 실제 적용할 데이터타입을 사용
		
		System.out.println("//3번//");
		Level myVar;
		myVar=Level.MEDIUM;
		System.out.println(myVar);
		
		System.out.println("//4번//"); //values()는 해당 enum의 원소를 반환하는데 원소들은 enum형
		Level[] lv = Level.values();
			for(Level i : lv) {
				System.out.println(i);
			}
		
		System.out.println("//5번//");
		switch(myVar) {
		case LOW: //case문에서는 level을 생략한 상수명만 사용
			System.out.println("LOW");
			break;
		case MEDIUM:
			System.out.println("MEDIUM");
			break;
		case HIGH:
			System.out.println("HIGH");
			break;
		}
	}
	
	enum Level{
		LOW
		,MEDIUM
		,HIGH
	}

}

class Product1<T> { //제네릭 클래스를 만들 시 타입 문자인 T,E,K,V ...를 사용하여 만듬
	T p;
	T example (T t) {
		T ret = t;
		return ret;
	}
}


/*
 * 1. 타입파라메터가 String과 Integer인 map객체를 선언
 * 2. 제네릭클래스 Product를 만듬
 * 		- 타입파라메터를 이용하여 멤버변수 p를 만듬
 * 		- 타입파라메터를 이용하여 리턴타입과 파라메터에 타입파라메터가 적용된 메서드를 만듬
 * 			(  ) example(() t) {
 *				() ret = t
 *				return ret; 
 * 			}
 * 		- main메서드에서 Product객체를 String타입파라메터를 이용하여 만듬
 * 3. QuizTest클래스 안에 enum Level1을 만들고 상수는 LOW, MEDIUM, HIGH를 만듬
 * 	   Level인스턴스 myVar을 선언하고 값은 MEDIUM을 줌
 * 	   myVar값을 출력
 * 4. enum Level의 상수값을 for문을 이용하여 출력
 * 5. Level enum에 switch문 적용
 */