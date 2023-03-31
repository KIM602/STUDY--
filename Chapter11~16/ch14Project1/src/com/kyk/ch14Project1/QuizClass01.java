package com.kyk.ch14Project1;

import java.util.function.Consumer;

public class QuizClass01 {

	public static void main(String[] args) {
		MyFunctionalInterface f1 = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		
		f1.method(2);
		
		f1 = x -> System.out.println(x * 5);
		f1.method(2);
		
		Runnable r = () -> {
			System.out.println("Runnable");
		};
		
		r.run();
		
		Consumer<Integer> c = s -> {
			System.out.println(s);
		};
		
		c.accept(4);
	}
}

@FunctionalInterface
interface MyFunctionalInterface {
	public void method(int x);
}


/*
 * 1. 함수적 인터페이스인 MyFunctionalInterface를 만들고
 *	   메서드 method(int x)를 만든다.
 * 2. MyFunctionalInterface의 인스턴스 f1을 선언
 * 	   f1에 람다식을 대입
 *	   람다식의 블록은 람다식의 파라메터에 5를 곱하여 result에 대입
 *	   result값을 출력
 *	   
 *	   method()메서드를 인자 2로 실행
 *	   f1을 ()없이 그리고 { }없이 적어볼 것
 * 3. Runnable인터페이스 인스턴스 r을 람다식으로 구현
 * 4. Consumer인터페이스 인스턴스 c를 람다식으로 구현(제네릭은 Integer으로 처리)
 * 	   참고로 Consumer인터페이스의 추상메서드는 void accept(T t)이다
 */
