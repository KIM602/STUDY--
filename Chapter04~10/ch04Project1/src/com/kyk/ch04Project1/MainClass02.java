package com.kyk.ch04Project1;

public class MainClass02 {

	public static void main(String[] args) {
		int x = 0;
		
		System.out.printf("x=%d 일때, 참인것은 %n",x);
		if(x == 0)
			System.out.println("x==0");
		//if가 true일 때 실행할 문장이 하나일시는 { }생략
		if(x != 0) { //x가 0이므로 false가 되어 { }실행 안함
			System.out.println("x!=0");
		}
		if(!(x == 0)) { //true를 논리부정연산자인 !으로 false이므로 {}실행안함
			System.out.println("!(x==0)");
	    }
		if(!(x != 0)) { //false를 논리부정연산자인 !으로 부정하여 true이므로 {}실행
			System.out.println("!(x!=0)");
		}
		
		String str = "3";
		char ch = ' ';
		if(str != null && !str.equals("")) {
			//논리와 문자열 비교 연산을 사용하여 조건식을 만듬
			ch = str.charAt(0); //str문자열에서 색인번호 0번의 문자
			System.out.println("ch : " + ch);
		}
	}

}
