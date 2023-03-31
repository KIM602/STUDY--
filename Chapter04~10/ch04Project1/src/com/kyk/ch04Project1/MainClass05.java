package com.kyk.ch04Project1;

import java.util.Scanner;

public class MainClass05 {

	public static void main(String[] args) {
		
		System.out.println("현재 월을 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		//month값을 switch문의 파라메터로 사용(조건식)
		//month값과 일치하는 case로 맨처음 간 다음 그 다음은 맨처음 만나는 break까지 진행
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("현재의 계절은 봄입니다.");
				break; //3,4,5 모두 이곳에서 switch문을 나감
			case 6: case 7: case 8:
				System.out.println("현재의 계절은 여름입니다.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("현재의 계절은 가을입니다.");
				break;
			default:
				System.out.println("현재의 계절은 겨울입니다.");
		}
		
		System.out.println("switch문 밖입니다.");
		
		scanner.close();
		
	}

}
