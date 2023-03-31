package com.kyk.ch07Project1;

public class Singleton {
	private static Singleton s = new Singleton();
	//private로 된 자기자신의 인스턴스를 클래스가 메모리에 로딩될 시 같이 로딩 되도록 static으로 만들고
	//외부에서는 접근이 불가능하도록 private로 캡슐화
	
	//생성자가 private로 되어 외부에서 직접 생성자를 호출 못함
	private Singleton() {
		
	}
	
	//외부에서 Singleton의 인스턴스 s를 얻는 메서드는 접근이 가능하도록 public
	//로딩시 만들어진 s를 사용하므로 단일 인스턴스 s를 사용
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		return s;
	}
}
