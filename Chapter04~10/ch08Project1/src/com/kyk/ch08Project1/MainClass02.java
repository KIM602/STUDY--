package com.kyk.ch08Project1;

public class MainClass02 {

	public static void main(String[] args) {
		System.out.println(1);
	
		try {
			System.out.println(0/0); //수학에서 처리 못하는 계산(예외 발생하는데 ArithmeticException예외 발생)
			//예외가 발생하면 해당 예외를 처리하는 catch블록에서 이를 처리하여 프로그램 종료 없이 다음 단계를 실행
			//예외발생 문장부터 그 이후의 try문은 실행 안됨
			System.out.println(2);
		}
		
		catch(ArithmeticException ae) {
			//ArithmeticException 클래스는 산술연산예외를 처리하는 클래스로 java.lang에 있어 import 필요 없음
			System.out.println(3);
		}
		System.out.println(4);
		
		System.out.println(5/0); //예외처리 안됨
		//예외발생 다음 코드는 실행을 안함
		System.out.println(5);
	}

}
