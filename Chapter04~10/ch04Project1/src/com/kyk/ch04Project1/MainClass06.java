package com.kyk.ch04Project1;

public class MainClass06 {

	public static void main(String[] args) {
		double random = 0;
		
		random = Math.random();
		//Math.random()은 0.0(포함)부터 1.0(미포함) 사이의 임의의 수를 double형으로 반환
		System.out.println("random : " + random);
		
		//1과 10사이의 임의수를 만들려면 결과에 10을 곱하고 정수로 변환한 뒤 1을 더해준다
		int randInt = (int)(Math.random() * 10) + 1;
		System.out.println("randInt : " + randInt);	
	}
}
