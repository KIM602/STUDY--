package com.kyk.ch07Project1;

public class MainClass09 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv1()); //buy�޼����� �Ķ���Ͱ� Product�̹Ƿ� Product ����� ���� Ŭ���� �ν��Ͻ� Tv1
		b.buy(new Computer());
		
		/*
		 * product p1 = new Tv1();
		 * product p2 = new Computer();
		 * b.buy(p1);
		 * b.buy(p2);
		 */
		
		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ������� " + b.bonusPoint + "���Դϴ�.");
	}

}

class Product {
	int price; //��ǰ�� ����
	int bonusPoint; //��ǰ���� �� �����ϴ� ���ʽ�����
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv1 extends Product {
	//Product�� �⺻�� �����ڰ� �ƴϹǷ� ��������� ������ �����ڸ� ȣ���ϴ� �����ڸ� ������ �Ѵ�.
	Tv1() {
		super(100);//Tv1 ������ 100����
	}
	
	//Object�� toString�޼����̹Ƿ� override
	@Override
	public String toString() {
		return "Tv"; }
	
}



class Computer extends Product {
	Computer() {
		super(200);
	}
	
	@Override
	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000; //�����ݾ�
	int bonusPoint = 0; //���ʽ�����
	
	void buy(Product p) { //�Ķ���Ͱ� ������ ������ Product�̸� Product�� ����Ŭ���� �ν���Ʈ�� ��� ���� �� �ִ�.
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return; //�޼��带 ����
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.toString() + "��/�� �����ϼ̽��ϴ�.");
		//�ν��Ͻ�(p)�� print�������� �ν��Ͻ�(p).toString()
	}

}