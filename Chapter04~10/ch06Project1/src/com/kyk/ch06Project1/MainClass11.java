package com.kyk.ch06Project1;

public class MainClass11 {

	public static void main(String[] args) {
		Data_1 d1 = new Data_1(); //�⺻�����ڸ� ���
		Data_2 d2 = new Data_2(10);
		Data_2 d3 = new Data_2(); //�ٸ� ������ �־� �⺻ ������ ��� �Ұ��Ͽ� Ŭ������ �߰��� �⺻ �����ڸ� ����
	}
}

class Data_1 {
	int value;
	//�����ڰ� �����Ƿ� ���������� �⺻ ������ ����
	//public Data_1() { }
}

class Data_2 {
	int value;
	//�⺻ �����ڸ� ����ϱ� ���� �⺻ �����ڸ� ��������� �ۼ�
	public Data_2() {
		
	}
	//�Ķ���Ͱ� �ִ� ����� ������
	public Data_2(int x) {
		value = x;
	}
}
