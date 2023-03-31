package com.kyk.ch03Project2;

public class MainClass {

	public static void main(String[] args) {
		int i = 5, j = 0;
		
		j = ++i; //++는 전위형 증가 연산자로 대입 연산 처리 전 1을 증가하므로 j는 6
		System.out.println("j = ++i; 실행 후, i = " + i + " ,j = " + j);
		
		i = 5;
		j = 0;
		
		j = i++; //후위형 증가 연산자 이므로 대입연산을 먼저 하므로 j=5 그런 후 i는 1 증가하여 6
		System.out.println("j = i++; 실행 후, i = " + i + " ,j = " + j);
		
		i = 5;
		j = 5;
		
		System.out.println(i++); //후위형이므로 출력후에 증가하므로 5
		System.out.println(++j); //전위형이므로 선증가 후처리 하므로 6
	}

}
