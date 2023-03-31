package com.kyk.ch06Project1;

public class MyMath {
	//static이 없는 인스턴스멤버메서드로 사용시에는 인스턴스변수처럼 인스턴스.메서드() 
	long add(long a, long b) { //return type이 long형인 add메서드는 파라메터로 long형인 a,b를 갖는다
		long result = a + b;
		return result; //return type이 long형이므로 long형을 return
	}
	
	long subtract(long a, long b) {
		return a - b;
	}
	
	long multiply(long a, long b) {
		return a * b;
	}
	
	double divide(double a, double b) {
		return a / b;
	}
}
