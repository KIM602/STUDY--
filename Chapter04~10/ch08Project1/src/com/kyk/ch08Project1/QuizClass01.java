package com.kyk.ch08Project1;

public class QuizClass01 {

	public static void main(String[] args) {
		System.out.println("1��, 2��");
		try {
		int[] myNumbers = {1, 2, 3}; //�迭ũ�� 3
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
 * 1. int�迭 myNumbers�� ����� �ʱ�ȭ�� 1,2,3���� �Ѵ�.
 * 		�迭 ���ι�ȣ 10���� ���Ҹ� ����ϴµ� ���ܰ� �߻�, �̸� ó���϶�.
 * 		try~catch�� ����ϰ� ����ó���ô� "Something went wrong."�� ���
 * 2. 1�������� ���ܰ� �ְų� ���ų� The 'try catch' is finished.�� ����ϵ��� ��
 * 3. �޼����� "Access denied - You must be at least 18 years old."��
 * 		ArithmeticException���ܸ� �߻���Ű�� �� ���ܸ� ó���ϴ� try~catch���� �����
 *     ����ó���� ������ ����� �޼����� ����ϵ��� �Ѵ�.
 * 4. static void checkAge(int age) {     } �޼��忡 ArithmeticException�� �����Ͽ� ó���ϴ� �޼��带 ���� (��Ͼ��� ��� ��)
 * 5. Exception���ܸ� ����� ������ ���� ���� Ŭ���� My ExceptionŬ������ ����� ���� �޽����� ����ϴ� �����ڸ� ����.
 */