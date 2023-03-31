package com.kyk.ch13Project1;

public class MainClass13 {

	public static void main(String[] args) {
		//Thread가 공동으로 사용하는 인스턴스 생성
		WorkObject sharedObject = new WorkObject();
		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject);
		
		threadA.start();
		threadB.start();
	}

}

class ThreadA extends Thread {
	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10 ; i++) {
			workObject.methodA();
			
		}
	}
}

class ThreadB extends Thread {
	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i =0 ; i < 10 ; i++) {
			workObject.methodB();
		}
	}
}

//공유클래스로 ThreadA와 ThreadB가 공동으로 사용
class WorkObject {
	public synchronized void methodA() { //ThreadA가 사용
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify(); //대기 상태의 다른 스레드를 실행가능 상태로 변경,  Object의 메서드이므로 상속한 workObject의 메서드
		try {
			wait(); //실행중인 스레드를 대기상태 풀로 보냄
		}
		catch(Exception e) {
			e.getMessage();
		}
	} 
	
	public synchronized void methodB() { //ThreadB에서 사용
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify();
		try {
			wait(); //실행중인 스레드를 대기상태 풀로 보냄
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
}