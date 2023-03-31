package com.kyk.ch11Project11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainClass04 {

	public static void main(String[] args) {
		
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = { {11,12,13} , {21,22,23} } ;
		
		System.out.println("arr = " + Arrays.toString(arr)); // 1차원배열은 Arrays.toString(arr)
		System.out.println("arr2D = " + Arrays.deepToString(arr2D)); // 2차원 배열은 deepToString(arr2D)
		
		int[] arr2 = Arrays.copyOf(arr, arr.length); // arr배열을 원소개수만큼 arr2배열에 복사
		int[] arr3 = Arrays.copyOf(arr, 3); // arr 배열의 앞에서 원소 3개를 arr2배열에 복사
		int[] arr4 = Arrays.copyOf(arr, 7); // arr 배열의 앞에서 원소 7개를 arr2배열에 복사하는데 추가되는 원소는 배열의 기본값으로 채움
		
		System.out.println("arr2 = " + Arrays.toString(arr2)); 
		System.out.println("arr3 = " + Arrays.toString(arr3));
		System.out.println("arr4 = " + Arrays.toString(arr4));
		
		int[] arr5 = Arrays.copyOfRange(arr, 2,4); // arr배열의 색인번호 2번부터 (4-1해서 3)번까지 원소를 arr5에 복사
		int[] arr6 = Arrays.copyOfRange(arr, 0,7); // arr배열의 색인번호 0번부터 (7-1해서 6)번까지 원소를 arr6에 복사
		
		System.out.println("arr5 = " + Arrays.toString(arr5)); 
		System.out.println("arr6 = " + Arrays.toString(arr6));
		
		int[] arr7 = new int[5]; 
		Arrays.fill(arr7, 9); // arr7배열 원소 모두를 9로 채움
		System.out.println("arr7 = " + Arrays.toString(arr7));
		
		int[] arr8 = new int[8];
		Arrays.setAll(arr8, i -> (int)(Math.random()*6)+1); // 람다식 arr8에 배열크기(8)수만큼 1~6랜덤수로 채워짐 
		System.out.println("arr8 = " + Arrays.toString(arr8));
		
		for(int i : arr8) { // arr8배열의 크기만큼 반복함 (즉 8만큼)
			char[] graph = new char[i]; // 캐릭터형 배열 graph를 arr8안에 배열숫자 만큼 생성함
			Arrays.fill(graph, '*'); // graph배열을 '*'로 채워둠
			System.out.println("graph = " + Arrays.toString(graph));
		}
		
		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2)); // 2차원 배열은 equals로 비교하면 false  객체 주소가 다르기떄문 
		System.out.println(Arrays.deepEquals(str2D, str2D2)); // 2차월 배열은 deepEquals로 비교하면 true
		
		char[] chArr = {'A','D','C','B','E' };
		System.out.println("chArr = " + Arrays.toString(chArr));
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));
		// binarySearch(chArr, 'B')메서드는 2진검색메서드르 chArr배열에서 값 B를 2진검색으로 찾는것으로 색인번호를 반환
		// 정렬하지 않고 2진검색 메서드를 사용하면 엉뚱한 색인번호를 반환 ( 마이너스 색인번호 등)
		// 그래서 아래 식처럼 sort를 사용하여 정렬을 해서 사용
		System.out.println("= After sorting =");
		Arrays.sort(chArr); // chArr을 올림차순으로 정렬
		System.out.println("chArr = " + Arrays.toString(chArr));
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));
		// 만약 찾는 'B'가 배열안에 2개가 있다면 더 뒤에있는 2번째 색인번호를 반환함
		
		List list = Arrays.asList(1,2,3,4,5);
		System.out.println("list" + list);
		// <Object> List<Object> java.util.Arrays.asList(Object... a)
		// 파라메터에 ... 으로 된것은 가변 파라메터로 파라메터 숫자를 마음대로 사용
		// asList메서드는 배열을 List 객체로 변환 
		// list.add(6); 처럼 asList로 변환한 list는 크기 변경이 안됨
		List list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		// ArrayList생성시 asList로 생성된 list객체를 파라메터로 사용하면 변경 가능 
		list1.add(6);
		// ( 배열 크기 변경 가능)
		System.out.println("크기 변경을 한 list1 = " + list1);
		
	}

}
