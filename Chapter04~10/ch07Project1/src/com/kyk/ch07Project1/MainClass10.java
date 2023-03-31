package com.kyk.ch07Project1;

//상위클래스의 배열은 각 원소로 상위클래스를 상속한 하위클래스 객체를 원소로 사용할 수 있다.
//즉, 일반적인 클래스의 배열은 자기 객체만 원소로 사용해야 함
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
	int price; //제품의 가격
	int bonusPoint; //제품구매 시 제공하는 보너스점수
	
	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	//기본생성자를 사용하기 위해서는 명시적으로 작성
	Product2() {
		;
	}
}

class Tv2 extends Product2 {
	//Product2에 기본형 생성자가 있어 super()가 호출될 수 있어 에러 없어짐
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
	//cart는 배열인데 저장되는 원소의 데이터형이 상위클래스인 Product2
	//배열의 생성은 new 배열원소형[크기]
	//클래스의 생성은 new 클래스명()
	int i =0; //배열 색인번호로 사용할 변수 (멤버변수이고 글로벌 변수)
	
	void buy(Product2 p) { //파라메터로 상위클래스인 Product2를 사용하므로 후손도 받을 수 있음
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p + "을/를 구입하였습니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = ""; //String에 아무값도 없음을 나타낼 시 null보다 ""
		for(int i=0; i<cart.length; i++) {
			if(cart[i] == null) //cart크기가 10이므로 원소가 없으면 중지
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
		
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}