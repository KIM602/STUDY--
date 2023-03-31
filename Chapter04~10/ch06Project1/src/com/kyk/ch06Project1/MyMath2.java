package com.kyk.ch06Project1;

public class MyMath2 {
	long a, b; //instance 변수
	
	//인스턴스변수를 메서드 안에서 사용하므로 메서드도 인스턴스메서드
	long add() {
		return a + b; //a,b는 객체가 만들어진 후 저장된 객체의 a,b값
	}
	long subtract() {
		return a - b;
	}
	
	long multiply() {
		return a * b;
	}
	
	double divide() {
		return a / b;
	}
	
	//메서드 안에서 인스턴스 변수를 사용하지 않고 파라메터변수(로컬변수)를 사용하므로 인스턴스와 상관없이 static가능
	static long add(long a, long b) {
		//인스턴스 변수 a, b와 파라메터 변수 a, b가 같은 경우에는 로컬 변수인 파라메터 변수 a, b가 우선
		return a + b;
	}
	
	static long subtract(long a, long b) {
		return a - b;
	}
	
	static long multiply(long a, long b) {
		return a * b;
	}
	
	static double divide(long a, long b) {
		return a / (double)b;
	}
} 
