package com.kyk.ch11Project11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import static java.util.Collections.*; //Collections클래스의 모든 메서드 사용시 Collections클래스 생략

//Collections클래스는 Collection(집합데이터)를 처리하는 편리한 static메서드들을 제공하는 클래스임
//배열은 Arrays클래스가 있으며 기능 또한 유사함
public class MainClass10 {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		
		addAll(list, 1,2,3,4,5); //list객체에 1,2,3,4,5값을 추가
		System.out.println(list);
		
		rotate(list, 2); //오른쪽으로 두칸씩 이동?(앞의 것은 2칸 뒤로, 넘치는 것은 앞으로)
		System.out.println(list);
		
		swap(list, 0, 2); //첫번째와 세번째를 교환(swap)
		System.out.println(list);
		
		shuffle(list);
		System.out.println(list);
		
		sort(list, reverseOrder()); //역순 정렬(내림차순-descending) reverse(list);와 동일
		System.out.println(list);
		
		sort(list); //오름차순(ascending) 정렬
		System.out.println(list);
		
		int idx = binarySearch(list, 3); //3이 저장된 위치(index)를 반환
		System.out.println("index of 3 = " + idx);
		
		System.out.println("max = " + max(list));
		System.out.println("min = " + min(list));
		System.out.println("min = " + max(list, reverseOrder()));
		
		fill(list, 9); //list를 9로 채운다
		System.out.println("list = " + list);
		
		//list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 단, 결과는 변경불가
		List newList = nCopies(list.size(), 2); //nCopies(크기,채울값)
		System.out.println("newList = " + newList);
		
		//Collections.copy(복사될 객체, 원래 객체);
		copy(list, newList);
		System.out.println("newList = " + newList);
		System.out.println("list = " + list);
		
		replaceAll(list, 2, 1);
		//Collections.replaceAll(객체, 원래 값, 교체할 값)
		System.out.println("list = " + list);
		
		Enumeration e = enumeration(list);
		//Collections.enumeraion(collection 객체)는 collection객체를 반복객체 Enumeration를 반환
		
		ArrayList list2 = list(e);
		//Collections.list(enumeration객체를 반환
		System.out.println("list2 = " + list2);
		
		List list3 = new ArrayList();
		List checkedlist = checkedList(list3, String.class);
		//checkedList(list3, String.class)메서드는 list3객체의 원소는 String으로 제한
		checkedlist.add("abc");
		checkedlist.add(1); //원소값을 String.calss로 지정하려 숫자를 추가하면 에러
		
	}

}
