package com.kyk.ch13Project1;

public class MainClass06 {

	public static void main(String[] args) {
		//main스레드의 우선순위는 기본 5임, NORM_PRIORITY
		Thread06_1 th1 = new Thread06_1();
		Thread06_2 th2 = new Thread06_2();
		//main스레드가 th1, th2스레드를 만들어 5를 상속함
		
		th2.setPriority(7); //th2를 우선순위 7로 변경
		//th2가 많은 cpu작업시간을 가짐
		
		System.out.println("Priority or th1(-) : " + th1.getPriority());
		System.out.println("Priority or th1(-) : " + th2.getPriority());
		
		th1.start();
		th2.start();
		
		//window os가 cpu타입을 설정하기 때문에 우선순위가 꼭 지켜지는 것은 아니다.
	}

}

class Thread06_1 extends Thread {
	@Override
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("-");
			for (int x = 0 ; x < 10000000 ; x++); //{ }을 생략할 수 있음
		}
	}
}

class Thread06_2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("|");
			for (int x = 0 ; x < 10000000 ; x++);
		}
	}
}
