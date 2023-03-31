package com.kyk.ch06Project1;

public class MainClass12 {

	public static void main(String[] args) {
		Car c1 = new Car(); //기본생성자로 만든 인스턴스는 객체의 멤머변수가 default
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		//대부분 클래스의 변수는 외부 클래스에서 접근이 불가능한 private여서 위의 설정은 사용 불가능
		
		Car c2 = new Car("white", "auto", 4); //인스턴스의 초기화에 사용할 값들을 입력
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + "door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + "door=" + c2.door);
	}

}

class Car {
	String color;
	String gearType;
	int door;
	
	//생성자에 인스턴스의 초기화 값을 설정한 파라메터를 사용
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
	
	//기본형 생성자도 사용할 수 있도록 없어진 기본형을 명시적으로 작성
	Car() {
		
	}
}
