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
		System.out.println("//1��");
		LocalDate myDate = LocalDate.now();
		System.out.println("���� ��¥ : " + myDate);
		
		System.out.println("//2��");
		LocalTime myTime = LocalTime.now();
		System.out.println("���� �ð� : " + myTime);
		
		System.out.println("//3��");
		LocalDateTime myDateTime = LocalDateTime.now();
		System.out.println("���� ��¥�� �ð� : " + myDateTime);
		
		//��¥ �ð� ǥ�� ���� ������ DateTimeFormatterŬ���� �̿�
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:MM:SS");
		String formattedDate = myDateTime.format(myFormatObj);
		System.out.println("After formatting : " + formattedDate);;
		
		System.out.println("//4��");
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
		
		System.out.println("//5��");
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		
		System.out.println(capitalCities);
		System.out.println(capitalCities.get("England")); //key�� value�� ���ҽ�
		System.out.println(capitalCities.size());
		
		for (String i : capitalCities.keySet()) {
			System.out.println(i);
		}
		
		for (String i : capitalCities.values()) {
			System.out.println(i);
		}
		
		System.out.println("//6��");
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
		
		System.out.println("//7��");
		Iterator<String> it = cars.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}

/*
 * 1. �츮������ ���� ��¥�� myDate��ü�� ����� ���
 * 2. �츮������ ���� �ð��� myTime��ü�� ����� ���
 * 3. �츮������ ���� ��¥�� �ð��� myDateTIme ��ü�� ����� ���
 * 4. List��ü cars�� ����� Volvo, BMW, Ford, HyunDai, Kia�� �߰��ϰ� ���(��� ���ڿ��̴ϱ� ���׸� String�� ���)
 *    ���Ұ����� ���
 *    ù��° ���̸� ���
 *    ù��° ���̸��� Opel�� ��ü
 * 5. key�� value ��� String�� map��ü capitalCities�� ����(���� ���� ����ϴ� MAP����)
 *    key�� ���� ������ ������ map�� �߰��Ͻÿ�    
 *    "England", "London"
 *    "Germany", "Berlin"
 *    "Norway", "Oslo"
 *    "USA", "Washington DC"
 *    map�� ����Ͻÿ�
 *    key�� England�� �� ������ ���� ����Ͻÿ�
 *    map�� ũ�⸦ ����Ͻÿ�
 *    map�� Ű���� for(������ for��)���� �̿��Ͽ� ���
 *    map�� ������ for(������ for��)���� �̿��Ͽ� ���
 * 6. HashSet ��ü auto�� �����Ͻÿ�
 *    4���� �ڵ��� �̸��� set�� �߰��ϼ���(���׸� �̿�)
 *    for���� �̿� ���Ұ��� ����ϼ���
 * 7. 4�� ��ü�� Iterator�� ����� while���� �̿��Ͽ� ���Ҹ� ���
 */