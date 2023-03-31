package com.kyk.ch03Project4;

public class MainClass07 {

	public static void main(String[] args) {
		
		double pi = 3.141592;
		long result = Math.round(pi);
		//round(double형 값)이며 long형으로 반환(소수점 첫번째에서 반올림)
		System.out.println("result : " + result);
		
		//소수점 여러자리를 이용하여 반올림시 자리수 만큼 10의 자리승 만큼 정수로 곱한뒤 그 수만큼 소수점으로 나눔
		double shortPi = Math.round(pi * 1000) / 1000.0;
		//3.141592 * 1000의 더블형 3141.592의 소수점 첫번째에서 반올림 3142
		//3142 / 1000.0이면 더블형 3.142
		System.out.println(shortPi);
	}
}
