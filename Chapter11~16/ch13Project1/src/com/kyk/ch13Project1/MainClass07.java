package com.kyk.ch13Project1;

//ThreadGroup
//ThreadGroup�ν��Ͻ��� ����� ������ ��ü ���� �� �׷��� ���Խ�Ų��.
public class MainClass07 {

	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		//ThreadGroup myGroup�� �����ڸ� �̿��� ����
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		//WorkThreadaA������� ������׷��� myGroup�̰� ������ �̸��� workThreadA�� ��������
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main ������ �׷��� list() �޼ҵ� ��� ���� ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		//���� ������ main�������� ������׷��� ��
		
		mainGroup.list(); //������׷������� ����ϴ� �޼���, ���θ޼��彺���� �׷��� �ڽ��� myGroup����
		System.out.println();
		
		myGroup.list(); //myGroup �ڽŸ� ���
		
		try {
			Thread.sleep(3000);
		}
		
		catch (InterruptedException e) {
		}
		
		System.out.println("[ myGroup ������ �׷��� interrupt() �޼ҵ� ȣ�� ]");
		myGroup.interrupt(); //myGroup�� ���� ��������� �ߴ��� ������ (���ܰ� �߻�--sleep �ߴ�)
	}

}

class WorkThread extends Thread {
	//������
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName); //Thread������
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
		System.out.println(getName() + " �����");
	}
}