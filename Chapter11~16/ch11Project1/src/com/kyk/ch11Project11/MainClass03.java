package com.kyk.ch11Project11;

import java.util.ArrayList;
import java.util.Iterator;

// Collection을 반복처리하는 Iterator인터페이스와 메서드
// Collection을 상속하는 List와 Set에서 사용 가능
// Collection알 상속하지 않는 Map에서는 entrySet()메서드로 Set객체를 얻은 뒤에 사용
public class MainClass03 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		// 제너릭을 사용한 ArrayList객체 생성 , list의 원소는 String타임이다.
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		// Iterator객체 생성은 Collection의 iterator()메서드로 생성
		// Iterator는 Enumeration인퍼테이스를 개선한 인터페이스
		Iterator it = list.iterator();
		while(it.hasNext()) { 
			
			// hasNext()남은 원소가 있는가 파악 
			Object obj = it.next(); // next()는 다음 원소를 순서대로 반환
			
			System.out.println(obj);
			
		}
		
		
	}

}
