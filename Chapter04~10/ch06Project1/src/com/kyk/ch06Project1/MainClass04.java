package com.kyk.ch06Project1;

public class MainClass04 { //public�� ���� �����ڷ� � ��Ű���� Ŭ�������� ����
	//Ŭ������ ���� ��Ҵ� �������, ����޼���, ������(�����ڰ� ��������� ������ ���� �� �⺻ �����ڰ� ����) 
	//�ʿ��� ���� ��Ҹ� �ۼ�(�޼���� �⺻�����ڸ� ����)
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		//Ŭ����������� ������ Ŭ�����̸�.Ŭ�������������� ����
		Card c1 = new Card(); //CardŬ������ �⺻ �����ڸ� �̿��Ͽ� �ν��Ͻ� ����
		c1.kind = "Heart"; //kind�� �ν��Ͻ������̹Ƿ� �ν��Ͻ���.�ν��Ͻ����������� ����
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")");
		
		System.out.println("c1�� width�� height�� ���� 50, 80���� �����մϴ�.");
		//c1��ü�� width, height ������ static���� ����
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")");
		//static���� ����Ǿ����Ƿ� c2�� ����
	}

}

class Card { //���������� ���� ���� friendly �Ǵ� default�̸� ���� ��Ű�������� ���� ����
	String kind; //�ν��Ͻ� ��� ����
	int number; //�ν��Ͻ� ��� ����
	static int width = 100; //Ŭ�����������(static, ����) ����ÿ� ���� ����
	static int height = 250;
	//CardŬ������ ��������� �⺻�����ڸ� �ְ� �޼���� ����
}