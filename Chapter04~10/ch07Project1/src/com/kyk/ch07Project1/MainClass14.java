package com.kyk.ch07Project1;

public class MainClass14 {

	public static void main(String[] args) {
		staticMethod(); //static메서드에서 static메서드 호출시는 바로 사용
		MainClass14 m = new MainClass14();
		m.instanceMethod();//static 메서드 안에서 인스턴스멤버 접근시는 객체.이름
	}
	
	class InstanceInner {
		//묵시적 기본생성자만 있는 내부 클래스
	}
	
	static class StaticInner {
		//묵시적 기본생성자만 있는 내부 클래스
	}
	
	//자기클래스의 내부클래스 인스턴스는 내부클래스 생성자로 만듬
	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() { //outer클래스 MainClass14의 static메서드 
		StaticInner obj2 = new StaticInner(); //static만 접근
		//InstanceInner obj1 = new InstaceInner(); //바로 접근 안됨
		//인스턴스멤버 접근 하려면 외부클래스 객체 만듬
		MainClass14 out = new MainClass14();
		InstanceInner obj1 = out.new InstanceInner();
		
	}
	
	void instanceMethod() {
		//인스턴스형 메서드 안에서는 인스턴스나 static클래스 모두 접근 가능
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		//LocalInner lv = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner {} //local 내부 클래스
		LocalInner lv = new LocalInner();
	}
	
}
