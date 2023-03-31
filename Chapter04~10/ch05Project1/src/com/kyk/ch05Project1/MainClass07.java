package com.kyk.ch05Project1;

import java.util.Arrays;

public class MainClass07 {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12},{21,22}};
		
		System.out.println(Arrays.toString(arr));
		//Arrays.toString(1�����迭) �迭�� ���ڿ� ���·� ��ȯ [0, 1, 2, 3, 4]
		System.out.println(Arrays.deepToString(arr2D));
		//Arryas.deepToString(�������迭)�� ���ڿ��� ��ȯ [[11,12], [21, 22]]
		
		String[] str1 = {"aaa","AAA"};
		String[] str2 = {"aaa", "AAA"};
		String[][] str2D1 = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str1, str2));
		//Arrays.equals(1����, 1����)�� �� 1���� �迭�� ������ ��, ������ true
		System.out.println(Arrays.deepEquals(str2D1, str2D2));
		//Arrays.deepEquals()�� �������迭 ��
		
		int[] sortA = {3,2,0,1,4};
		Arrays.sort(sortA);
		//sort(�迭)�޼���� ��� �迭 ��ü�� ������������ �����Ѵ�.
		System.out.println(Arrays.toString(sortA));
		//�������� Arryas.sort(�迭��, Collections.reverseOrder());
		
		int[] copyArr = {0,1,2,3,4};
		int[] copyArr1 = Arrays.copyOf(copyArr, copyArr.length);
		//{0,1,2,3,4}
		int[] copyArr2 = Arrays.copyOfRange(copyArr1, 2, 4);
		//���ι�ȣ 2������ 4-1���� ���� {2,3}
		//����� System.arraycopy()�޼��嵵 ��� �� ���ִ�.
	}
}
