package com.kyk.ch02Project4;

public class MainClass {

	public static void main(String[] args) {
		int x = 10, y = 5;
		//동일한 데이터 형을 가진 두개의 변수를 한줄에 표시
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		
		int tmp = x; //두 변수값을 교환하기 위해서 임시 변수를 만들어 사용, 그렇지 않으면 원래의 x값은 없어짐
		x = y;
		y = tmp;
		
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		
	}

}
