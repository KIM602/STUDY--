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
		
		System.out.println("main�� ���������� �Դϴ�.");
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
 *1. ThreadŬ������ ����� Ŭ���� QuizThread1�� ����
 *   ������ �ϴ� �޼����� �ڵ�� QuizThread1������ 10�� ���
 *2. �������̽��� �����ϴ� ����� Ŭ���� QuizThread2�� ����
 *   ������ �޼����� �ڵ�� QuizThread2������ 10�� ���
 *3. ���θ޼��忡�� QuizThread1�� �ν��Ͻ� th1�� ����
 *   ���θ޼��忡�� QuizThread2�� �ν��Ͻ� th2�� ����
 *   ������ ����
 *4. main�޼��� ������ �پ� "main�� ���������� �Դϴ�." ���
 *   �� ���� while(th1.isAlive()) {
 *   	System.out.prinln("Waiting..."); �־ ��� �غ���
 *   }
 *5. ������ �� ���� �����带 3�� ����
 */
