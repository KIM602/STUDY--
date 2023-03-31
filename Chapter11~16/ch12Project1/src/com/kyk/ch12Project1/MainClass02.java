package com.kyk.ch12Project1;

import java.util.ArrayList;

public class MainClass02 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		//FruitBox<Grape> grapeBox1 = new FruitBox<Apple>(); //에러, 타입 불일치
		//FruitBox<Toy> toyBox = new FruitBox<Toy>(); //지네릭 조건에 불일치
		
		fruitBox.add(new Fruit()); //ArrayList의 add()메서드 아니고 Box의 add메서드
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		appleBox.add(new Apple());
		//appleBox.add(new Grape()); 에러, Grape는 Apple의 자손이 아님
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox = " + fruitBox);
		System.out.println("appleBox = " + appleBox);
		System.out.println("grapeBox = " + grapeBox);
		
	}

}

class Fruit implements Eatable {
	@Override
	public String toString() {
		return "Fruit";
	}
}

interface Eatable {
	
}

class Apple extends Fruit {
	@Override
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	@Override
	public String toString () {
		return "Grape";
	}
}

class Toy {
	@Override
	public String toString() {
		return "Toy";
	}
}

class Box<T> { //지네릭 클래스로 선언
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {
		list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {
	//FruitBox클래스는 Box<T>클래스를 상속하고, 지네릭은 <T extends Fruit & Eatable>로 Fruit를 상속하고 Eatable을 구현
	//Fruit, Apple, Grape만 사용 가능
}