package com.kyk.ch05Project1;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		int[] iArr1 = new int[10]; //�迭 iArr1�� ���� int�迭�̰� newŰ����� ũ�Ⱑ 10�� �迭�� ����(�޸� Ȯ��)
		int[] iArr2 = new int[10]; //int iArr2[]ó�� �迭÷�� []�� �迭�� �ڿ� �͵� ����
		int[] iArr3 = new int[]{100, 95, 80, 70, 60}; //new ������ ũ��� �����ϰ� �迭 �� {100, 95, 80, 70, 60}�� �̿�, �˾Ƽ� ũ�� ����
		int[] iArr4 = {100, 95, 80, 70, 60}; //����� ���ÿ� �迭 �� {����     }�� �̿��Ͽ� �ʱ�ȭ, ����� �ʱ�ȭ�� �����ϸ� ����
		char[] chArr = {'a','b','c','d'};
		
		//�޸� ������ Ȯ���� iArr1�� iArr2�� �� ���Ұ��� �־���
		for(int i = 0 ; i < iArr1.length ; i++) {
			//iArr1.length�� iArr1�迭�� ũ�� �� 10��
			iArr1[i] = i + 1; //�� iArr1�迭 ���ҿ� 1���� 10�� ���� ���� {1,2,3,4,5,6,7,8,9,10}
			//iArr1[i]�� i��° ���Ҹ� ����
		}
		for(int i = 0 ; i < iArr2.length ; i++) {
			iArr2[i] = (int)(Math.random() * 10) + 1; //1~10 ������ ������ �� 
		}
		
		//�迭�� ����� ������ ����Ѵ�.
		for(int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[i] + ",");
		}
		
		System.out.println();
		System.out.println("==================");
		for(int i = 0 ; i < iArr2.length ; i++) {	
			System.out.print(iArr2[i] + ",");
		}
		
		System.out.println();
		System.out.println("==================");
		
		//ArraysŬ������ toString(�迭��)���� ��ȯ�Ͽ� ���
		System.out.println(Arrays.toString(iArr2));
		//[8, 4, 8, 6, 4, 5, 5, 9, 5, 6]�� ���
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		//�迭������ �ٷ� ����ϸ� �迭�� �������� �ּҰ� ��� [I@5305068a
		System.out.println(chArr);
		//char�迭�� �迭������ ���� ����ϸ� , ���� ���ڿ����·� ��� abcd
	}
}
