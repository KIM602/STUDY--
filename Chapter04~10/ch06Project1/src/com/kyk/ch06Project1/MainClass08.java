package com.kyk.ch06Project1;

public class MainClass08 {

	public static void main(String[] args) {
		Data3 d1 = new Data3();
		d1.x = 10;
		
		Data3 d2 = new Data3();
		d2.x = 100;
		
		Data3 d3 = copy(d1); //�޼��� ȣ��� ��ȯ���� ������ �ش� ��ȯ���� �������� ������ ����
		
		System.out.println("d1.x =" + d1.x); //10
		System.out.println("d3.x =" + d3.x); //10
	}

		static Data3 copy(Data3 d) {
			//returnŸ���� ���������� ����ϴ� ���
			Data3 tmp = new Data3();
			tmp.x = d.x;
			return tmp;
			//������ �� ��ġ����� ��
		}
}

class Data3 {
	int x;
}