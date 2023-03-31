package com.kyk.ch06Project1;

public class MainClass08 {

	public static void main(String[] args) {
		Data3 d1 = new Data3();
		d1.x = 10;
		
		Data3 d2 = new Data3();
		d2.x = 100;
		
		Data3 d3 = copy(d1); //메서드 호출시 반환값이 있으면 해당 반환값의 데이터형 변수에 저장
		
		System.out.println("d1.x =" + d1.x); //10
		System.out.println("d3.x =" + d3.x); //10
	}

		static Data3 copy(Data3 d) {
			//return타입을 참조형으로 사용하는 경우
			Data3 tmp = new Data3();
			tmp.x = d.x;
			return tmp;
			//데이터 형 일치해줘야 함
		}
}

class Data3 {
	int x;
}