package com.kyk.ch08Project1;

public class MainClass04 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); //ArithmeticException 예외발생
			System.out.println(4);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace(); //예외내용과 예외경로내용
			System.out.println("예외메시지 : " + ae.getMessage());
		}
		
		System.out.println(6);
	}

}
