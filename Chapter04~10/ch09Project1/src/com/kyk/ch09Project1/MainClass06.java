package com.kyk.ch09Project1;

public class MainClass06 {

	public static void main(String[] args) {
		//길이가 0인 char배열을 생성한다.(모든 데이터형에 대해서도 길이가 0인 배열 가능)
		char[] cArr = new char[0]; //char[] cArr = ();
		String s = new String(cArr); //String s = new String("");와 같다.
		
		System.out.println("cArr.length=" + cArr.length);
		System.out.println("@@@" + s + "@@@");
		
		//아무것도 없는 초기값은 String은 String str = null;보다 str = ""로 해주는 것이 좋음
		//char의 초기값은 char ch = \u0000;보다 ch = ' ';로 해주는 것이 좋음
	}

}
