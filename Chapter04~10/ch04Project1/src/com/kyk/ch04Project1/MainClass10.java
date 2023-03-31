package com.kyk.ch04Project1;

public class MainClass10 {
	
	private int pri; //메서드 밖에서 반든 전역변수(글로벌변수), private : 내부 클래스에 접근을 막음(보안상)

	public static void main(String[] args) {
		//메서드 안에서 만든 로컬변수(지역변수)
		int sum = 0;
		int i   = 0;
		//기본형 byte short int long float double boolean char
		//참조형은 기본형이 아닌것 : MainClass10, String, System, Math, Integer, Scanner
		
		while(true) { //조건식이 true이무로 무조건 블록을 실행 즉 무한루프가 될 수 있음
			if(sum > 100) {
				break; //break는 자신이 속한 반복문을 나옴
			}
			
			++i;
			sum += i;
		}
		
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}

}
