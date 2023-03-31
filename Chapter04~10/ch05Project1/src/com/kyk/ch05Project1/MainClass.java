package com.kyk.ch05Project1;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		int[] iArr1 = new int[10]; //배열 iArr1은 정수 int배열이고 new키워드로 크기가 10인 배열을 생성(메모리 확보)
		int[] iArr2 = new int[10]; //int iArr2[]처럼 배열첨자 []가 배열명 뒤에 와도 무방
		int[] iArr3 = new int[]{100, 95, 80, 70, 60}; //new 생성시 크기는 생략하고 배열 값 {100, 95, 80, 70, 60}를 이용, 알아서 크기 결정
		int[] iArr4 = {100, 95, 80, 70, 60}; //선언과 동시에 배열 값 {값들     }을 이용하여 초기화, 선언과 초기화를 구분하면 에러
		char[] chArr = {'a','b','c','d'};
		
		//메모리 공간만 확보된 iArr1과 iArr2에 각 원소값을 넣어줌
		for(int i = 0 ; i < iArr1.length ; i++) {
			//iArr1.length는 iArr1배열의 크기 즉 10임
			iArr1[i] = i + 1; //즉 iArr1배열 원소에 1부터 10을 집어 넣음 {1,2,3,4,5,6,7,8,9,10}
			//iArr1[i]는 i번째 원소를 지정
		}
		for(int i = 0 ; i < iArr2.length ; i++) {
			iArr2[i] = (int)(Math.random() * 10) + 1; //1~10 사이의 임의의 수 
		}
		
		//배열에 저장된 값들을 출력한다.
		for(int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[i] + ",");
		}
		
		System.out.println();
		System.out.println("==================");
		for(int i = 0 ; i < iArr2.length ; i++) {	
			System.out.print(iArr2[i] + ",");
		}
		
		System.out.println();
		System.out.println("==================");
		
		//Arrays클래스의 toString(배열명)으로 변환하여 출력
		System.out.println(Arrays.toString(iArr2));
		//[8, 4, 8, 6, 4, 5, 5, 9, 5, 6]로 출력
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		//배열명으로 바로 출력하면 배열의 참조값인 주소값 출력 [I@5305068a
		System.out.println(chArr);
		//char배열은 배열명으로 직접 출력하면 , 없이 문자열형태로 출력 abcd
	}
}
