package com.kyk.ch06Project1;

public class MainClass14 {
	//초기화 블록은 보통 main메서드 위에 작성
	static { //클래스 초기화 블록으로 클래스변수 초기화 이후에 자동으로 실행
		System.out.println("static { }");
	}
	
	{ //인스턴스 초기화 블록으로 생성자 호출 시 생성자 보다 먼저 실행
		System.out.println("{  }");
	}
	
	public MainClass14() { //생성자
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		System.out.println("MainClass14 m1 = new MainClass14();");
		MainClass14 m1 = new MainClass14();
		System.out.println("MainCLASS14 M2 = new MainClass14();");
		MainClass14 m2 = new MainClass14();
	}

}
