package com.kyk.ch07Project1;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass18 {

	public static void main(String[] args) {
		Button b = new Button("Start"); //Button�� ��ư ó�� Ŭ����
		b.addActionListener(new EventHandler());
		//��ư��ü b�� �̺�Ʈ ���� ��� �ο�
	}

}

class EventHandler implements ActionListener { //�������̽� ���� Ŭ����
	//ActionListener�� �ڹ�awtȰ�� gui���� Ŭ���� ó���ϴ� �������̽�
	//ActionListener�������̽��� �߻�޼��� ����
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!!");
	}
}
