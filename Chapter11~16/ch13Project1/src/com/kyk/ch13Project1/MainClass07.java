package com.kyk.ch13Project1;

//ThreadGroup
//ThreadGroup인스턴스를 만들고 스레드 객체 만들 시 그룹을 포함시킨다.
public class MainClass07 {

	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		//ThreadGroup myGroup을 생성자를 이용해 만듬
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		//WorkThreadaA스레드는 스레드그룹이 myGroup이고 스레드 이름이 workThreadA인 스레드임
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main 스레드 그룹의 list() 메소드 출력 내용 ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		//현재 스레드 main스레드의 스레드그룹을 얻어냄
		
		mainGroup.list(); //스레드그룹정보를 출력하는 메서드, 메인메서드스레드 그룹은 자식인 myGroup포함
		System.out.println();
		
		myGroup.list(); //myGroup 자신만 출력
		
		try {
			Thread.sleep(3000);
		}
		
		catch (InterruptedException e) {
		}
		
		System.out.println("[ myGroup 스레드 그룹의 interrupt() 메소드 호출 ]");
		myGroup.interrupt(); //myGroup에 속한 스레드들의 중단을 해제함 (예외가 발생--sleep 중단)
	}

}

class WorkThread extends Thread {
	//생성자
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName); //Thread생성자
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			}
			
			catch(Exception e) {
				System.out.println(getName() + " interrupted");
				break;
			}
		}
		System.out.println(getName() + " 종료됨");
	}
}