package com.kyk.ch04Project1;

public class MainClass06 {

	public static void main(String[] args) {
		double random = 0;
		
		random = Math.random();
		//Math.random()�� 0.0(����)���� 1.0(������) ������ ������ ���� double������ ��ȯ
		System.out.println("random : " + random);
		
		//1�� 10������ ���Ǽ��� ������� ����� 10�� ���ϰ� ������ ��ȯ�� �� 1�� �����ش�
		int randInt = (int)(Math.random() * 10) + 1;
		System.out.println("randInt : " + randInt);	
	}
}
