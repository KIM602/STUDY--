package com.kyk.ch04Project1;

public class MainClass11 {

	public static void main(String[] args) {
		for(int i = 0 ; i <= 10 ; i++) {
			if(i % 3 == 0) { //3�� ���
				continue; //continue�� ���⼭ �ٷ� ���� �ݺ����� ��ȯ, �� continue ���� ������ ���� ����
			}
			System.out.println(i);
		}
	}

}
