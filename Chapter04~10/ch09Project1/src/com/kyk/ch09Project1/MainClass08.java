package com.kyk.ch09Project1;

//StringBuffer객체 생성은 new StringBuffer("abc");
//StringBuffer를 String으로 변환은 toString()메서드나 new String(StringBuffer sb);

public class MainClass08 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		//new 생성자 이므로 다른 주소를 가진 인스턴스
		System.out.println("sb == sb2 ? " + (sb == sb2));
		//== 연산자는 주소를 비교하므로 false
		System.out.println("sb == sb2 ? " + sb.equals(sb2));
		//String은 equals는 값만 비교하도록 재정의 되어 있으나 StringBuffer은 오버라이드 안됨. 즉, Object사용
		//즉, 주소 비교 (false)
		
		//StringBufer의 내용을 String으로 변환한다.
		String s = sb.toString(); //StringBuffer클래스의 toString()사용하여 변환
		//String s = new String(sb); //StringBuffer객체를 String생성자의 파라메터로 사용
		String s2 = sb2.toString();
		
		System.out.println("s.equals(s2) ? " + s.equals(s2));
		//문자열의 equals는 값을 비교하도록 오버라이드 됨
	}

}
