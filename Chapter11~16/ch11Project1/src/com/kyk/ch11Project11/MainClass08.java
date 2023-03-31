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
		//기본형 생성자 사용 -- 비어있는 객체를 생성
		/*
		 * 생성자들
		 * HashMap(int initialCapacity) : 용량 사용
		 * HashMap(int initialCapacity, float loadFactor)
		 * HashMap(Map m) : Map객체 사용(HashMap, TreeMap, HashTable, LinkdHashMap) 
		 */
		//map에 데이터 추가는 put메서드 사용
		//public V put(K key,V value)로 반환은 파라메터의 V형(값의 데이터형, K는 key의 데이터형 보통 )
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234"); //key값 중복시 기존값을 바꾸어 버림
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.println("id : ");
			String id = s.nextLine().trim(); //trim()은 전,후 공백 제거
			
			System.out.println("password : ");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) { //containsKey(id)는 id에 해당하는 key가 있는지 여부 판단
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}
			
			if(!(map.get(id)).equals(password)) { //get(id)는 키값 id로 해당키의 값을 반환
				//key값 id의 값을 password와 비교
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
			}
			
			else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
		}
		
		HashMap map1 = new HashMap();
		map1.put("김자바", 90); //key는 String, value는 int
		map1.put("김자바", 100); //key값 중복시 나중 것으로 대체
		map1.put("이자바", 100);
		map1.put("강자바", 80);
		map1.put("안자바", 90);
		
		//Map은 Iterator를 생성하는 메서드가 없고, Set객체를 생성하는 메서드 entrySet()을 가짐
		Set set = map1.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			//next()메서드는 Object를 반환하는데 Map의 key와 value를 지닌 데이터형인 Map.Entry로 형변환
			Map.Entry e = (Map.Entry)it.next();
			//Map.Entry클래스는 키값을 반환하는 getkey()와 값을 반환하는 getvalue()메서드를 제공
			System.out.println("이름 : "+ e.getKey() + ", 점수 : " + e.getValue());
		}
		
		set = map1.keySet(); //key만 반환하여 Set에 저장
		System.out.println("참가자 명단 : " + set);
		
		Collection values = map1.values(); //map에서 값만 추출하여 Collection객체에 저장
		
		it = values.iterator();
		int total = 0;
		while(it.hasNext()) {
			int i = (int)it.next();
			total += i;
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		//Collections클래스의 max와 min메서드로 Collection의 최대, 최소값을 구함
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));
	} 

}
