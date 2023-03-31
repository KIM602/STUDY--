package com.kyk.ch07Project1;

//MainClass13클래스 내부에 내부클래스를 만듬
public class MainClass13 {

	public static void main(String[] args) {
		//자기클래스의 내부 클래스 접근자는 내부클래스이름.멤버
		System.out.println(InstanceInner.CONST);
		//instance클래스멤버이나 static final이므로 가능
		//System.out.println(InstanceInner.iv);
		//main이 static이므로 바로는 instance를 접근 못함(객체를 만들어서 접근)
		System.out.println(StaticInner.cv);
		System.out.println(StaticInner.CONST);
		//System.out.println(StaticInner.iv);
		//static클래스에 있는 인스턴스도 바로 접근 불가
	}
	
	class InstanceInner { //내부 인스턴스클래스
		int iv = 100; //인스턴스형 변수
		//static int cv = 100; //static변수는 인스턴스클래스 안에서는 불가능
		final static int CONST = 100; //상수는 가능
	}
	
	static class StaticInner { //static내부 클래스, 모두 가능
		int iv =200;
		static int cv = 200;
		final static int CONST = 200; //상수는 가능
	}
	
	void myMethod() {
		class LocalInner { //메서드 안의 로컬 내부 클래스
			int iv = 300;
			//static int cv = 300; //인스턴스로 클래스가 되어 안됨
			final static int CONST = 300; //상수는 가능
		}
	}
}
