package com.kyk.ch07Project1;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass19 {

	public static void main(String[] args) {
		Button b = new Button("Start");
		//원래 addActionListener()의 괄호속에 ActionListener인터페이스를 구현한
		//클래스를 만들어 그 객체를 넣어 주어야 하는데 new 인터페이스() {추상메서드 구현}
		b.addActionListener(new ActionListener() {
			//ActionListener인터페이스의 추상메서드 구현
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
			}
		});
	}
}
