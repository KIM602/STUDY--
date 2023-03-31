package com.kyk.ch12Project1;

import java.util.ArrayList;
import java.util.List;

public class MainClass01 {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		//public class ArrayList<E>는 지네릭 클래스이고 타입문자 E를 사용
		//ArrayList 객체 선언시에 지네릭을 사용(Product 데이터형)
		//생성자의 지네릭도 동일한 지네릭을 사용 new ArrayList<Product>(); 단, 자바 1.7에서는 데이터 타입은 생략 가능
		//인스턴스 productList에는 Product의 객체를 사용
		
		productList.add(new Product());
		
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		//ArrayList<product> tvList1 = new ArrayList<Tv>(); //선언과 생성자의 지네릭타입이 다르므로 에러
		List<Tv> tvList2 = new ArrayList<Tv>();
		//지네릭은 Tv로 같으니까 정상이고 List는 ArrayList의 상위 인터페이스이므로 다형성으로 OK
		
		productList.add(new Tv()); //public boolean add(E e)로 Product객체가 와야 하는데 하위 객체도 가능(다형성)
		productList.add(new Audio());
		
		Product p = productList.get(0); //자신 Product이므로 형변환 필요없음
		Tv tv1 = (Tv)productList.get(1); //Product클래스의 하위클래스이므로 형변환
		
		tvList.add(new Tv()); //지네릭으로 지정한 인스턴스이므로 가능
		tvList.add(new Tv());
		
		printAll(productList);
		System.out.println("=========");
		//printAll(tvList); 메서드 파라메터와 지네릭이 달라 에러
	}
	
	//static에서 자신 클래스의 지네릭은 사용 불가이나 JDK제공 클래스가 지네릭일 시 사용은 가능
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