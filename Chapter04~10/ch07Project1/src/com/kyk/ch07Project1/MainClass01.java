package com.kyk.ch07Project1;

public class MainClass01 { //extends Object�� ������

	public static void main(String[] args) {
		//�ٸ� Ŭ������ ��ü�� ���� ����ϹǷ� ���� ���
		SmartTv stv = new SmartTv();
		stv.channel = 10; //SmartTv�� �θ��� Tv�� ����� �������
		stv.channelUp(); //SmartTv�� �θ��� Tv�� ����� ����޼���
		System.out.println(stv.channel);
		
		stv.displayCaption("Hello, World"); //SmartTv���� ���� �޼���
		stv.caption = true; //SmartTv���� ���� �������
		stv.displayCaption("Hello, World");
	}

}
