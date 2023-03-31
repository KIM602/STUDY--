package com.kyk.ch11Project11;

import java.util.ArrayList;
import java.util.Iterator;

// Collection�� �ݺ�ó���ϴ� Iterator�������̽��� �޼���
// Collection�� ����ϴ� List�� Set���� ��� ����
// Collection�� ������� �ʴ� Map������ entrySet()�޼���� Set��ü�� ���� �ڿ� ���
public class MainClass03 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		// ���ʸ��� ����� ArrayList��ü ���� , list�� ���Ҵ� StringŸ���̴�.
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		// Iterator��ü ������ Collection�� iterator()�޼���� ����
		// Iterator�� Enumeration�������̽��� ������ �������̽�
		Iterator it = list.iterator();
		while(it.hasNext()) { 
			
			// hasNext()���� ���Ұ� �ִ°� �ľ� 
			Object obj = it.next(); // next()�� ���� ���Ҹ� ������� ��ȯ
			
			System.out.println(obj);
			
		}
		
		
	}

}
