package com.kyk.ch05Project1;

import java.util.Arrays;

public class MainClass06 {

	public static void main(String[] args) {
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40}
		};
		
		int sum =0;
		//2차원 배열에서 배열명.length는 첫번째 배열 첨자의 크기이다. 즉, 행의 크기이다.
		for(int i = 0 ; i < score.length ; i++) {
			//중첩 for문으로 각 행의 배열 값을 얻어냄
			for(int j = 0 ; j < score[i].length ; j++) {
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
				sum += score[i][j];
			}
		}
		System.out.println("sum=" + sum);
		
		//배열 복사
		int[] number = {1,2,3,4,5};
		int[] newNumber = new int[10]; //int의 기본값인 0으로 채워진 배열
		for(int i = 0 ; i < number.length ; i++) {
			newNumber[i] = number[i];
			//앞에서 5개만 number배열의 값으로 채워지고 나머지는 기본값 0
		}
		System.out.println(Arrays.toString(newNumber));
		
		int[] number1 = {1,2,3,4,5};
		int[] newNumber1 = new int[10];
		System.arraycopy(number1,0,newNumber1,0,5);
		//number1배열의 0번인덱스 부터 newNumber1배열로 0번인덱스 부터 5개를 복사
		System.out.println(Arrays.toString(newNumber1));
	}
}
