package com.kyk.ch13Project1;

//멀티스레드로 처리(메인스레드와 다른 추가 스레드)
//메인스레드 실행, Thread03실행이 교대로 일어남
public class MainClass03 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		Thread03 th = new Thread03();
		th.start();
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 300; i++)
			System.out.printf("-");
		
		System.out.println("소요시간1 : " + (System.currentTimeMillis() - startTime));
	}

}

class Thread03 extends Thread {
	//Thread클래스를 상속한 방식으로 스레드 만듬
	@Override
	public void run() {
		for(int i = 0; i < 300; i++)
			System.out.printf("%s", new String("|"));
		
		System.out.println("소요시간2 : " + (System.currentTimeMillis() - MainClass03.startTime));
	}
}
