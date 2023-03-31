package com.kyk.ch07Project1;

public class MainClass06 {

	public static void main(String[] args) {
		
		Card c = new Card();
		//c.NUMBER = 5; final�� ������ �ȵǹǷ� ����
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		
		System.out.println(c.toString());
		
	}

}

class Card extends Object { //extends Object ����
	/*
	final int NUMBER = 10; //�ν��Ͻ� final����(���), ���� ����� ����ÿ� �ʱ�ȭ �ؾ���
	final String KIND = "kkkk"; 
	*/
	
	//�����ڸ� ���Ͽ� �ν��Ͻ����(final�ν��Ͻ�����-���)�� �ʱ�ȭ�� ����
	final int NUMBER;
	final String KIND;
	
	Card() {
		this("HEART",1); //���� Ŭ������ �ٸ� ������ ȣ��
	}
	
	Card(String kind, int num) {
		 KIND = kind;
		 NUMBER = num;
	 }
	 
	 @Override //������ �������̵带 ��Ÿ���� ������̼� (����� �����ϴ� �ּ�)
	 public String toString() { //�θ�Ŭ���� Object�� �޼��带 ������
		 return "" + KIND + " " + NUMBER;
	 }
}