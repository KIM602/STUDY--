package com.kyk.ch04Project1;

public class QuizClass2 {

	public static void main(String[] args) {

		/*
		 * 1. Yes�� 5�� ����ϴ� for���� �ۼ��ϼ���
		 * 2. while���� ����Ͽ� �ݺ����� ����µ� ������ ä�� ��������.
		 * 	  i < 6�� ������ while���� i���� ����ϰ� i�� 1�� �����Ѵ�.
		 * 3. 2�� ������ do ~ while������ �ٲټ���.
		 * 4. �ݺ����� i�� �ʱⰪ�� 0�̰� ���ǽ��� 10 �̸��̸� �������� 1�� �����ϴ� for������
		 * 	  i���� ����ϵ� ��, i�� 5�̸� �ݺ��� �ߴ��Ѵ�(��, ��¹��� ����� �� ���߿� �ۼ�)
		 * 5. 4������ i�� 4�̸� ���� �ݺ��� �����ϵ��� �ۼ�
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