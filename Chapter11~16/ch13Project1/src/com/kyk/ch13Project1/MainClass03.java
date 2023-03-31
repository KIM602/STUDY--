package com.kyk.ch13Project1;

//��Ƽ������� ó��(���ν������ �ٸ� �߰� ������)
//���ν����� ����, Thread03������ ����� �Ͼ
public class MainClass03 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		Thread03 th = new Thread03();
		th.start();
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 300; i++)
			System.out.printf("-");
		
		System.out.println("�ҿ�ð�1 : " + (System.currentTimeMillis() - startTime));
	}

}

class Thread03 extends Thread {
	//ThreadŬ������ ����� ������� ������ ����
	@Override
	public void run() {
		for(int i = 0; i < 300; i++)
			System.out.printf("%s", new String("|"));
		
		System.out.println("�ҿ�ð�2 : " + (System.currentTimeMillis() - MainClass03.startTime));
	}
}
