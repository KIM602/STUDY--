package com.kyk.ch12Project1;

import java.util.ArrayList;
import java.util.List;

public class MainClass01 {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		//public class ArrayList<E>�� ���׸� Ŭ�����̰� Ÿ�Թ��� E�� ���
		//ArrayList ��ü ����ÿ� ���׸��� ���(Product ��������)
		//�������� ���׸��� ������ ���׸��� ��� new ArrayList<Product>(); ��, �ڹ� 1.7������ ������ Ÿ���� ���� ����
		//�ν��Ͻ� productList���� Product�� ��ü�� ���
		
		productList.add(new Product());
		
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		//ArrayList<product> tvList1 = new ArrayList<Tv>(); //����� �������� ���׸�Ÿ���� �ٸ��Ƿ� ����
		List<Tv> tvList2 = new ArrayList<Tv>();
		//���׸��� Tv�� �����ϱ� �����̰� List�� ArrayList�� ���� �������̽��̹Ƿ� ���������� OK
		
		productList.add(new Tv()); //public boolean add(E e)�� Product��ü�� �;� �ϴµ� ���� ��ü�� ����(������)
		productList.add(new Audio());
		
		Product p = productList.get(0); //�ڽ� Product�̹Ƿ� ����ȯ �ʿ����
		Tv tv1 = (Tv)productList.get(1); //ProductŬ������ ����Ŭ�����̹Ƿ� ����ȯ
		
		tvList.add(new Tv()); //���׸����� ������ �ν��Ͻ��̹Ƿ� ����
		tvList.add(new Tv());
		
		printAll(productList);
		System.out.println("=========");
		//printAll(tvList); �޼��� �Ķ���Ϳ� ���׸��� �޶� ����
	}
	
	//static���� �ڽ� Ŭ������ ���׸��� ��� �Ұ��̳� JDK���� Ŭ������ ���׸��� �� ����� ����
	public static void printAll(ArrayList<Product> list) {
		for (Product p : list) {
			System.out.println(p);
		}
	}

}

class Product {
	
}

class Tv extends Product {
	
}

class Audio extends Product {
	
}