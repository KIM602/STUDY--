package com.kyk.ch07Project1;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass19 {

	public static void main(String[] args) {
		Button b = new Button("Start");
		//���� addActionListener()�� ��ȣ�ӿ� ActionListener�������̽��� ������
		//Ŭ������ ����� �� ��ü�� �־� �־�� �ϴµ� new �������̽�() {�߻�޼��� ����}
		b.addActionListener(new ActionListener() {
			//ActionListener�������̽��� �߻�޼��� ����
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
			}
		});
	}
}
