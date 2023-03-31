package com.kyk.ch09Project1;

public class MainClass02 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		//boolean java.lang.String.equals(Object anObject)
		//Object클래스의 equals메서드를 String에서 재정의
		//Object의 equals는 참조변수 주소를 비교하나 재정의 된 equals는 값을 비교
		System.out.println(str1.hashCode());
		//int java.lang.String.hashCode()는 Object의 hashCode를 재정의해서 값이 같으면 같은 해쉬코드값
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		//Sytem.identityHashCode를 사용하면 원래 Object의 hashCode값을 반환
	}

}
