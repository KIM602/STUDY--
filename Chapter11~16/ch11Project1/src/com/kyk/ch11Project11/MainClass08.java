package com.kyk.ch11Project11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainClass08 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		//�⺻�� ������ ��� -- ����ִ� ��ü�� ����
		/*
		 * �����ڵ�
		 * HashMap(int initialCapacity) : �뷮 ���
		 * HashMap(int initialCapacity, float loadFactor)
		 * HashMap(Map m) : Map��ü ���(HashMap, TreeMap, HashTable, LinkdHashMap) 
		 */
		//map�� ������ �߰��� put�޼��� ���
		//public V put(K key,V value)�� ��ȯ�� �Ķ������ V��(���� ��������, K�� key�� �������� ���� )
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234"); //key�� �ߺ��� �������� �ٲپ� ����
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("id�� password�� �Է����ּ���.");
			System.out.println("id : ");
			String id = s.nextLine().trim(); //trim()�� ��,�� ���� ����
			
			System.out.println("password : ");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) { //containsKey(id)�� id�� �ش��ϴ� key�� �ִ��� ���� �Ǵ�
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
			
			if(!(map.get(id)).equals(password)) { //get(id)�� Ű�� id�� �ش�Ű�� ���� ��ȯ
				//key�� id�� ���� password�� ��
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
			}
			
			else {
				System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�.");
				break;
			}
		}
		
		HashMap map1 = new HashMap();
		map1.put("���ڹ�", 90); //key�� String, value�� int
		map1.put("���ڹ�", 100); //key�� �ߺ��� ���� ������ ��ü
		map1.put("���ڹ�", 100);
		map1.put("���ڹ�", 80);
		map1.put("���ڹ�", 90);
		
		//Map�� Iterator�� �����ϴ� �޼��尡 ����, Set��ü�� �����ϴ� �޼��� entrySet()�� ����
		Set set = map1.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			//next()�޼���� Object�� ��ȯ�ϴµ� Map�� key�� value�� ���� ���������� Map.Entry�� ����ȯ
			Map.Entry e = (Map.Entry)it.next();
			//Map.EntryŬ������ Ű���� ��ȯ�ϴ� getkey()�� ���� ��ȯ�ϴ� getvalue()�޼��带 ����
			System.out.println("�̸� : "+ e.getKey() + ", ���� : " + e.getValue());
		}
		
		set = map1.keySet(); //key�� ��ȯ�Ͽ� Set�� ����
		System.out.println("������ ��� : " + set);
		
		Collection values = map1.values(); //map���� ���� �����Ͽ� Collection��ü�� ����
		
		it = values.iterator();
		int total = 0;
		while(it.hasNext()) {
			int i = (int)it.next();
			total += i;
		}
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + (float)total/set.size());
		//CollectionsŬ������ max�� min�޼���� Collection�� �ִ�, �ּҰ��� ����
		System.out.println("�ְ����� : " + Collections.max(values));
		System.out.println("�������� : " + Collections.min(values));
	} 

}
