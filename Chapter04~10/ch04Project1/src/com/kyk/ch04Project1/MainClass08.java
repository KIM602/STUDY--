package com.kyk.ch04Project1;

public class MainClass08 {

	public static void main(String[] args) {
		int i1 = 5;
		while(i1-- != 0) { //���ǽ��� true�� �� �ݺ�
			System.out.println(i1 + " - I can do it.");
		}
		
		int sum = 0;
		int i2 = 0;
		while(sum <= 100) { //sum���� 100���� �������� i2���� 1�� �������Ѽ� �� ����� ���� ����.
			System.out.printf("%d - %d%n", i2, sum);
			sum += ++i2; //sum = sum + (++i2)
		}
	}

}
