package com.kyk.ch08Project1;

public class MainClass09 {

	public static void main(String[] args) {
		try {
			method1();
		}
		catch(Exception e) {
			System.out.println("main메서드에서 예외가 처리되었습니다.");
		}
	}
	
	static void method1() throws Exception { //호출한 메서드로 Exception예외처리 위임
		try {
			//예외처리를 위임했지만 자신도 예외처리 함(재처리)
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			throw e; //예외를 재발생 시킴(throws로 예외처리)
		}
	}

}
