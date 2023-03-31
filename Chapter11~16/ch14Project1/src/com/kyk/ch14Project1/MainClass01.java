package com.kyk.ch14Project1;

import java.util.function.Predicate;

public class MainClass01 {

	public static void main(String[] args) {
		//람다식으로 MyFunction의 run()을 구현-람다식은 인스턴스이고 데이터형은 해당되는 추상메서드를 가진 인터페이스
		MyFunction f1 = () -> System.out.println("f1.run()"); //{}부분이 한줄일 때 {}생략 가능
		
		//익명의 클래스로 MyFunction인터페이스 객체 생성
		MyFunction f2 = new MyFunction() {
			@Override
			public void run() {
				System.out.println("f2.run()");
			}
		};
		
		//MyFunction인스턴스를 반환하는 메서드를 이용
		MyFunction f3 = getMyFunction();
		
		MyFunction f4 = new MyFuncImpl(); //인터페이스를 구현한 클래스를 만들어 사용
		
		f1.run(); //람다식으로 구현한 인스턴스 실행은 메서드명
		f2.run();
		f3.run();
		f4.run();
		
		execute(f1);
		execute(( ) -> System.out.println("run()")); //람다식으로 직접 객체 생성
		
		//public void run()
		Runnable r = () -> {
			System.out.print("Runnable");
			System.out.println();
		};
		
		r.run();
	
		Predicate<String> isEmptyStr = s -> {
			return s.length()==0;
		};
		//Predicate는 functional interface로 boolean test(T t)추상메서드를 가짐
		String s = "";
		if(isEmptyStr.test(s)) {
			System.out.println("This is an empty String.");
		}
	}
	
	static MyFunction getMyFunction() {
		MyFunction f = () -> {
			System.out.println("f3.run()");
		};
		
		return f;
	}
	
	static void execute(MyFunction f) {
		f.run();
	}
}

@FunctionalInterface //추상메서드가 하나인 인터페이스에 관련된 어노테이션
interface MyFunction {
	//추상메서드
	public abstract void run();
	//void run();으로 사용해도 됨
}

class MyFuncImpl implements MyFunction {
	@Override
	public void run() {
		System.out.println("f4.run()");
	}
}