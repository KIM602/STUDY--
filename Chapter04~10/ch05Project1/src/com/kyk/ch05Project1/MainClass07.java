package com.kyk.ch05Project1;

import java.util.Arrays;

public class MainClass07 {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12},{21,22}};
		
		System.out.println(Arrays.toString(arr));
		//Arrays.toString(1차원배열) 배열은 문자열 형태로 변환 [0, 1, 2, 3, 4]
		System.out.println(Arrays.deepToString(arr2D));
		//Arryas.deepToString(다차원배열)은 문자열로 변환 [[11,12], [21, 22]]
		
		String[] str1 = {"aaa","AAA"};
		String[] str2 = {"aaa", "AAA"};
		String[][] str2D1 = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str1, str2));
		//Arrays.equals(1차원, 1차원)은 두 1차원 배열이 같은지 비교, 같으면 true
		System.out.println(Arrays.deepEquals(str2D1, str2D2));
		//Arrays.deepEquals()는 다차원배열 비교
		
		int[] sortA = {3,2,0,1,4};
		Arrays.sort(sortA);
		//sort(배열)메서드는 대상 배열 자체를 오름차순으로 정렬한다.
		System.out.println(Arrays.toString(sortA));
		//역정렬은 Arryas.sort(배열명, Collections.reverseOrder());
		
		int[] copyArr = {0,1,2,3,4};
		int[] copyArr1 = Arrays.copyOf(copyArr, copyArr.length);
		//{0,1,2,3,4}
		int[] copyArr2 = Arrays.copyOfRange(copyArr1, 2, 4);
		//색인번호 2번부터 4-1까지 복사 {2,3}
		//복사는 System.arraycopy()메서드도 사용 할 수있다.
	}
}
