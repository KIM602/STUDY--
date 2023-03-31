package com.kyk.ch09Project1;

//기본형에서 문자열로 변환시는 String.valueOf(기본형 값) 또는 기본형값 + ""을 사용
//문자열을 기본형으로 변경시는 기본형을 클래스.parse기본형클래스(숫자형문자열) 또는 valueOf(숫자형 문자열)

public class MainClass07 {

	public static void main(String[] args) {
		int iVal = 100;
		//정수값을 String으로 변환시는 String.valueOf(기본형값);을 사용
		String strVal = String.valueOf(iVal);
		
		double dVal = 200.0;
		String strVal2 = dVal + ""; //문자열 연결 연산자 + 와 빈값 ""을 사용하여 문자열로 변경
		
		double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
		//문자열 +100을 Integer.parseInt메서드로 정수로 변환
		//문자열 200.0을 Double형 값으로 변환
		
		//parse데이터형메서드 대신 jdk1.5이상부터 사용하는 valueOf메서드 사용
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("", strVal,"+", strVal2, "=") + sum);
		//join메서드는 String클래스 제공 static메서드로 제일 앞은 구분자 뒤는 값을 표시
		System.out.println(strVal + "+" + strVal2 + "=" + sum2);
	}

}
