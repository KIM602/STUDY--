package com.kyk.ch08Project1;

public class MainClass01 {

	public static void main(String[] args) {
		System.out.println(1);
		
		try {
			//try는 예외발생가능성있는 코드를 작성하는데 print문에서는 예외발생 안하므로 catch문을 사용안함
			System.out.println(2);
			System.out.println(3);
		}
		
		catch(Exception e) { //Exception은 예외처리클래스인데 상위클래스로 이를 상속한 하위클래스를 다형성에 의해 받음
			System.out.println(4); //예외발생시 처리할 코드
		}
		
		//try~catch블록 밖
		System.out.println(5);
	}

}
