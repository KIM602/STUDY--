package com.kyk.ch03Project4;

public class MainClass {

	public static void main(String[] args) {
		double d = 85.4; //8바이트 실수형
		int score = (int)d; //더 큰 범위의 double에서 작은 int로 형변환시는 명시적 형변환을 한다. ( )는 형변환 연산자임.
		//실수에서 int로 형변환하면 소수점은 제거
		System.out.println("score=" + score);
		System.out.println("d=" + d);
		
	}

}
