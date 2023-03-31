package com.kyk.ch13Project1;

import javax.swing.JOptionPane;

public class MainClass10 {

	public static void main(String[] args) {
		Thread10 th = new Thread10();
		th.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		th.interrupt(); //interrupt()�� ȣ���ϸ�, interrupted���°� true�� �ȴ�.
		System.out.println("isInterrupted() : " + th.isInterrupted()); //true
		//interrupted���°� true�� �Ǹ� �ߴ����� �����尡 ���� ���ɻ��·� ��
	}

}

class Thread10 extends Thread {
	@Override
	public void run() {
		int i = 10;
		
		while(i!=0 && !isInterrupted()) {
			//i�� 0�� �ƴϰ� Interrupted���°� false�� ��
			System.out.println(i--);
			for(long x = 0; x < 2500000000L ; x++);
		}
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	}
}
