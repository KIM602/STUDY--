package com.kyk.ch07Project1;

public class MainClass16 {

	public static void main(String[] args) {
		Outer3 outer = new Outer3();
		//static�޼����� main()�޼��忡�� �ν��Ͻ�����Ŭ������ �ν��Ͻ������ �����ϱ� 
		Outer3.Inner inner = outer.new Inner();
		inner.method();
	}
}

class Outer3 {
	int value = 10; //Outer3.this.value
	
	class Inner {
		int value = 20; //this.value
		
		void method () {
			int value = 30; //value
			System.out.println("value : " + value);
			System.out.println("this.value : " + this.value);
			System.out.println("Outer3.this.value : " + Outer3.this.value);
		}
	}
}
