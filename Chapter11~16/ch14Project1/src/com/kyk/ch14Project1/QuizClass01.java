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
 * 1. �Լ��� �������̽��� MyFunctionalInterface�� �����
 *	   �޼��� method(int x)�� �����.
 * 2. MyFunctionalInterface�� �ν��Ͻ� f1�� ����
 * 	   f1�� ���ٽ��� ����
 *	   ���ٽ��� ����� ���ٽ��� �Ķ���Ϳ� 5�� ���Ͽ� result�� ����
 *	   result���� ���
 *	   
 *	   method()�޼��带 ���� 2�� ����
 *	   f1�� ()���� �׸��� { }���� ��� ��
 * 3. Runnable�������̽� �ν��Ͻ� r�� ���ٽ����� ����
 * 4. Consumer�������̽� �ν��Ͻ� c�� ���ٽ����� ����(���׸��� Integer���� ó��)
 * 	   ����� Consumer�������̽��� �߻�޼���� void accept(T t)�̴�
 */
