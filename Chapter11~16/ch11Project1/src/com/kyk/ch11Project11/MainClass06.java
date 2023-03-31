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
		//객체선언은 인터페이스객체로 선언하고 대입은 그 인터페이스를 구현한 클래스 객체로 대입(다형성)
		for(int i=0; i < objArr.length; i++) {
			set.add(objArr[i]); //중복된 값은 저장 실패하고 중복 안된 값만 저장
		}
		System.out.println(set);
		
		Iterator it = set.iterator(); //Collection의 객체들은 iterator() 사용 가능
		//set객체가 반복하여 검색할 수 있는 Iterator객체로 변환
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set set1 = new HashSet();
		for (int i = 0; set1.size() < 6; i++) {
			int num = (int)(Math.random() * 45) + 1; //1~45까지의 로또 번호 생성
			set1.add(num);
		}
		
		//정렬을 위해서는 LinkdedList로 변환
		List list = new LinkedList(set1); //LinkedList생성자에는 Collection객체를 넣어서 사용 가능
		Collections.sort(list);
		
		System.out.println(list);
	}

}
