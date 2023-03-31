package com.kyk.ch09Project1;

//String에서 동일한 리터럴은 한군데에 저장
//그 값을 가진 인스턴스변수는 동일 주소를 지님

public class MainClass05 {

	public static void main(String[] args) {
		String s1 = "AAA";
		String s2 = "AAA";
		String s3 = "AAA";
		//s1,s2,s3는 동일 주소를 지님( == 연산자로 비교시에도 true)
		String s4 = "BBB";
	}

}
