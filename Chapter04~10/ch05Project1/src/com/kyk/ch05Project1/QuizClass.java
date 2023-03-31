package com.kyk.ch05Project1;

public class QuizClass {

	public static void main(String[] args) {
		/*
		 * 1. 이름이 cars인 문자열 배열을 만들고 초기값으로 volvo, BMW, Ford를 저장
		 * 2. 1번문제의 cars배열의 두번째 원소를 출력
		 * 3. 원소 volvo를 Openl로 변경하고 출력
		 * 4. 배열 cars변수의 크기를 구하여 출력
		 * 5. enhanced for문
		 *     for( 배열원소의 데이터형 변수명 : 배열변수이름) {
		 *      //각 원소별로 반복
		 *     }
		 *     cars배열의 원소를 for문을 사용하여 출력
		 *     가. 기본 for문
		 *     나. enhanced for문으로 출력
		 */
		
		System.out.println("1번.");
		String [] cars = new String[3];
		cars[0] = "volvo";
		cars[1] = "BMW";
		cars[2] = "Ford";
		
		System.out.println("2번");
		System.out.println(cars[1]);
		
		System.out.println("3번");
		String tmp = cars[0];
		cars[0] = "Open1";
		for (int i = 0 ; i < cars.length ; i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println("4번");
		System.out.println(cars.length);
		
		System.out.println("5번");
		System.out.println(" 가.");
		for (int i = 0 ; i <cars.length ; i++)
			System.out.println(cars[i]);
		
		System.out.println(" 나.");
		for (String cars1 : cars) {
			System.out.println(cars1);
		}
	}

}
