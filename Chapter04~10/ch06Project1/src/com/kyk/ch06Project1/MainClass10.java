package com.kyk.ch06Project1;

public class MainClass10 {

	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3) 결과:" + mm.add(3,3));
		System.out.println("mm.add(3L, 3) 결과:" + mm.add(3L,3));
		System.out.println("mm.add(3, 3L) 결과:" + mm.add(3,3L));
		System.out.println("mm.add(3L, 3L) 결과:" + mm.add(3L,3L));
		
		//호출시에 오버로딩 된 메서드 중 어느 메서드인가는 인자와 파라메터의 형태가 같은 것을 자동으로 호출
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과: " + mm.add(a));
	}

}
