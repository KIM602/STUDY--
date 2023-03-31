package com.kyk.ch13Project1;

public class MainClass08 implements Runnable {

	static boolean autoSave = false;
	
	public static void main(String[] args) {
		//Runnable r = new ();
		//Thread t = new Thread(r);
		//���� ������ ���ٷ�
		Thread t = new Thread(new MainClass08());
		t.setDaemon(true); //������ t�� ���� ������ �������� ��, �� ������ ����ÿ��� �ڵ�����
		
		t.start();
		
		for(int i=1 ; i <= 10 ; i++) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.getMessage();
			}
			System.out.println(i);
			
			if(i==5)
				autoSave = true;
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	@Override
	public void run() {
		while(true) { //Daemon������� ���ѹݺ��� ��Ŵ(�� ������ ������ ���� �ǹǷ� ���ѹݺ� ����)
			try {
				Thread.sleep(3 * 1000);
			}
			catch(Exception e) {
				e.getMessage();
			}
			if(autoSave)
				autoSave();
			}
		}
		
		public void autoSave() {
			System.out.println("�۾������� �ڵ�����Ǿ����ϴ�.");
		}
	}
