package com.kyk.ch13Project1;

//main, th1, th2스레드 3개(멀티스레드)
public class MainClass09 {

	public static void main(String[] args) {
		//main스레드에 의해 후손스레드 th1, th2가 생성
		//그룹과 우선순위 5를 상속함
		Thread09_01 th1 = new Thread09_01();
		Thread09_02 th2 = new Thread09_02();
		
		th1.start(); //th1스레드 실행가능상태, run메서드를 실행
		th2.start(); //th2스레드 실행가능상태, run메서드를 실행
		//main스레드는 계속 진행
		
		try {
			Thread.sleep(2000);
		}
		catch (Exception e) {
			e.getMessage();
		}
		System.out.print("<<main 종료>>");
	}

}

class Thread09_01 extends Thread {
	@Override
	public void run() {
		for(int i = 0 ; i < 300 ; i++) {
			System.out.print("-");
		}
		
		System.out.print("<<th1 종료>>");
	}
}

class Thread09_02 extends Thread {
	@Override
	public void run() {
		for(int i = 0 ; i < 300 ; i++) {
			System.out.print("*");
		}
		
		System.out.println("<<th2 종료>>");
	}
	
}
