package com.kyk.ch11Project11;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass01 {

	public static void main(String[] args) {
		//ArrayList list1 = new ArrayList(10); // 10�� ũ�⸦ ���� ��ü ����
		// �Ʒ�ó�� ���׸��� ����ؾ� �ϳ� ��� ���ص� ��
		ArrayList <Integer>list1 = new ArrayList<Integer>(10);
		// ArrayList�� ������
		/*
		 * ArrayList() // <- �⺻�� Ÿ��
		 * 
		 * ArrayList(int initialCapacity)  // <- �Ķ��Ÿ�� ũ�� ����
		 * 
		 * ArrayList(Collection<? extends E> c) // <- Collection��ü ���
		 */
		
		// ArrayList��ü�� ���� ���Խô� add(Object o)
		list1.add(new Integer(5)); // �ڵ� ����ڽ��� �Ǵϱ�  list1.add(5);  �̷��� ���൵ ��
		list1.add(4);
		list1.add(2);
		list1.add(0);
//		list1.add("stirng");
		list1.add(3);
		print (list1);
		
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		// List<Integer> java.util.ArrayList.subList(int fromIndex, int toIndex)
		// list1��ü�� ���ۻ��ι�ȣ�� 1���� �� ���ι�ȣ (4-1) ������ ���Ҹ� ���� ArrayList ��ȯ�ض�
		
//		System.out.println("list1 = " + list1);
//		System.out.println("list2 = " + list2);
		
		print(list1,list2);
		
		Collections.sort(list1); // Collections�� �������̽� Collection�� ������ ������ ���հ��� ���� ó���� ����ϴ� Ŭ����
		// sort�޼���� static�޼���� List��ü�� ���Ҹ� �ø��������� ����(�ڱ� �ڽ� ��ü�� ����)
		Collections.sort(list2);
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2):" + list2.containsAll(list2));
		// boolean java.util.AbstractCollection.containsAll(Collection<?> c)
		// containsAll(collection��ü)�޼���� �Ķ������ 
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A"); // ���ι�ȣ 3���� "A"�� �߰�
		print(list1,list2);
		
		list2.set(3, "AA"); // ���ι�ȣ 3���� "AA"�� ����
		
		print(list1,list2);
		
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
		// list1.retainAll(list2)�� list1���� list2���Ҹ� ����� ���� 
		print(list1, list2);
		
		// list2���� list1�� ���Ե� ��ü���� �����Ѵ�.
		// list2�� ������ ���ҿ� ���� list1�� �װ��� �����ϰ� ������ ���� 
		for(int i = list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i))) {
				// contains(Object o)�� o���� ������ ������ true
				// get(index i)�� ���ι�ȣ i�� ���Ұ��� ��ȯ
				list2.remove(i);
				// remove(index i)�� ���ι�ȣ i�� ���� ����
			}
		}
		
		print(list1, list2);
		
	}

	private static void print(ArrayList<Integer>list1) {
		System.out.println("ù��° list1 = " + list1);
		
	}

	private static void print(ArrayList<Integer> list1, ArrayList<Integer>list2) {
		// TODO Auto-generated method stubs
		System.out.println("list1 = " + list1);
		System.out.println("list2 = " + list2);
		System.out.println();
		
	}
	


}
