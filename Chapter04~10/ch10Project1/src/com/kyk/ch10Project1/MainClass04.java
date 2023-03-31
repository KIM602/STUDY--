package com.kyk.ch10Project1;

import java.text.SimpleDateFormat;
import java.util.Date;

//SimpleDateFormat클래스는 시각을 정해진 패턴의 문자열로 변환처리하는 클래스
public class MainClass04 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString()); //Tue May 10 15:06:14 KST 2022
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//"yyyy-MM-dd"는 문자열로 반환시 사용하는 패턴
		//년도는 yyyy로 4자리 표시, 달은 MM으로 2자리, 날짜는 dd로 2자리
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년.MM.DD a HH:mm:ss");
		//a는 오전 오후 표시, 패턴문자 H는 시간을 0~23까지 표시
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		//E는 요일표시 패턴문자
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("올해의 D번째 날");
		//D는 1년을 기준한 날짜
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("이날의 d번째 날");
		//d는 달을 기준한 날짜 패턴
		System.out.println(sdf.format(now));
	}

}
