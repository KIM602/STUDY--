package com.kyk.ch07Project1;

//������. ��, ����Ŭ������ ��ü���� ���������� ����Ŭ������ ��ü�� �����Ͽ� ��� ����
public class MainClass08 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = (Car)fe; //Car��ü�� �ڽ� ��ü�� fe�� ���, ����ȯ�� ��������
		//car.water(); ����Ŭ������ ����Ŭ������ �����Ͽ� ���ÿ��� ����Ŭ���� �ڽŸ��� ����� ��밡��
		fe2 = (FireEngine)car; //���� ��ü�� ���� ��ü�� ���� �� ����ȯ�� �����
		fe2.water();
		
		if(fe instanceof FireEngine) { //instanceof�� ���׿����ڷ� �տ��� �ν��Ͻ���, �ڿ��� Ŭ���� 
			System.out.println("fe�� FireEngine �ν��Ͻ���");
		}
		
		if(fe instanceof Car) {
			System.out.println("fe�� Car �ν��Ͻ���"); //Car���� �ļ��� FireEngine�� ����
		}
		
		if(car instanceof FireEngine) {
			System.out.println("FireEngeine �ν��Ͻ���");
		}
		
		if(fe instanceof Object) {
			System.out.println("Object �ν��Ͻ���");
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