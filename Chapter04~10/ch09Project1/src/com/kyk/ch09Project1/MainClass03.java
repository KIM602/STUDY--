package com.kyk.ch09Project1;

public class MainClass03 {

	public static void main(String[] args) {
		Card c1 = new Card(); //������ �ּҸ� ���� �������� �ν��Ͻ�
		Card c2 = new Card();
		
		//toString()�� �������̵� ���ϰ� Object������ ���
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		//String java.lang.Object.toString()
		//java.lang.ObjectŬ������ toString()�� ����Ÿ���� String
		
		Card2 c21 = new Card2(); //�Ķ���;��� ������ ȣ��
		Card2 c22 = new Card2("HEART", 10); //�Ķ���� �ΰ��� ���� ������ ȣǮ
		
		System.out.println(c21.toString());
		System.out.println(c22.toString());
		
	}
}

class Card {
	String kind;
	int number;
	
	Card() {
		this("SPACE", 1); //�ٸ� ������ ȣ��
	}
	
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
}

class Card2 {
	String kind;
	int number;
	
	Card2() {
		this("SPADE", 1); //�ٸ� ������ ȣ��
	}
	
	Card2(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	//toString�޼��� �������̵�(Ŭ������ ��� ������ ��ȯ�� ���)
	@Override
	public String toString() {
		return " kind : " + kind + ", number : " + number;
	}
}
