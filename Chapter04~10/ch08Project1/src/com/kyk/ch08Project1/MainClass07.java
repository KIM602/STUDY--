package com.kyk.ch08Project1;

public class MainClass07 {

	public static void main(String[] args) throws Exception {
		//throws Exception은 예외처리를 main을 호출한 곳으로 위임(jvm)
		method1();
	}
	
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception();
		//고의로 Exception예외를 발생 시켰으나 try~catch로 예외처리를 안하고 throws로 예외를 자기를 호출한 메서드로 위임
	}
}
