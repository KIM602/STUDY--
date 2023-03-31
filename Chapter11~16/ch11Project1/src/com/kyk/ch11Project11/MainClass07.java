package com.kyk.ch11Project11;

import java.util.Set;
import java.util.TreeSet;

//TreeSet�� �ߺ������� ���ϰ�, �ڵ������� �ʿ�� ���
public class MainClass07 {

	public static void main(String[] args) {
		//TreeSet�� ���� �������̽��� Set�� ����� SortedSet�������̽��� ����
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc"); set.add("alien"); set.add("bat");
		set.add("car"); set.add("Car"); set.add("disc");
		set.add("dance"); set.add("dZZZZ"); set.add("dzzzz");
		set.add("elephant"); set.add("elevator"); set.add("fan");
		set.add("flower");
		
		//TreeSet�� HashSet�� �ٸ��� ���ĵǾ� ����
		System.out.println(set);
		System.out.println("rage search : from " + from + " to " + to);
		System.out.println("result1 : " + set.subSet(from, to));
		//subSet(from, to)���� to�� to-1�� d-1 = c, ��ҹ��ڴ� �빮�ڰ� ����
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));
		//to�� dzzzz�ε� -1���� �̹Ƿ� dzzzy����
		
		TreeSet set1 = new TreeSet();
		
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		for(int x : score) {
			set1.add(x);
		}
		
		System.out.println("50���� ���� �� : " + set1.headSet(50)); //headSet()�� �񱳰� ������
		System.out.println("50���� ū �� : " + set1.tailSet(50)); //tailSet()�� �񱳰� ����
	}

}
