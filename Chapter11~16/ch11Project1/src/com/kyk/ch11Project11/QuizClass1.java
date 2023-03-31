package com.kyk.ch11Project11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class QuizClass1 {

	public static void main(String[] args) {
		System.out.println("//1번");
		LocalDate myDate = LocalDate.now();
		System.out.println("현재 날짜 : " + myDate);
		
		System.out.println("//2번");
		LocalTime myTime = LocalTime.now();
		System.out.println("현재 시간 : " + myTime);
		
		System.out.println("//3번");
		LocalDateTime myDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간 : " + myDateTime);
		
		//날짜 시간 표시 형식 지정은 DateTimeFormatter클래스 이용
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:MM:SS");
		String formattedDate = myDateTime.format(myFormatObj);
		System.out.println("After formatting : " + formattedDate);;
		
		System.out.println("//4번");
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("HyunDai");
		cars.add("Kia");
		System.out.println(cars);
		System.out.println(cars.size());
		System.out.println(cars.get(0));
		cars.set(0, "Opel");
		System.out.println(cars);
		
		System.out.println("//5번");
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		
		System.out.println(capitalCities);
		System.out.println(capitalCities.get("England")); //key로 value을 구할시
		System.out.println(capitalCities.size());
		
		for (String i : capitalCities.keySet()) {
			System.out.println(i);
		}
		
		for (String i : capitalCities.values()) {
			System.out.println(i);
		}
		
		System.out.println("//6번");
		Set<String> auto = new HashSet<String>();
		//auto.addAll(cars);
		auto.add("Volvo");
		auto.add("BMW");
		auto.add("Ford");
		auto.add("HyunDai");
		auto.add("kia");
		
		for(String a : auto) {
			System.out.println(a);
		}
		
		System.out.println("//7번");
		Iterator<String> it = cars.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}

/*
 * 1. 우리나라의 현재 날짜를 myDate객체로 만들고 출력
 * 2. 우리나라의 현재 시간을 myTime객체로 만들고 출력
 * 3. 우리나라의 현재 날짜와 시간을 myDateTIme 객체로 만들고 출력
 * 4. List객체 cars를 만들고 Volvo, BMW, Ford, HyunDai, Kia를 추가하고 출력(모두 문자열이니까 제네릭 String을 사용)
 *    원소갯수를 출력
 *    첫번째 차이름 출력
 *    첫번째 차이름을 Opel로 교체
 * 5. key와 value 모두 String인 map객체 capitalCities를 만듬(가장 많이 사용하는 MAP으로)
 *    key와 값이 다음과 같을시 map에 추가하시오    
 *    "England", "London"
 *    "Germany", "Berlin"
 *    "Norway", "Oslo"
 *    "USA", "Washington DC"
 *    map을 출력하시오
 *    key가 England인 맵 원소의 값을 출력하시오
 *    map의 크기를 출력하시오
 *    map의 키값을 for(개선된 for문)문을 이용하여 출력
 *    map의 값들을 for(개선된 for문)문을 이용하여 출력
 * 6. HashSet 객체 auto를 생성하시오
 *    4번의 자동차 이름을 set에 추가하세요(제네릭 이용)
 *    for문을 이용 원소값을 출력하세요
 * 7. 4번 객체의 Iterator를 만들어 while문을 이용하여 원소를 출력
 */