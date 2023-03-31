package com.kyk.ch08Project1;

public class MainClass06 {

	public static void main(String[] args) {
		//예외에는 Exception계열과 RuntimeException계열로 구분됨
		Exception e = new Exception();
		//throw e; //컴파일 에러 발생
		//throw new Exception(); 한줄로 처리
		//Exception 예외는 try~catch로  예외를 처리 안하면 컴파일 에러(check예외)
		
		throw new RuntimeException(); //컴파일 에러는 없고 프로그램 실행 중 에러 발생(unchecked 예외)
		//실행중에는 예외가 발생하므로 해당 예외를 처리
		//RuntimeException은 Exception의 하위이므로 catch(Exception e)로 예외 처리
	}

}
