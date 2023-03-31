package com.kyk.ch07Project1;

public class Singleton {
	private static Singleton s = new Singleton();
	//private�� �� �ڱ��ڽ��� �ν��Ͻ��� Ŭ������ �޸𸮿� �ε��� �� ���� �ε� �ǵ��� static���� �����
	//�ܺο����� ������ �Ұ����ϵ��� private�� ĸ��ȭ
	
	//�����ڰ� private�� �Ǿ� �ܺο��� ���� �����ڸ� ȣ�� ����
	private Singleton() {
		
	}
	
	//�ܺο��� Singleton�� �ν��Ͻ� s�� ��� �޼���� ������ �����ϵ��� public
	//�ε��� ������� s�� ����ϹǷ� ���� �ν��Ͻ� s�� ���
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		return s;
	}
}
