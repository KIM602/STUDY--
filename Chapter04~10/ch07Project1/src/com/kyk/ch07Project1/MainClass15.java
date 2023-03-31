package com.kyk.ch07Project1;

public class MainClass15 {

	public static void main(String[] args) {
		//내부클래스를 가진 다른 클래스를 접근하기 위해 다른 클래스 객체 만듬
		Outer2 oc = new Outer2();
		//다른 클래스의 내부클래스는 데이터형으로 클래스 경로를 사용
		//인스턴스형 내부 클래스 객체는 내부클래스를 가진 다른 클래스 객체를 이용
		Outer2.InstaceInner ii = oc.new InstaceInner();
		System.out.println("ii.iv : " + ii.iv);
		
		//다른 클래스의 static형 클래스의 static멤버는 객체 생성 없이 클래스 경로만 사용
		System.out.println("Outer2.StaticInner.cv : " + Outer2.StaticInner.cv);
		
		//static클래스의 인스턴스 변수는 외부 객체를 안만들고 클래스 경로를 사용하여 객체 생성
		Outer2.StaticInner si = new Outer2.StaticInner();
		System.out.println("si.iv : " + si.iv);
	}

}

//내부클래스를 가진 클래스
class Outer2 {
	class InstaceInner { //인스턴스형 내부 클래스
		int iv = 100; //인스턴스멤버만 오나 static final 상수는 가능
	}
	
	static class StaticInner { //static형 내부 클래스
		int iv = 200; //인스턴스 static 모두 가능
		static int cv = 300;
	}
	
	void myMethod() { //Outer2의 인스턴스형 메서드
		class LocalInner { //로컬 내부클래스(메서드 안에서만 접근)
			int iv = 400; //static은 불가
		}
	}
}
