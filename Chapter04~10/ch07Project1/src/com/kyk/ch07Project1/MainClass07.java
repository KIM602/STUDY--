package com.kyk.ch07Project1;

public class MainClass07 {

	public static void main(String[] args) {
		//Singleton s = new Singleton(); private생성자이므로 불가능
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		//s1 = s2 인스턴스임
		if(s1 == s2) {
			System.out.println("동일함");
		}
	}

}
