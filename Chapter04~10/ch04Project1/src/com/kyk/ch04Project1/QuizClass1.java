package com.kyk.ch04Project1;

public class QuizClass1 {

	public static void main(String[] args) {
		/*
		 * 1.다음에서 System.out.println("Hello World");를 출력하려면
		 * 	 int x1 = 50;
		 *   int y1 = 10;
		 *   if( ) {
		 *   	System.out.println("Hello World");
		 *   }
		 * 2. int x2 = 50;
		 *    int y2 = 50;
		 *    x2와 y2가 같을시는 Yes를 출력하고 아닐시는 No를 출력 (if ~ else)
		 * 3. int x3 = 50;
		 * 	  int y3 = 50;
		 *    x3와 y3가 같으면 1을 출력 x3가 y3보다 크면 2를 출력, 그 외는 3을 출력
		 * 4. int time = 20;
		 * 	  time이 18보다 적으면 "Good day"를 아니면 "Good Evening"을
		 *    변수 result에 저장하는 삼항연산식을 사용하여 작성하고 출력
		 * 5. int day =2;
		 * 	  switch( ) {
		 *       () 1:
		 *          System.out.println("Saturday");
		 *       () 2:
		 *       	System.out.println("Saturday");
		 *          ( );
		 *    }
		 */

		//1.
		int x1 = 50;
		int y1 = 10;
		if(x1 == y1 * 5) {
			System.out.println("Hello World");
		}
		
		//2.
		int x2 = 50;
		int y2 = 50;
		if(x2 == y2) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		//3.
		int x3 = 50;
		int y3 = 50;
		if(x3 == y3) {
			System.out.println(1);
		}
		else if(x3 > y3) {
			System.out.println(2);
		}
		else {
			System.out.println(3);
		}
		
		//4.
		int time = 20;
		String result = time < 18 ? "Good day" : "Good Evening";
		System.out.println(result);
		
		//5.
		int day = 2;
		switch(day) {
			case 1:
				System.out.println("Saturday");
				break;
			case 2:
				System.out.println("Sunday");
				break;
		}
	}
}
