package com.kyk.ch04Project1;

public class QuizClass1 {

	public static void main(String[] args) {
		/*
		 * 1.�������� System.out.println("Hello World");�� ����Ϸ���
		 * 	 int x1 = 50;
		 *   int y1 = 10;
		 *   if( ) {
		 *   	System.out.println("Hello World");
		 *   }
		 * 2. int x2 = 50;
		 *    int y2 = 50;
		 *    x2�� y2�� �����ô� Yes�� ����ϰ� �ƴҽô� No�� ��� (if ~ else)
		 * 3. int x3 = 50;
		 * 	  int y3 = 50;
		 *    x3�� y3�� ������ 1�� ��� x3�� y3���� ũ�� 2�� ���, �� �ܴ� 3�� ���
		 * 4. int time = 20;
		 * 	  time�� 18���� ������ "Good day"�� �ƴϸ� "Good Evening"��
		 *    ���� result�� �����ϴ� ���׿������ ����Ͽ� �ۼ��ϰ� ���
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
