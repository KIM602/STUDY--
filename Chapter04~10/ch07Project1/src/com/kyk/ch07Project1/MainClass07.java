package com.kyk.ch07Project1;

public class MainClass07 {

	public static void main(String[] args) {
		//Singleton s = new Singleton(); private�������̹Ƿ� �Ұ���
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		//s1 = s2 �ν��Ͻ���
		if(s1 == s2) {
			System.out.println("������");
		}
	}

}
