package com.kyk.ch03Project3;

public class MainClass {

	public static void main(String[] args) {
		int i = -10; // -는 부호를 나타내는 연산자, 변수를 선언(정의)
		i = +i; // i에 +부호 연산 ( *1) 이미 만들어진 변수를 사용시에는 변수 이름만 사용
		System.out.println(i);
		
		i = -10;
		i = -i; // -i에 -연산( * -1)
		System.out.println(i);
	}

}
