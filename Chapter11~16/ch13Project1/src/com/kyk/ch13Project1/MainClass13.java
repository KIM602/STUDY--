package com.kyk.ch13Project1;

public class MainClass13 {

	public static void main(String[] args) {
		//Thread�� �������� ����ϴ� �ν��Ͻ� ����
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

//����Ŭ������ ThreadA�� ThreadB�� �������� ���
class WorkObject {
	public synchronized void methodA() { //ThreadA�� ���
		System.out.println("ThreadA�� methodA() �۾� ����");
		notify(); //��� ������ �ٸ� �����带 ���డ�� ���·� ����,  Object�� �޼����̹Ƿ� ����� workObject�� �޼���
		try {
			wait(); //�������� �����带 ������ Ǯ�� ����
		}
		catch(Exception e) {
			e.getMessage();
		}
	} 
	
	public synchronized void methodB() { //ThreadB���� ���
		System.out.println("ThreadB�� methodB() �۾� ����");
		notify();
		try {
			wait(); //�������� �����带 ������ Ǯ�� ����
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
}