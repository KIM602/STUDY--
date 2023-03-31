package com.kyk.ch11Project11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainClass04 {

	public static void main(String[] args) {
		
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = { {11,12,13} , {21,22,23} } ;
		
		System.out.println("arr = " + Arrays.toString(arr)); // 1�����迭�� Arrays.toString(arr)
		System.out.println("arr2D = " + Arrays.deepToString(arr2D)); // 2���� �迭�� deepToString(arr2D)
		
		int[] arr2 = Arrays.copyOf(arr, arr.length); // arr�迭�� ���Ұ�����ŭ arr2�迭�� ����
		int[] arr3 = Arrays.copyOf(arr, 3); // arr �迭�� �տ��� ���� 3���� arr2�迭�� ����
		int[] arr4 = Arrays.copyOf(arr, 7); // arr �迭�� �տ��� ���� 7���� arr2�迭�� �����ϴµ� �߰��Ǵ� ���Ҵ� �迭�� �⺻������ ä��
		
		System.out.println("arr2 = " + Arrays.toString(arr2)); 
		System.out.println("arr3 = " + Arrays.toString(arr3));
		System.out.println("arr4 = " + Arrays.toString(arr4));
		
		int[] arr5 = Arrays.copyOfRange(arr, 2,4); // arr�迭�� ���ι�ȣ 2������ (4-1�ؼ� 3)������ ���Ҹ� arr5�� ����
		int[] arr6 = Arrays.copyOfRange(arr, 0,7); // arr�迭�� ���ι�ȣ 0������ (7-1�ؼ� 6)������ ���Ҹ� arr6�� ����
		
		System.out.println("arr5 = " + Arrays.toString(arr5)); 
		System.out.println("arr6 = " + Arrays.toString(arr6));
		
		int[] arr7 = new int[5]; 
		Arrays.fill(arr7, 9); // arr7�迭 ���� ��θ� 9�� ä��
		System.out.println("arr7 = " + Arrays.toString(arr7));
		
		int[] arr8 = new int[8];
		Arrays.setAll(arr8, i -> (int)(Math.random()*6)+1); // ���ٽ� arr8�� �迭ũ��(8)����ŭ 1~6�������� ä���� 
		System.out.println("arr8 = " + Arrays.toString(arr8));
		
		for(int i : arr8) { // arr8�迭�� ũ�⸸ŭ �ݺ��� (�� 8��ŭ)
			char[] graph = new char[i]; // ĳ������ �迭 graph�� arr8�ȿ� �迭���� ��ŭ ������
			Arrays.fill(graph, '*'); // graph�迭�� '*'�� ä����
			System.out.println("graph = " + Arrays.toString(graph));
		}
		
		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2)); // 2���� �迭�� equals�� ���ϸ� false  ��ü �ּҰ� �ٸ��⋚�� 
		System.out.println(Arrays.deepEquals(str2D, str2D2)); // 2���� �迭�� deepEquals�� ���ϸ� true
		
		char[] chArr = {'A','D','C','B','E' };
		System.out.println("chArr = " + Arrays.toString(chArr));
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));
		// binarySearch(chArr, 'B')�޼���� 2���˻��޼��帣 chArr�迭���� �� B�� 2���˻����� ã�°����� ���ι�ȣ�� ��ȯ
		// �������� �ʰ� 2���˻� �޼��带 ����ϸ� ������ ���ι�ȣ�� ��ȯ ( ���̳ʽ� ���ι�ȣ ��)
		// �׷��� �Ʒ� ��ó�� sort�� ����Ͽ� ������ �ؼ� ���
		System.out.println("= After sorting =");
		Arrays.sort(chArr); // chArr�� �ø��������� ����
		System.out.println("chArr = " + Arrays.toString(chArr));
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));
		// ���� ã�� 'B'�� �迭�ȿ� 2���� �ִٸ� �� �ڿ��ִ� 2��° ���ι�ȣ�� ��ȯ��
		
		List list = Arrays.asList(1,2,3,4,5);
		System.out.println("list" + list);
		// <Object> List<Object> java.util.Arrays.asList(Object... a)
		// �Ķ���Ϳ� ... ���� �Ȱ��� ���� �Ķ���ͷ� �Ķ���� ���ڸ� ������� ���
		// asList�޼���� �迭�� List ��ü�� ��ȯ 
		// list.add(6); ó�� asList�� ��ȯ�� list�� ũ�� ������ �ȵ�
		List list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		// ArrayList������ asList�� ������ list��ü�� �Ķ���ͷ� ����ϸ� ���� ���� 
		list1.add(6);
		// ( �迭 ũ�� ���� ����)
		System.out.println("ũ�� ������ �� list1 = " + list1);
		
	}

}
