package com.kyk.ch13Project1;

public class MainClass01 {

	public static void main(String[] args) {
		Thread01 t1 = new Thread01();
		//Thread클래스를 상속한 클래스의 인스턴스(즉, 스레드 객체)는 클래스의 생성자로 만듬
		t1.start(); //thread시작, run 메서드를 호출
		
		//runnable을 구현한 클래스의 thread인스턴스
		Runnable r = new Thread02(); //구현한 클래스를 이용하여 Runnable인터페이스의 인스턴스 생성
		Thread t2 = new Thread(r); //Thread의 생성자를 파라메터가 Runnable로 된 생성자 이용
		t2.start(); //Thread02의  run() 호출
		System.out.println("main thread");
	}

}

class Thread01 extends Thread{
	//java.lang에 속한 기본 클래스
	//public class Thread extends Object implements Runnable
	//thread작업을 처리하는 run메서드를 재정의하여 스레드가 할 일을 정의
	@Override
	public void run() {
		System.out.println(getName());
		//상위클래스에서 상속한 getName()은 스레드 이름을 반환
		//Thread이름은 순서대로 Thread-0형태로 주어짐
	}
}

class Thread02 implements Runnable {
	//java.lang에 있는 인터페이스
	//@FunctionalInterface public interface Runnable 추상메서드가 하나만 있는 인터페이스
	@Override
	public void run() { //Thread클래스의 run메서드와 이름, 형식은 같다
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(Thread.currentThread().getName());
			//Thread클래스의 static메서드 currentThread()는 현재 실행중인 Thread객체 반환
		}
		
	}
}