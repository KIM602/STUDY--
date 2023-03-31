package com.kyk.ch08Project1;

public class MainClass03 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); //ArithmeticException예외 발생
			System.out.println(4); //예외 발생 다음이므로 실행 안됨
		}
		
		catch(ArithmeticException ae) {
			if (ae instanceof ArithmeticException) {
				//instanceof연산자를 이용하여 ae가 ArithmeticException의 인스턴스인지 결정
				System.out.println("true");
				//catch문을 처리하면 그 이후의 catch문은 처리 안하고 try~catch문은 종료
			}
			System.out.println(ae.toString());
			System.out.println("RrithmeticException");
		}
		
		catch(Exception e) {
			System.out.println("Exception"); //ArithmeticException 이외의 예외는 여기에서 처리
		}
		System.out.println(6);
	}
}
