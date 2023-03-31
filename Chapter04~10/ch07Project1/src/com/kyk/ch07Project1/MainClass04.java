package com.kyk.ch07Project1;

public class MainClass04 {

	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		
		System.out.println("x = " + p.x + ",y = " + p.y + ",z = " + p.z);
		
	}
}

class Point {
	int x, y;
	
	Point(int x, int y) { //return type�� ���� Ŭ������� �̸��� ������ �޼���� ������
		//�������� ������ �Ķ���� ���� �޾� ������� ���� �ʱ�ȭ �ϴµ� ���
		this.x = x; //�Ķ������ ������� ��������� �������� ���� �� this�� ����
		this.y = y;
		
	}
}

class Point3D extends Point {
	int z; //int x,y�� ��ӵ� ��������̹Ƿ� �ۼ� �ʿ� ����
	
	//������
	Point3D(int x, int y, int z) {
		//�ڽ� Ŭ������ �θ�Ŭ������ �����ڸ� ù �ٿ��� ȣ���ؾ� �ϴµ� �θ� Ŭ���� �����ڰ� �⺻���� �ƴϸ� ��������� �ۼ�
		super(x,y); //�θ�Ŭ������ ������ ȣ��� x,y�� ����, �θ�Ŭ������ x,y�� ����� �ڽ�Ŭ������ �������� ����
		this.z = z;
		
	}
}