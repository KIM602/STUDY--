package com.kyk.ch05Project1;

import java.util.Arrays;

public class MainClass06 {

	public static void main(String[] args) {
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40}
		};
		
		int sum =0;
		//2���� �迭���� �迭��.length�� ù��° �迭 ÷���� ũ���̴�. ��, ���� ũ���̴�.
		for(int i = 0 ; i < score.length ; i++) {
			//��ø for������ �� ���� �迭 ���� ��
			for(int j = 0 ; j < score[i].length ; j++) {
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
				sum += score[i][j];
			}
		}
		System.out.println("sum=" + sum);
		
		//�迭 ����
		int[] number = {1,2,3,4,5};
		int[] newNumber = new int[10]; //int�� �⺻���� 0���� ä���� �迭
		for(int i = 0 ; i < number.length ; i++) {
			newNumber[i] = number[i];
			//�տ��� 5���� number�迭�� ������ ä������ �������� �⺻�� 0
		}
		System.out.println(Arrays.toString(newNumber));
		
		int[] number1 = {1,2,3,4,5};
		int[] newNumber1 = new int[10];
		System.arraycopy(number1,0,newNumber1,0,5);
		//number1�迭�� 0���ε��� ���� newNumber1�迭�� 0���ε��� ���� 5���� ����
		System.out.println(Arrays.toString(newNumber1));
	}
}
