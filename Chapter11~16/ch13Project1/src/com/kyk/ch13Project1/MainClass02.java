package com.kyk.ch13Project1;

//싱글스레드(main스레드)만 사용
public class MainClass02 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); //현재까지의 posix타임(1970.1.10시 부터 지금까지의 경과한 밀리세컨드)
		
		for(int i = 0; i < 300 ; i++)
			System.out.print(("-"));
		
		System.out.println();
		System.out.println("소요시간1: " + (System.currentTimeMillis()-startTime));
		
		for(int i = 0 ; i < 300 ; i ++)
			System.out.print("|");
		
		System.out.println();
		System.out.print("소요시간2:" + (System.currentTimeMillis() - startTime));
	}

}
