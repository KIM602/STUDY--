package com.kyk.ch09Project1;

public class QuizMain {

	public static void main(String[] args) {
		System.out.println("//1번");
		String greeting = "Hello";
		System.out.println(greeting);
		
		System.out.println("//2번");
		int length = greeting.length();
		System.out.println(length);
		
		System.out.println("//3번");
		greeting = greeting.toUpperCase();
		System.out.println(greeting);
		
		System.out.println("//4번");
		String firstName = "John ";
		String lastName = "Doe";
		StringBuffer sbf = new StringBuffer();
		sbf.append(firstName);
		sbf.append(lastName);
		String concat = sbf.toString();
		System.out.println(concat);
		//System.out.println(firstName + lastName));
		
		System.out.println("//5번");
		kkk(firstName, lastName);
		System.out.println(kkk(firstName, lastName));
		// System.out.println(firstName.concat(lastName));
		
		System.out.println("//6번");
		String HE = new String("Hello Everybody");
		System.out.println(HE.indexOf("e"));
		//int java.lang.String.indexOf(String str)
		
		System.out.println("//7번");
		Integer myInt = 5;
		Double myDouble = 5.99;
		Character myChar = 'A';
		
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(myChar);
		
	}

	private static String kkk(String firstName, String lastName) {
		return firstName + lastName;
	}

}

/*
 * 1. 문자열 변수 greeting을 선언하고 초기값을 Hello로 설정
 * 2. 1번 문제의 greeting변수의 문자수를 구해서 출력 하시오
 * 3. 1번 문제의 문자열을 전부 대문자로 변환하세요
 * 4. fistName = "John ";이고  lastName = "Doe";인데 두개를 연결한 문자열을 출력하시오
 * 5. 4번 문제를 메서드를 사용하여 연결하시오
 * 6. txt = "Hello Everybody";인데 이 문자열에서 맨처음 e가 나오는 색인번호를 출력하세요
 * 7. Integer인스턴스 myInt를 선언하고 초기값 5를 설정
 *    Double인스턴스 myDouble를 선언하고 초기값 5.99를 설정
 *    Character인스턴스 myChar를 선언하고 초기값 'A'를 설정
 *    각 값을 출력하시오
 */