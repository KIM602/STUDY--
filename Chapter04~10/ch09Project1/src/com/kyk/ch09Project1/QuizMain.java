package com.kyk.ch09Project1;

public class QuizMain {

	public static void main(String[] args) {
		System.out.println("//1��");
		String greeting = "Hello";
		System.out.println(greeting);
		
		System.out.println("//2��");
		int length = greeting.length();
		System.out.println(length);
		
		System.out.println("//3��");
		greeting = greeting.toUpperCase();
		System.out.println(greeting);
		
		System.out.println("//4��");
		String firstName = "John ";
		String lastName = "Doe";
		StringBuffer sbf = new StringBuffer();
		sbf.append(firstName);
		sbf.append(lastName);
		String concat = sbf.toString();
		System.out.println(concat);
		//System.out.println(firstName + lastName));
		
		System.out.println("//5��");
		kkk(firstName, lastName);
		System.out.println(kkk(firstName, lastName));
		// System.out.println(firstName.concat(lastName));
		
		System.out.println("//6��");
		String HE = new String("Hello Everybody");
		System.out.println(HE.indexOf("e"));
		//int java.lang.String.indexOf(String str)
		
		System.out.println("//7��");
		Integer myInt = 5;
		Double myDouble = 5.99;
		Character myChar = 'A';
		
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(myChar);
		
	}

	private static String kkk(String firstName, String lastName) {
		return firstName + lastName;
	}

}

/*
 * 1. ���ڿ� ���� greeting�� �����ϰ� �ʱⰪ�� Hello�� ����
 * 2. 1�� ������ greeting������ ���ڼ��� ���ؼ� ��� �Ͻÿ�
 * 3. 1�� ������ ���ڿ��� ���� �빮�ڷ� ��ȯ�ϼ���
 * 4. fistName = "John ";�̰�  lastName = "Doe";�ε� �ΰ��� ������ ���ڿ��� ����Ͻÿ�
 * 5. 4�� ������ �޼��带 ����Ͽ� �����Ͻÿ�
 * 6. txt = "Hello Everybody";�ε� �� ���ڿ����� ��ó�� e�� ������ ���ι�ȣ�� ����ϼ���
 * 7. Integer�ν��Ͻ� myInt�� �����ϰ� �ʱⰪ 5�� ����
 *    Double�ν��Ͻ� myDouble�� �����ϰ� �ʱⰪ 5.99�� ����
 *    Character�ν��Ͻ� myChar�� �����ϰ� �ʱⰪ 'A'�� ����
 *    �� ���� ����Ͻÿ�
 */