package com.kyk.ch13Project1;

//main, th1, th2������ 3��(��Ƽ������)
public class MainClass09 {

	public static void main(String[] args) {
		//main�����忡 ���� �ļս����� th1, th2�� ����
		//�׷�� �켱���� 5�� �����
		Thread09_01 th1 = new Thread09_01();
		Thread09_02 th2 = new Thread09_02();
		
		th1.start(); //th1������ ���డ�ɻ���, run�޼��带 ����
		th2.start(); //th2������ ���డ�ɻ���, run�޼��带 ����
		//main������� ��� ����
		
		try {
			Thread.sleep(2000);
		}
		catch (Exception e) {
			e.getMessage();
		}
		System.out.print("<<main ����>>");
	}

}

class Thread09_01 extends Thread {
	@Override
	public void run() {
		for(int i = 0 ; i < 300 ; i++) {
			System.out.print("-");
		}
		
		System.out.print("<<th1 ����>>");
	}
}

class Thread09_02 extends Thread {
	@Override
	public void run() {
		for(int i = 0 ; i < 300 ; i++) {
			System.out.print("*");
		}
		
		System.out.println("<<th2 ����>>");
	}
	
}
