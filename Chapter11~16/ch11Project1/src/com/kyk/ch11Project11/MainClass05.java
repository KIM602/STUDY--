package com.kyk.ch11Project11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MainClass05 {

	public static void main(String[] args) {
		String[]	strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr); //������������ ����
		System.out.println("strArr=" + Arrays.toString(strArr)); //String�� Comparable������ ���� ����
		//strArr=[Dog, cat, lion, tiger] : �빮�ڰ� �ҹ��ں��� ������ ����
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending()); //�⺻ �������� ������ ������ �ƴ� �� ����� ���� ó�� �������̽� Comparator���� Ŭ���� ��ü�� ���
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		//CollectionsŬ������ �̿��Ͽ� ������ �迭
		Arrays.sort(strArr, Collections.reverseOrder());
		System.out.println("strArr=" + Arrays.toString(strArr));
	}

}

class Descending implements Comparator {
	//Comparator�������̽��� �����ϱ� ���ؼ� �߻�޼��带 ����
	@Override
	public int compare(Object o1, Object o2) {
		//��ȯ�� �����ε� -1,0,1�� ��ȯ
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			//Comparable�������̽��� java.lang�� �ִ� �⺻Ŭ����
			//Object�� �ֻ��� Ŭ�����̹Ƿ� ������ Comparable�� ��ü
			//Object�� �� ������ Comparable�� ��ȯ
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			int result = c1.compareTo(c2); // c1 < c2 -> -1, c1 == c2 -> 0, c1 > c2 -> 1
			//compareTo�� ���������� ���
			//������������ �ϱ� ���ؼ��� result�� ������ �ϱ� ���� -1�� ����
			result *= (-1);
			//�Ǵ� c2.compareTo(c1)�� ���� ������ �ٲ㵵 �ȴ�.
			return result;
		}
		return -1;
	}
}