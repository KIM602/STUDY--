package com.kyk.ch06Project1;

public class MainClass11 {

	public static void main(String[] args) {
		Data_1 d1 = new Data_1(); //기본생성자만 사용
		Data_2 d2 = new Data_2(10);
		Data_2 d3 = new Data_2(); //다른 생성자 있어 기본 생성자 사용 불가하여 클래스에 추가로 기본 생성자를 만듬
	}
}

class Data_1 {
	int value;
	//생성자가 없으므로 묵시적으로 기본 생성자 있음
	//public Data_1() { }
}

class Data_2 {
	int value;
	//기본 생성자를 사용하기 위해 기본 생성자를 명시적으로 작성
	public Data_2() {
		
	}
	//파라메터가 있는 명시적 생성자
	public Data_2(int x) {
		value = x;
	}
}
