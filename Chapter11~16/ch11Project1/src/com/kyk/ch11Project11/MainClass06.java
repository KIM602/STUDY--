package com.kyk.ch11Project11;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MainClass06 {

	public static void main(String[] args) {
		Object[]	objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
		
		Set set = new HashSet();
		//��ü������ �������̽���ü�� �����ϰ� ������ �� �������̽��� ������ Ŭ���� ��ü�� ����(������)
		for(int i=0; i < objArr.length; i++) {
			set.add(objArr[i]); //�ߺ��� ���� ���� �����ϰ� �ߺ� �ȵ� ���� ����
		}
		System.out.println(set);
		
		Iterator it = set.iterator(); //Collection�� ��ü���� iterator() ��� ����
		//set��ü�� �ݺ��Ͽ� �˻��� �� �ִ� Iterator��ü�� ��ȯ
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set set1 = new HashSet();
		for (int i = 0; set1.size() < 6; i++) {
			int num = (int)(Math.random() * 45) + 1; //1~45������ �ζ� ��ȣ ����
			set1.add(num);
		}
		
		//������ ���ؼ��� LinkdedList�� ��ȯ
		List list = new LinkedList(set1); //LinkedList�����ڿ��� Collection��ü�� �־ ��� ����
		Collections.sort(list);
		
		System.out.println(list);
	}

}
