package com.kyk.ch11Project11;

import java.util.Set;
import java.util.TreeSet;

//TreeSet은 중복저장을 피하고, 자동정렬이 필요시 사용
public class MainClass07 {

	public static void main(String[] args) {
		//TreeSet은 상위 인터페이스가 Set을 상속한 SortedSet인터페이스를 가짐
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc"); set.add("alien"); set.add("bat");
		set.add("car"); set.add("Car"); set.add("disc");
		set.add("dance"); set.add("dZZZZ"); set.add("dzzzz");
		set.add("elephant"); set.add("elevator"); set.add("fan");
		set.add("flower");
		
		//TreeSet은 HashSet과 다르게 정렬되어 저장
		System.out.println(set);
		System.out.println("rage search : from " + from + " to " + to);
		System.out.println("result1 : " + set.subSet(from, to));
		//subSet(from, to)에서 to는 to-1로 d-1 = c, 대소문자는 대문자가 빠름
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));
		//to는 dzzzz인데 -1까지 이므로 dzzzy까지
		
		TreeSet set1 = new TreeSet();
		
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		for(int x : score) {
			set1.add(x);
		}
		
		System.out.println("50보다 작은 값 : " + set1.headSet(50)); //headSet()은 비교값 비포함
		System.out.println("50보다 큰 값 : " + set1.tailSet(50)); //tailSet()은 비교값 포함
	}

}
