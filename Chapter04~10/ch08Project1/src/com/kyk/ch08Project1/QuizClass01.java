package com.kyk.ch08Project1;

public class QuizClass01 {

	public static void main(String[] args) {
		System.out.println("1번, 2번");
		try {
		int[] myNumbers = {1, 2, 3}; //배열크기 3
		System.out.println(myNumbers[10]);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Something went wrong.");
			e.printStackTrace();
		}
		
		finally {
			System.out.println("The 'try catch' is finished.");
		}
	}
}

/*
 * 1. int배열 myNumbers를 만들고 초기화는 1,2,3으로 한다.
 * 		배열 색인번호 10번의 원소를 출력하는데 예외가 발생, 이를 처리하라.
 * 		try~catch를 사용하고 예외처리시는 "Something went wrong."을 출력
 * 2. 1번문제에 예외가 있거나 없거나 The 'try catch' is finished.를 출력하도록 함
 * 3. 메세지가 "Access denied - You must be at least 18 years old."인
 * 		ArithmeticException예외를 발생시키고 그 예외를 처리하는 try~catch문을 만들고
 *     예외처리시 생성시 사용한 메세지를 출력하도록 한다.
 * 4. static void checkAge(int age) {     } 메서드에 ArithmeticException를 위임하여 처리하는 메서드를 만듬 (블록안은 없어도 됨)
 * 5. Exception예외를 상속한 개발자 정의 예외 클래스 My Exception클래스를 만들고 예외 메시지를 사용하는 생성자를 구현.
 */