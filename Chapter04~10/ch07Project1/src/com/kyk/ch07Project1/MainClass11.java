package com.kyk.ch07Project1;

public class MainClass11 {

	public static void main(String[] args) {
		//Unit[] group = new Unit[3];
		//Marine, Tank, Dropship은 Unit를 상속한 하위클래스 인스턴스이므로 다형성에 의해 배열 원소로 사용 가능
		Unit[] group = { new Marine() , new Tank() , new Dropship() };
		//배열의 값을 {  }에 바로 넣는 방식은 배열 변수 선언시에 같이 해주어야 한다.
	
		for(int i = 0; i < group.length; i++) {
			group[i].move(100, 200);
	}
		
	/* 
	 * enhanced for
	 * for(Unit x : group) {
	 * x.move(100, 200); x의 데이터형에 따라 해당 클래스의 move를 호출
	 * }
	 */
	}
}

abstract class Unit { //추상클래스는 class키워드 옆에 abstract 제한자 붙엄
	//추상클래스는 1개 이상의 추상메서드를 가진 클래스(추상메서드가 없는 경우에도 추상클래스로 정의 가능)
	int x, y;
	abstract void move(int x, int y); //프로토타입만 있는 추상메서드
	void stop() { //{  }이 있으면 그 안에 내용이 없어도 일반 메서드
		//아무 일도 안하는 메서드
	}
}

class Marine extends Unit { //일반 클래스는 추상클래스도 상속 가능
	void move(int x, int y) {
		//추상메서드를 일반메서드로 정의 즉 {  }을 만들어 준다.
		//구현시에는 메서드에서 abstract를 제거
		System.out.println("Marine[x=" + x + ",y=" + y + "]");
	}
	
	void stimPack() {
		//아무 일도 안하는 메서드
	}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ",y=" + y + "]");
	}
	
	void changeMode() {
		
	}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("DropShip[x=" + x + ",y=" + y + "]");
	}
	
	void load()	{
		
	}
	
	void unload() {
		
	}
 }

