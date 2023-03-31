package com.kyk.ch05Project1;

public class MainClass05 {

	public static void main(String[] args) {
		//main메서드의 파라메터는 String[] args이다.
		//외부에서 main메서드를 호출시에 파라메터에 맞도록 String배열로 값을 넣어준다.
		//메서드는 함수라고 생각하면 된다. f(x,y) = x * 5 + y * 7; 사용은 f(3,4)
		System.out.println("매개변수의 개수:" + args.length);
		for(int i = 0 ; i < args.length ; i++) {
			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
			
		}
	}

}
