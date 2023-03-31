package com.kyk.ch07Project1;

public class MainClass09 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv1()); //buy메서드의 파라메터가 Product이므로 Product 상속한 하위 클래스 인스턴스 Tv1
		b.buy(new Computer());
		
		/*
		 * product p1 = new Tv1();
		 * product p2 = new Computer();
		 * b.buy(p1);
		 * b.buy(p2);
		 */
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
	}

}

class Product {
	int price; //제품의 가격
	int bonusPoint; //제품구매 시 제공하는 보너스점수
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv1 extends Product {
	//Product가 기본형 생성자가 아니므로 명시적으로 상위의 생성자를 호출하는 생성자를 만들어야 한다.
	Tv1() {
		super(100);//Tv1 가격이 100만원
	}
	
	//Object의 toString메서드이므로 override
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
	int money = 1000; //소유금액
	int bonusPoint = 0; //보너스점수
	
	void buy(Product p) { //파라메터가 참조형 변수인 Product이면 Product의 하위클래스 인스턴트를 모두 받을 수 있다.
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return; //메서드를 종료
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.toString() + "을/를 구입하셨습니다.");
		//인스턴스(p)는 print문에서는 인스턴스(p).toString()
	}

}