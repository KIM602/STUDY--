package com.kyk.ch09Project1;

//String클래스는 변경불가능(immutable) final클래스이다.
//인스턴스 생성시 값으로 생성시는 값이 같으면 같은 주소를 갖는 동일 객체이다.
//new생성자 사용시에는 값이 같더라도 다른 인스턴스(주소값이 다른 참조변수)
//equals는 Object의 메서드를 String에서 오버라이드하여 값을 비교한다.
// == 연산자 비교는 값비교가 아닌 참조변수 주소 비교

public class MainClass04 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		//값으로 초기화하고 값이 같으므로 동일 주소를 갖는 인스턴스
		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");
		
		System.out.println("str1 == str2 ? " + (str1 == str2));
		//==연산자로 비교하므로 주소 비교 (true)
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		//equals는 값을 비교 (true)
		
		System.out.println();
		String str3 = new String("abc");
		String str4 = new String("abc");
		//new생성자를 사용하면 다른 주소를 지닌 인스턴스변수를 만듬
		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String STR4 = NEW String(\"abc\");");
		
		System.out.println("str3 == str4 ? " + (str3 = str4));
		//==는 주소비교(false)
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));
		//값 비교(true)
	}

}
