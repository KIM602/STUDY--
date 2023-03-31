package com.kyk.ch11Project11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import static java.util.Collections.*; //CollectionsŬ������ ��� �޼��� ���� CollectionsŬ���� ����

//CollectionsŬ������ Collection(���յ�����)�� ó���ϴ� ���� static�޼������ �����ϴ� Ŭ������
//�迭�� ArraysŬ������ ������ ��� ���� ������
public class MainClass10 {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		
		addAll(list, 1,2,3,4,5); //list��ü�� 1,2,3,4,5���� �߰�
		System.out.println(list);
		
		rotate(list, 2); //���������� ��ĭ�� �̵�?(���� ���� 2ĭ �ڷ�, ��ġ�� ���� ������)
		System.out.println(list);
		
		swap(list, 0, 2); //ù��°�� ����°�� ��ȯ(swap)
		System.out.println(list);
		
		shuffle(list);
		System.out.println(list);
		
		sort(list, reverseOrder()); //���� ����(��������-descending) reverse(list);�� ����
		System.out.println(list);
		
		sort(list); //��������(ascending) ����
		System.out.println(list);
		
		int idx = binarySearch(list, 3); //3�� ����� ��ġ(index)�� ��ȯ
		System.out.println("index of 3 = " + idx);
		
		System.out.println("max = " + max(list));
		System.out.println("min = " + min(list));
		System.out.println("min = " + max(list, reverseOrder()));
		
		fill(list, 9); //list�� 9�� ä���
		System.out.println("list = " + list);
		
		//list�� ���� ũ���� ���ο� list�� �����ϰ� 2�� ä���. ��, ����� ����Ұ�
		List newList = nCopies(list.size(), 2); //nCopies(ũ��,ä�ﰪ)
		System.out.println("newList = " + newList);
		
		//Collections.copy(����� ��ü, ���� ��ü);
		copy(list, newList);
		System.out.println("newList = " + newList);
		System.out.println("list = " + list);
		
		replaceAll(list, 2, 1);
		//Collections.replaceAll(��ü, ���� ��, ��ü�� ��)
		System.out.println("list = " + list);
		
		Enumeration e = enumeration(list);
		//Collections.enumeraion(collection ��ü)�� collection��ü�� �ݺ���ü Enumeration�� ��ȯ
		
		ArrayList list2 = list(e);
		//Collections.list(enumeration��ü�� ��ȯ
		System.out.println("list2 = " + list2);
		
		List list3 = new ArrayList();
		List checkedlist = checkedList(list3, String.class);
		//checkedList(list3, String.class)�޼���� list3��ü�� ���Ҵ� String���� ����
		checkedlist.add("abc");
		checkedlist.add(1); //���Ұ��� String.calss�� �����Ϸ� ���ڸ� �߰��ϸ� ����
		
	}

}
