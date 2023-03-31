package com.kyk.ch06Project1;

public class MainClass15 {
	//클래스변수가 먼저 생성된 후 클래스 초기화 블록(static블록) 실행
	//클래스 로딩과 static부분이 종료 후에 main메서드 실행
	static int[] arr = new int[10];
	
	static {
		for(int i = 0 ;i < arr.length ; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
	}
		
	public static void main(String[] args) {
		for(int x : arr) {
			System.out.println(x);
		}
	}
}
