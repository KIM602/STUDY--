package com.kyk.ch11Project11;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass01 {

	public static void main(String[] args) {
		//ArrayList list1 = new ArrayList(10); // 10의 크기를 갖는 객체 생성
		// 아래처럼 지네릭을 사용해야 하나 사용 안해도 됨
		ArrayList <Integer>list1 = new ArrayList<Integer>(10);
		// ArrayList의 생성자
		/*
		 * ArrayList() // <- 기본형 타입
		 * 
		 * ArrayList(int initialCapacity)  // <- 파라메타로 크기 지정
		 * 
		 * ArrayList(Collection<? extends E> c) // <- Collection객체 사용
		 */
		
		// ArrayList객체에 값을 대입시는 add(Object o)
		list1.add(new Integer(5)); // 자동 오토박싱이 되니까  list1.add(5);  이렇게 써줘도 됨
		list1.add(4);
		list1.add(2);
		list1.add(0);
//		list1.add("stirng");
		list1.add(3);
		print (list1);
		
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		// List<Integer> java.util.ArrayList.subList(int fromIndex, int toIndex)
		// list1객체의 시작색인번호가 1에서 끝 색인번호 (4-1) 까지의 원소를 가진 ArrayList 반환해라
		
//		System.out.println("list1 = " + list1);
//		System.out.println("list2 = " + list2);
		
		print(list1,list2);
		
		Collections.sort(list1); // Collections은 인터페이스 Collection과 무관한 데이터 집합관련 여러 처리를 담당하는 클래스
		// sort메서드는 static메서드로 List객체의 원소를 올림차순으로 정렬(자기 자신 객체를 정렬)
		Collections.sort(list2);
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2):" + list2.containsAll(list2));
		// boolean java.util.AbstractCollection.containsAll(Collection<?> c)
		// containsAll(collection객체)메서드는 파라메터의 
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A"); // 색인번호 3번을 "A"를 추가
		print(list1,list2);
		
		list2.set(3, "AA"); // 색인번호 3번은 "AA"를 변경
		
		print(list1,list2);
		
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
		// list1.retainAll(list2)는 list1에서 list2원소만 남기고 삭제 
		print(list1, list2);
		
		// list2에서 list1에 포함된 객체들을 삭제한다.
		// list2의 각각의 원소에 대해 list1이 그값을 포함하고 있으면 지움 
		for(int i = list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i))) {
				// contains(Object o)는 o값을 가지고 있으면 true
				// get(index i)는 색인번호 i의 원소값을 반환
				list2.remove(i);
				// remove(index i)는 색인번호 i의 원소 제거
			}
		}
		
		print(list1, list2);
		
	}

	private static void print(ArrayList<Integer>list1) {
		System.out.println("첫번째 list1 = " + list1);
		
	}

	private static void print(ArrayList<Integer> list1, ArrayList<Integer>list2) {
		// TODO Auto-generated method stubs
		System.out.println("list1 = " + list1);
		System.out.println("list2 = " + list2);
		System.out.println();
		
	}
	


}
