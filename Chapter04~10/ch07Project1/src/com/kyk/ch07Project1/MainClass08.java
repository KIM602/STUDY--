package com.kyk.ch07Project1;

//다형성. 즉, 상위클래스의 객체에는 여러가지의 하위클래스의 객체를 대입하여 사용 가능
public class MainClass08 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = (Car)fe; //Car객체는 자식 객체인 fe를 사용, 형변환을 생략가능
		//car.water(); 하위클래스를 상위클래스에 대입하여 사용시에는 상위클래스 자신만의 멤버만 사용가능
		fe2 = (FireEngine)car; //상위 객체를 하위 객체에 대입 시 형변환은 명시적
		fe2.water();
		
		if(fe instanceof FireEngine) { //instanceof는 이항연산자로 앞에는 인스턴스명, 뒤에는 클래스 
			System.out.println("fe는 FireEngine 인스턴스임");
		}
		
		if(fe instanceof Car) {
			System.out.println("fe는 Car 인스턴스임"); //Car에는 후손인 FireEngine을 대입
		}
		
		if(car instanceof FireEngine) {
			System.out.println("FireEngeine 인스턴스임");
		}
		
		if(fe instanceof Object) {
			System.out.println("Object 인스턴스임");
		}
	}

}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
	
}