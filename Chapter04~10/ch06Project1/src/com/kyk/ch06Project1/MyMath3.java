package com.kyk.ch06Project1;

public class MyMath3 {
	int add(int a, int b) {
		System.out.println("int add(int a, int b) - ");
		return a+b;
	}
	
	//위의 메서드 오버로딩임(리턴타입, 이름 같고 파라메터 이름 같고 파라메터의 데이터형과 갯수 다르므로 오버로딩
		int add(int[] a) {
			System.out.println("int add(int[] a) - ");
			int result = 0;
			for(int i = 0 ; i < a.length ;  i++) {
				result += a[1];
			
			}
			return result;
		}
		
	//위의 add에서는 오버로딩 아님(리턴타입이 틀림)
	long add(int a, long b) {
		System.out.println("long add(int a, long b) - ");
		return a + b;
	}
	
	long add(long a, int b) { //위의 메서드와 파라메터 이름은 같고 데이터형만 다르므로 오버로딩이다
		System.out.println("long add(long a, long b) - ");
		return a + b;
	}
	
	long add(long a,long b) { //위의 메서드와 파라메터이름은 같고 데이터형만 다르므로 오버로딩임
		System.out.println("long add(long a, long b) - ");
		return a + b;
	}
}

