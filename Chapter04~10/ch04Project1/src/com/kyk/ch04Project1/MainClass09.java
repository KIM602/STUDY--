package com.kyk.ch04Project1;

import java.util.Scanner;

public class MainClass09 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1; //1부터 100까지의 임의의 수 나옴
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			//맨처음 한번은 무조건 { }을 실행시에 사용
			System.out.println("1과 100사이의 정수를 입력하세요.>");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			}
			else {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		}while(input != answer); //while() 뒤에 꼭 ;을 표시
		
		System.out.println("정답입니다.");
		
		scanner.close();
		
	}

}
