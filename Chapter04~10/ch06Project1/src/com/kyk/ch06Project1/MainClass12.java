package com.kyk.ch06Project1;

public class MainClass12 {

	public static void main(String[] args) {
		Car c1 = new Car(); //�⺻�����ڷ� ���� �ν��Ͻ��� ��ü�� ��Ӻ����� default
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		//��κ� Ŭ������ ������ �ܺ� Ŭ�������� ������ �Ұ����� private���� ���� ������ ��� �Ұ���
		
		Car c2 = new Car("white", "auto", 4); //�ν��Ͻ��� �ʱ�ȭ�� ����� ������ �Է�
		
		System.out.println("c1�� color=" + c1.color + ", gearType=" + c1.gearType + "door=" + c1.door);
		System.out.println("c2�� color=" + c2.color + ", gearType=" + c2.gearType + "door=" + c2.door);
	}

}

class Car {
	String color;
	String gearType;
	int door;
	
	//�����ڿ� �ν��Ͻ��� �ʱ�ȭ ���� ������ �Ķ���͸� ���
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
	
	//�⺻�� �����ڵ� ����� �� �ֵ��� ������ �⺻���� ��������� �ۼ�
	Car() {
		
	}
}
