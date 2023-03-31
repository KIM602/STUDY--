package com.kyk.ch03Project4;

public class MainClass04 {

	public static void main(String[] args) {
		String str1 = "abc"; //str1은 참조형 변수
		String str2 = new String("abc"); //참조형 변수
		//두개의 참조형 변수가 만들어짐 (단, 값은 같음)
		
		System.out.printf("\"abc\" == \"abc\"?%b%n", "abc"=="abc");
		//"를 인용부호 " "안에서 사용하려면 \"로 사용 ""abc"" "i \"am\" a boy"
		//%b는 boolean값 출력
		System.out.printf(" str1==\"abc\" ?%b%n",str1=="abc");
		//객체값과 리터럴값이 같을시 ==로 비교하면 true, 즉 값아 같은 리터럴은 같은 객체임
		System.out.printf(" str2==\"abc\" ?%b%n",str2=="abc");
		//str1객체에 저장된 리터럴은 str2객체와는 다름
		System.out.printf("str1.equals(\"abc\") ? %b%n",str1.equals("abc"));
		//printf문에서 표시할 값은 리터럴, 변수, 표현식
		//equals는 객체(주소)는 비교 안하고 값만 비교
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(str1) ? %b%n", str2.equals(str1));
		//str1과 str2는 다른 참조변수인 객체이나 값이 같으므로 true
		System.out.printf("str2.equals(\"ABC\") ? %b%n",str1.equals("ABC"));
		//equals는 대소문자 구분하므로 false
		System.out.printf("str1.equalsIgnoreCse(\"ABC\") ? %b%n",str1.equalsIgnoreCase("ABC"));
		//equalsIgnoreCase()는 대소문자 무시하고 비교
		
	}

}
