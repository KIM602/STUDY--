package com.kyk.ch08Project1;

public class MainClass01 {

	public static void main(String[] args) {
		System.out.println(1);
		
		try {
			//try�� ���ܹ߻����ɼ��ִ� �ڵ带 �ۼ��ϴµ� print�������� ���ܹ߻� ���ϹǷ� catch���� ������
			System.out.println(2);
			System.out.println(3);
		}
		
		catch(Exception e) { //Exception�� ����ó��Ŭ�����ε� ����Ŭ������ �̸� ����� ����Ŭ������ �������� ���� ����
			System.out.println(4); //���ܹ߻��� ó���� �ڵ�
		}
		
		//try~catch��� ��
		System.out.println(5);
	}

}
