package com.kyk.ch05Project1;

public class MainClass02 {

	public static void main(String[] args) {
		int sum = 0; //������ �����ϱ� ���� ����
		float average = 0f; //����� �����ϱ� ���� ����
		
		int[] score = {100,80,100,100,90};
		for(int i = 0 ; i < score.length; ++i) {
			sum += score[i]; //sum = sum + score[i];
		}
		
		average = sum / (float)score.length;
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + average);
		
		//�� ���Ұ��� �ҷ� ����� ����
	}

}
