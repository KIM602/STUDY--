package com.kyk.ch04Project1;

public class MainClass08 {

	public static void main(String[] args) {
		int i1 = 5;
		while(i1-- != 0) { //조건식이 true일 시 반복
			System.out.println(i1 + " - I can do it.");
		}
		
		int sum = 0;
		int i2 = 0;
		while(sum <= 100) { //sum값이 100이하 때까지만 i2값을 1씩 증가시켜서 그 당시의 합을 본다.
			System.out.printf("%d - %d%n", i2, sum);
			sum += ++i2; //sum = sum + (++i2)
		}
	}

}
