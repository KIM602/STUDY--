package com.kyk.ch03Project4;

public class MainClass06 {

	public static void main(String[] args) {
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		//조건연산자(삼항연산자 사용)
		absX = x >= 0 ? x : -x;
		//absX는 조건식의 결과를 저장할 변수 x >= 0는 조건식 ? : 는 조건식 연산자
		//반환값을 저장하는 변수 미사용하면 에러
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		
		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');
		//조건 연산자를 중첩(조건연산자의 내부에서 조건연산자 사용시 중첩사용)
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-');
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-');
		
		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
		
		//조건연산자(삼항연산자)는 if~else if~else if~else의 간략형임
		
		//복합대입 연산자(권고)
		x = x + 5;
		x += 5; //권고
		
		x = x * 5;
		x *= 5;
		
	}
}
