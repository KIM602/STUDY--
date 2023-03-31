package com.kyk.ch13Project1;

public class QuizClass {

	public static void main(String[] args) {
		QuizThread1 th1 = new QuizThread1();
		Runnable r = new QuizThread2();
		Thread th2 = new Thread(r);
		//Thread th3 = new Thread(new QuizThread2());
		th1.start();
		th2.start();
		
		while(th1.isAlive()) {
			System.out.println("Waiting...");
		}
		
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			e.getMessage();
		}
		
		System.out.println("main의 마지막라인 입니다.");
	}

}

class QuizThread1 extends Thread {
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
		System.out.println("QuizThread1");
		}
	}
}

class QuizThread2 implements Runnable {
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("QuizThread2");
		}
	}
}

/*
 *1. Thread클래스를 상속한 클래스 QuizThread1를 만듬
 *   재정의 하는 메서드의 코드는 QuizThread1스레드 10번 출력
 *2. 인터페이스를 구현하는 방식의 클래스 QuizThread2를 만듬
 *   재정의 메서드의 코드는 QuizThread2스레드 10번 출력
 *3. 메인메서드에서 QuizThread1의 인스턴스 th1을 만듬
 *   메인메서드에서 QuizThread2의 인스턴스 th2를 만듬
 *   스레드 시작
 *4. main메서드 마지막 줄애 "main의 마지막라인 입니다." 출력
 *   그 위에 while(th1.isAlive()) {
 *   	System.out.prinln("Waiting..."); 넣어서 출력 해볼것
 *   }
 *5. 마지막 줄 위에 스레드를 3초 정지
 */
