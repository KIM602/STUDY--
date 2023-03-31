package com.kyk.ch10Project1;

import java.text.DecimalFormat;

//숫자를 원하는 형식의 문자열로 처리하는 DecimalFormat클래스
public class MainClass03 {

	public static void main(String[] args) {
		double num = 1234567.89;
		DecimalFormat df = new DecimalFormat("0");
		//패턴 "0"은 십진수로 반올림한 정수부분만 10진수 반환
		System.out.println(df.format(num)); //1234568
		
		df = new DecimalFormat("0.0");
		//패턴 "0.0"은 정수와 반올림된 소수점 첫번째 까지 처리
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000000000.00000");
		//"0000000000.00000"패턴은 정수는 10자리, 소수점은 5자리로 처리하는데 없는 부분은 0으로 처리
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		//"#"패턴은 10진수로 정수부분만 처리하고 없는 부분을 0으로 처리 안함(반올림)
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		//"0.0"과 유사, 없는부분은 처리 안함
		System.out.println(df.format(num));
		
		df = new DecimalFormat("##########.#####");
		//"0000000000.00000"과 유사하나 자리수 부분은 처리 안함
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0");
		//"#,###.0"패턴은 숫자를 10진수로 처리하고 소수점은 한자리로 표시하는데 숫자를 세자리마다 구분표시, 사용ㅜ
		System.out.println(df.format(num));
	}

}
