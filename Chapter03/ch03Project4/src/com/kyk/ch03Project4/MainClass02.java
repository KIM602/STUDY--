package com.kyk.ch03Project4;

public class MainClass02 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		
		//byte c = a + b; byte, short, char형은 int보다 적으므로 연산 전 피연산자를 int로 형변환해서 연산하며 결과도 int
		//byte c = (byte)a + b; a를 byte로 형변환하더라도 뒤의 b와 연산시 int로 되어 에러
		byte c = (byte)(a + b); // a + b의 연산은 int이나 명시적 형변환 (byte)로 형변환 하여 에러 없음
		
		int a1 = 2000000;
		int b1 = 1000000;
		
		//long c1 = a1 * b1; // int * int는 int인데 값이 int의 범위 2100000000이여서 오버플로우 되어 값이 엉뚱하게 됨
		long c1 = (long)a1 * b1; //long * int는 long * long 연산을 하고 결과도 long으로 나옴
		System.out.println(c1);
		
	}

}
