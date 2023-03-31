package com.kyk.ch06Project1;

public class Tv1 {
		//클래스의 구성 요소는 멤버변수, 메서드, 생성자
		//기본형 생성자는 묵시적으로 컴파일러가 자동으로 추가
		
		public Tv1() {
			;
		} //기본형 생성자
		
		//Tv1의 속성(멤버변수, 엄밀히 instance멤버변수, 객체를 만들어서 사용이 가능)
		String color; // 기본값 null
		boolean power; //기본값이 false
		int channel; // 기본값 0
		
		//Tv1의 기능(메서드)
		//void는 return  데이터형(반환데이터형)을 나타내는 키워드로 아무것도 반환 안함
		//리턴타임 다음에는 메서드 이름이 메서드 오고 메서드 이름 뒤에 파라메터를 작성하는 ()가 옴
		//()안에는 필요시 전달할 값의 형태를 나타내는 변수를 작성
		//정의된 메서드 사용시에는 메서드명(전달값)
		//인스턴스형 메서드로 객체 생성하여 사용 가능
		void power() {
			power = !power;
		}
		
		void channelUp( ) {
			++channel;
		}
		
		void channelDown() {
			--channel;
		}
}
