package com.kyk.ch07Project1;

//����Ŭ������ �迭�� �� ���ҷ� ����Ŭ������ ����� ����Ŭ���� ��ü�� ���ҷ� ����� �� �ִ�.
//��, �Ϲ����� Ŭ������ �迭�� �ڱ� ��ü�� ���ҷ� ����ؾ� ��
public class MainClass10 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
	}
}

class Product2 {
	int price; //��ǰ�� ����
	int bonusPoint; //��ǰ���� �� �����ϴ� ���ʽ�����
	
	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	//�⺻�����ڸ� ����ϱ� ���ؼ��� ��������� �ۼ�
	Product2() {
		;
	}
}

class Tv2 extends Product2 {
	//Product2�� �⺻�� �����ڰ� �־� super()�� ȣ��� �� �־� ���� ������
	Tv2() {
		super(100);
	}
	
	@Override
	public String toString() {
		return "TV";
	}
}

class Computer2 extends Product2 {
	Computer2() {
		super(200);
	}
	
	@Override
	public String toString() {
		return "Coumputer";
	}
}

class Audio2 extends Product2 {
	Audio2() {
		super(50);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	
	Product2[] cart = new Product2[10];
	//cart�� �迭�ε� ����Ǵ� ������ ���������� ����Ŭ������ Product2
	//�迭�� ������ new �迭������[ũ��]
	//Ŭ������ ������ new Ŭ������()
	int i =0; //�迭 ���ι�ȣ�� ����� ���� (��������̰� �۷ι� ����)
	
	void buy(Product2 p) { //�Ķ���ͷ� ����Ŭ������ Product2�� ����ϹǷ� �ļյ� ���� �� ����
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p + "��/�� �����Ͽ����ϴ�.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = ""; //String�� �ƹ����� ������ ��Ÿ�� �� null���� ""
		for(int i=0; i<cart.length; i++) {
			if(cart[i] == null) //cartũ�Ⱑ 10�̹Ƿ� ���Ұ� ������ ����
				break;
			
			sum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		
		/*
		 * for(Product2 x : cart) {
		 * 		if(x = null)
		 * 			break;
		 * 		sum += x.price;
		 * 		itemList += x + ", "
		 * }
		 */
		
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}