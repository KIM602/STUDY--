package com.kyk.ch03Project4;

public class MainClass03 {

	public static void main(String[] args) {
		int x = 10;
		int y = 8;
		
		System.out.printf("%d을%d로 나누면,%n",x,y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x/y,x%y);
		
		//x % y에서 %는 나머지 구하기 연산자(모듈러스연산자)로 나머지 값 반환
		//printf는 출력문 중 형식을 지정할 시 사용 %d지시자는 10진수로 표시, %n은 줄바꾸기
		
		boolean b = (0.1 == 0.1f); //==은 데이터형 비교
		System.out.println(b);
		double a = 0.1;
		float c = 0.1f;
		
	}

}
