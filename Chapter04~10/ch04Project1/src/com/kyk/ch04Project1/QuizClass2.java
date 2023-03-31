package com.kyk.ch04Project1;

public class QuizClass2 {

	public static void main(String[] args) {

		/*
		 * 1. Yes를 5번 출력하는 for문을 작성하세요
		 * 2. while문을 사용하여 반복문을 만드는데 다음을 채워 넣으세요.
		 * 	  i < 6인 조건의 while문은 i값을 출력하고 i를 1씩 증감한다.
		 * 3. 2번 문제를 do ~ while문으로 바꾸세요.
		 * 4. 반복변수 i의 초기값은 0이고 조건식은 10 미만이며 증감식은 1씩 증가하는 for문에서
		 * 	  i값을 출력하되 단, i가 5이면 반복을 중단한다(단, 출력문을 블록의 맨 나중에 작성)
		 * 5. 4번에서 i가 4이면 다음 반복을 실행하도록 작성
		 */
		
		//1.
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("Yes");
		}
		
		//2.
		int i1 = 1;
		while(i1 < 6) {
			System.out.println(i1);
			i1++;
		}
		
		//3.
		int i2 = 1; 
		do {
			System.out.println(i2++);
		}while(i2 < 6);
		
		//4.
		for(int j = 0;j < 10;j++) {
			if (j == 5) {
				break;
			}
			System.out.println(j);
		}
		
		//4.
		for(int j = 0;j < 10;j++) {
			if (j == 4) {
				continue;
			}
			System.out.println(j);
		}
	}

}