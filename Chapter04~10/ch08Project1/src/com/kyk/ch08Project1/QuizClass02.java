package com.kyk.ch08Project1;

public class QuizClass02 {

	public static void main(String[] args) {
		try {
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
			//ArithmeticException a = new ArithmeticException("Access denied - You must be at least 18 years old.");
			//throw a;
	}
		catch (ArithmeticException a) {
			System.out.println("에러메시지 : " + a.getMessage());
		}
		
		checkAge(15);
		
		try {
			my();
		}
		
		catch(MyException kk) {
			System.out.println(kk.getMessage());
		}
	}
	
	static void checkAge(int age) throws ArithmeticException {
		System.out.println("dddd");
	}
	
	static void my() throws MyException {
		throw new MyException("하이");
	}
}

class MyException extends Exception {
	MyException(String msg) {
		super(msg);
	}
}
