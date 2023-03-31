package com.kyk.ch10Project1;

import java.util.Calendar;
import java.util.TimeZone;

//Date클래스를 개선한 Calendar클래스(자바 1.1부터)
public class MainClass02 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); 
		//구현 클래스는 GregorianCalendar
		//Calendar는 추상이무로 이를 구현한 GregorianCalendar를 이용하여 객체를 생성
		//현재시각들은 get(Calendar클래스의 static 변수명)으로 얻어냄
		int year = now.get(Calendar.YEAR); //년도 변환
		int month = now.get(Calendar.MONTH) + 1; //0~11 반환
		int day = now.get(Calendar.DAY_OF_MONTH); //오늘 날짜
		int week = now.get(Calendar.DAY_OF_WEEK); //정수로 일요일이 1~토요일이 7
		String strWeek = null;
		
		switch(week) {
			case Calendar.MONDAY://2
				strWeek = "월";
				break;
			case Calendar.TUESDAY://3
				strWeek = "화";
				break;
			case Calendar.WEDNESDAY://4
				strWeek = "수";
				break;
			case Calendar.THURSDAY://5
				strWeek = "목";
				break;
			case Calendar.FRIDAY://6
				strWeek = "금";
				break;
			case Calendar.SATURDAY://7
				strWeek = "토";
				break;
			default :
				strWeek = "일"; //7
		}
		
		int amPm = now.get(Calendar.AM_PM);
		
		String strAmPm = null;
		if(amPm == Calendar.AM_PM) {
			strAmPm = "오전";
		}
		else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초");
		
		String[ ] availableIDs = TimeZone.getAvailableIDs();
		//TimeZone리스트를 문자열 배열로 반환
		for(String id : availableIDs) {
			System.out.println(id);
		}
		
		TimeZone tz = TimeZone.getTimeZone("Asia/Seoul");
		Calendar kc = Calendar.getInstance(tz); //TimeZone에 대한 시각 정보로 반환
		
	}

}
