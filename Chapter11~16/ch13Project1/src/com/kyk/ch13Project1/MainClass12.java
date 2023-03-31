package com.kyk.ch13Project1;

public class MainClass12 {

	public static Account acc = new Account();
	
	public static void main(String[] args) {
		Thread th1 = new Thread(new Thread12());
		Thread th2 = new Thread(new Thread12());
		
		th1.start();
		th2.start();
	}
	
	public static Account getAccount() {
		return acc;
	}
}

class Account {
	private int balance = 1000; //private���� �ؾ� ����ȭ�� �ǹ̰� �ִ�.
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int money)	{ //���(���� ����� �������� synchronized���)
		if(balance >= money) { //money�� �����
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.getMessage();
			}
			balance -= money;
		}
	}
}

class Thread12 implements Runnable {
	Account acc = MainClass12.getAccount();
	@Override
	public void run() {
		while(acc.getBalance() > 0) {
			int money = (int)(Math.random() * 3 + 1) * 100;
			System.out.println("money : " + money); 
			acc.withdraw(money); //thread���� withdraw()�ϳ� synchronized�̹Ƿ� �ѹ��� �ϳ��� thread�� ó��
			System.out.println("balance : " + acc.getBalance());
		}
	}
}