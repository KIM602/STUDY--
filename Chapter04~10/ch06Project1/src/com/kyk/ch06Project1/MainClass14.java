package com.kyk.ch06Project1;

public class MainClass14 {
	//�ʱ�ȭ ����� ���� main�޼��� ���� �ۼ�
	static { //Ŭ���� �ʱ�ȭ ������� Ŭ�������� �ʱ�ȭ ���Ŀ� �ڵ����� ����
		System.out.println("static { }");
	}
	
	{ //�ν��Ͻ� �ʱ�ȭ ������� ������ ȣ�� �� ������ ���� ���� ����
		System.out.println("{  }");
	}
	
	public MainClass14() { //������
		System.out.println("������");
	}
	
	public static void main(String[] args) {
		System.out.println("MainClass14 m1 = new MainClass14();");
		MainClass14 m1 = new MainClass14();
		System.out.println("MainCLASS14 M2 = new MainClass14();");
		MainClass14 m2 = new MainClass14();
	}

}
