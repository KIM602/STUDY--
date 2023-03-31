package com.kyk.ch14Project1;

import java.util.function.Predicate;

public class MainClass01 {

	public static void main(String[] args) {
		//���ٽ����� MyFunction�� run()�� ����-���ٽ��� �ν��Ͻ��̰� ���������� �ش�Ǵ� �߻�޼��带 ���� �������̽�
		MyFunction f1 = () -> System.out.println("f1.run()"); //{}�κ��� ������ �� {}���� ����
		
		//�͸��� Ŭ������ MyFunction�������̽� ��ü ����
		MyFunction f2 = new MyFunction() {
			@Override
			public void run() {
				System.out.println("f2.run()");
			}
		};
		
		//MyFunction�ν��Ͻ��� ��ȯ�ϴ� �޼��带 �̿�
		MyFunction f3 = getMyFunction();
		
		MyFunction f4 = new MyFuncImpl(); //�������̽��� ������ Ŭ������ ����� ���
		
		f1.run(); //���ٽ����� ������ �ν��Ͻ� ������ �޼����
		f2.run();
		f3.run();
		f4.run();
		
		execute(f1);
		execute(( ) -> System.out.println("run()")); //���ٽ����� ���� ��ü ����
		
		//public void run()
		Runnable r = () -> {
			System.out.print("Runnable");
			System.out.println();
		};
		
		r.run();
	
		Predicate<String> isEmptyStr = s -> {
			return s.length()==0;
		};
		//Predicate�� functional interface�� boolean test(T t)�߻�޼��带 ����
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

@FunctionalInterface //�߻�޼��尡 �ϳ��� �������̽��� ���õ� ������̼�
interface MyFunction {
	//�߻�޼���
	public abstract void run();
	//void run();���� ����ص� ��
}

class MyFuncImpl implements MyFunction {
	@Override
	public void run() {
		System.out.println("f4.run()");
	}
}