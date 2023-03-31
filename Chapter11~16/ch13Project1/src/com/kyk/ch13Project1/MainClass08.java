package com.kyk.ch13Project1;

public class MainClass08 implements Runnable {

	static boolean autoSave = false;
	
	public static void main(String[] args) {
		//Runnable r = new ();
		//Thread t = new Thread(r);
		//위의 두줄을 한줄로
		Thread t = new Thread(new MainClass08());
		t.setDaemon(true); //스레드 t를 보조 스레드 데몬으로 함, 주 스레드 종료시에는 자동종료
		
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
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	@Override
	public void run() {
		while(true) { //Daemon스레드는 무한반복을 시킴(주 스레드 끝나면 종료 되므로 무한반복 안함)
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
			System.out.println("작업파일이 자동저장되었습니다.");
		}
	}
