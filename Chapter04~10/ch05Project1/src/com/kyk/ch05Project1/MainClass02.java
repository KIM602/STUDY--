package com.kyk.ch05Project1;

public class MainClass02 {

	public static void main(String[] args) {
		int sum = 0; //총점을 저장하기 위한 변수
		float average = 0f; //평균을 저장하기 위한 변수
		
		int[] score = {100,80,100,100,90};
		for(int i = 0 ; i < score.length; ++i) {
			sum += score[i]; //sum = sum + score[i];
		}
		
		average = sum / (float)score.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
		
		//각 원소값을 불러 사용한 예제
	}

}
