package com.kyk.ch11Project11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MainClass05 {

	public static void main(String[] args) {
		String[]	strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr); //오름차순으로 정렬
		System.out.println("strArr=" + Arrays.toString(strArr)); //String의 Comparable구현에 의한 정렬
		//strArr=[Dog, cat, lion, tiger] : 대문자가 소문자보다 순서가 빠름
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending()); //기본 오름차순 숫자형 정렬이 아닐 시 비기준 정렬 처리 인터페이스 Comparator구현 클래스 객체를 사용
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		//Collections클래스를 이용하여 역으로 배열
		Arrays.sort(strArr, Collections.reverseOrder());
		System.out.println("strArr=" + Arrays.toString(strArr));
	}

}

class Descending implements Comparator {
	//Comparator인터페이스를 구현하기 위해서 추상메서드를 구현
	@Override
	public int compare(Object o1, Object o2) {
		//반환은 정수인데 -1,0,1을 반환
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			//Comparable인터페이스는 java.lang에 있는 기본클래스
			//Object는 최상위 클래스이므로 하위인 Comparable의 객체
			//Object를 비교 가능한 Comparable로 변환
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			int result = c1.compareTo(c2); // c1 < c2 -> -1, c1 == c2 -> 0, c1 > c2 -> 1
			//compareTo는 오름차순에 사용
			//내림차순으로 하기 위해서는 result를 역으로 하기 위해 -1을 곱함
			result *= (-1);
			//또는 c2.compareTo(c1)와 같이 순서를 바꿔도 된다.
			return result;
		}
		return -1;
	}
}