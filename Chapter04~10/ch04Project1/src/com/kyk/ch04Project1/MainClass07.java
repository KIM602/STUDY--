package com.kyk.ch04Project1;

public class MainClass07 {

	public static void main(String[] args) {
		//for문의 기본 구조는 (초기화부 ; 조건부 ; 증감부), 필요 없는 부분은 안써줘도 됨, 값이 없어도 세미콜론으로 구분해야 함
		for(int i = 1;i <= 3;i++) {
			System.out.println("Hello");
		}
		
		int sum = 0; //합계 변수
		for(int i = 1 ; i <= 5 ; i++) { //반복변수 i는 for문 안에서만 사용 가능한 로컬 변수)
			sum += i ; //sum = sum + i
			System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
		}
		
		//중첩for문
		for(int i = 1 ; i <= 5 ; i++) {
			//중첩 반복
			for(int j = 1 ; j <= i ; j++) { //외부 for문 i에 따라 중첩 for문의 반복이 결정
				System.out.println("*");
			}
			System.out.println(); //줄만 바꾸는 프린트
		}
	}
}
