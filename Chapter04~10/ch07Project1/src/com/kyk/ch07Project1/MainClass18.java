package com.kyk.ch07Project1;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass18 {

	public static void main(String[] args) {
		Button b = new Button("Start"); //Button은 버튼 처리 클래스
		b.addActionListener(new EventHandler());
		//버튼객체 b에 이벤트 감시 기능 부여
	}

}

class EventHandler implements ActionListener { //인터페이스 구현 클래스
	//ActionListener는 자바awt활용 gui에서 클릭을 처리하는 인터페이스
	//ActionListener인터페이스의 추상메서드 구현
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!!");
	}
}
