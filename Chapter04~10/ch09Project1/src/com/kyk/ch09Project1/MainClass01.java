package com.kyk.ch09Project1;

public class MainClass01 { //extends Object 생략

	public static void main(String[] args) {
		Value v1 = new Value(10); //new 생성자 호출문의 인자(파라메터에 전달되는 값은 인자)로 10을 사용
		Value v2 = new Value(10);
		//v1과 v2인스턴스변수(참조변수)가 가리키는 메모리에는 주소가 들어가있음
		if(v1.equals(v2)) { //equals는  Object클래스의 메서드로 주소 비교(객체를 비교)
			System.out.println("v1과 v2는 같습니다.");
		}
		else {
			System.out.println("v1과 v2는 다릅니다.");
		}
		
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1.equals(p2)) { //Person클래스에서 재정의한 equals메서드를 사용(인스턴스의 멤버변수를 비교)
			System.out.println("p1과 p2는 같은 사람입니다.");
		}
		else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
	}

}

class Value { //extends Object 생략
	int value; //인스턴스형 접근제한자는 default로 같은 패키지에서는 어디서나 접근 가능
	
	Value(int value) { //접근제한자는 default, 리턴타입없고 클래스 이름과 메서드 이름이 같으므로 생성자, 파라메터로 정수형을 처리하는 생성자
		//멤버변수 value와 파라메터 value가 같으므로 this로 구분
		this.value = value;
	}
}

class Person {
	long id;
	
	Person(long id) { //생성자
		this.id = id;
	}
	
	@Override //메서드 재정의를 처리하는 어노테이션
	public boolean equals(Object obj) { //Object클래스에 있는 equals메서드를 재정의, 객체를 비교하는 것이 아니라 객체의 id값을 비교
		if(obj instanceof Person) { //instanceof는 클래스에 해당하는 인스턴스를 판단하는 연산자
			return id == ((Person)obj).id; //상위클래스인 Object의 인스턴스를 하위클래스의 객체로 반환하려면 casting
			//멤버변수로 저장된 id가 구한 id와 같으면 true
		}
		else {
			return false;
		}
	}
}
