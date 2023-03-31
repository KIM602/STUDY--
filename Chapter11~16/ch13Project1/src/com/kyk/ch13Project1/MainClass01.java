package com.kyk.ch13Project1;

public class MainClass01 {

	public static void main(String[] args) {
		Thread01 t1 = new Thread01();
		//ThreadŬ������ ����� Ŭ������ �ν��Ͻ�(��, ������ ��ü)�� Ŭ������ �����ڷ� ����
		t1.start(); //thread����, run �޼��带 ȣ��
		
		//runnable�� ������ Ŭ������ thread�ν��Ͻ�
		Runnable r = new Thread02(); //������ Ŭ������ �̿��Ͽ� Runnable�������̽��� �ν��Ͻ� ����
		Thread t2 = new Thread(r); //Thread�� �����ڸ� �Ķ���Ͱ� Runnable�� �� ������ �̿�
		t2.start(); //Thread02��  run() ȣ��
		System.out.println("main thread");
	}

}

class Thread01 extends Thread{
	//java.lang�� ���� �⺻ Ŭ����
	//public class Thread extends Object implements Runnable
	//thread�۾��� ó���ϴ� run�޼��带 �������Ͽ� �����尡 �� ���� ����
	@Override
	public void run() {
		System.out.println(getName());
		//����Ŭ�������� ����� getName()�� ������ �̸��� ��ȯ
		//Thread�̸��� ������� Thread-0���·� �־���
	}
}

class Thread02 implements Runnable {
	//java.lang�� �ִ� �������̽�
	//@FunctionalInterface public interface Runnable �߻�޼��尡 �ϳ��� �ִ� �������̽�
	@Override
	public void run() { //ThreadŬ������ run�޼���� �̸�, ������ ����
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(Thread.currentThread().getName());
			//ThreadŬ������ static�޼��� currentThread()�� ���� �������� Thread��ü ��ȯ
		}
		
	}
}