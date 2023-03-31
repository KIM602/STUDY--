package com.kyk.ch02Project2;

public class Ch02Ex01 {

	public static void main(String[] args) {
		//변수 선언
		int x = 10; //int형(정수, 4바이트형)인 변수 x에 우변의 값 10을 저장(대입)
		int y = 5;
		//변수이름를 사용하면 변수에 저장된 값이 사용
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		
		//변수의 데이터형
		int z = 100; //4바이트, 정수형
		double pi = 3.14; //8바이트, 실수형
		char ch = 'a'; //2바이트, char형이며 char값은 ' '안에 적어줌
		String str = "abd"; //String은 클래스로 str은 참조형 변수, 문자열 값은 " "안에 넣는다.
		
		System.out.println(z);
		System.out.println(pi);
		System.out.println(ch);
		System.out.println(str);
	}

}
