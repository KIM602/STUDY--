package com.kyk.ch07Project1;

public class MainClass17 {

	public static void main(String[] args) {
		Object iv = new Object() { //����Ŭ������ ����ϴ� �̸� ���� Ŭ������ �ۼ�
			void method() {
				//�� �� �ۼ�
			}
		};
		
		final Object cv = new Object() {
			void method() {}
		};
	}

}
