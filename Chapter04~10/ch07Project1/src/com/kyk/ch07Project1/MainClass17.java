package com.kyk.ch07Project1;

public class MainClass17 {

	public static void main(String[] args) {
		Object iv = new Object() { //조상클래스를 상속하는 이름 없는 클래스를 작성
			void method() {
				//할 일 작성
			}
		};
		
		final Object cv = new Object() {
			void method() {}
		};
	}

}
