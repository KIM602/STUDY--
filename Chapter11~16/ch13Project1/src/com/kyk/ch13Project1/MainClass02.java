package com.kyk.ch13Project1;

//�̱۽�����(main������)�� ���
public class MainClass02 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); //��������� posixŸ��(1970.1.10�� ���� ���ݱ����� ����� �и�������)
		
		for(int i = 0; i < 300 ; i++)
			System.out.print(("-"));
		
		System.out.println();
		System.out.println("�ҿ�ð�1: " + (System.currentTimeMillis()-startTime));
		
		for(int i = 0 ; i < 300 ; i ++)
			System.out.print("|");
		
		System.out.println();
		System.out.print("�ҿ�ð�2:" + (System.currentTimeMillis() - startTime));
	}

}
