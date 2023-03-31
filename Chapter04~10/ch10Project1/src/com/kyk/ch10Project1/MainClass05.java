package com.kyk.ch10Project1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class MainClass05 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		//현재 날짜와 시간 정보를 지닌 LocalDateTime객체는 now() 클래스 메서드로 처리
		//Date는 new Date(), Calendar는 Calendar.getInstance()
		System.out.println(now);
		//2022-05-10T15:45:33.931421900처럼 년-월-일T시간:분:초.나노세컨드
		String strDateTime = now.getYear() + "년 ";
		strDateTime += now.getMonthValue() + "월 ";
		strDateTime += now.getDayOfMonth() + "일 ";
		strDateTime += now.getHour() + "시 ";
		strDateTime += now.getMinute() + "분 ";
		strDateTime += now.getSecond() + "초 ";
		strDateTime += now.getNano() + "나노초";
		
		System.out.println(strDateTime + "\n");
		
		//윤년 파악은 LocalDateTime객체를 LocalDate객체로 변환
		LocalDate nowDate = now.toLocalDate();
		if(nowDate.isLeapYear()) {
			System.out.println("올해는 윤년: 2월은 29일까지 있습니다.\n");
		}
		else {
			System.out.println("올해는 평년: 2월은 28일까지 있습니다.\n");
		}
		
		//표준세계시(협정세계시)는 영국의 런던 그리니치천문대 표준시간
		//존오프셋(시차) 처리
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		//now()메서드는 오버로딩되어 파라메터가 다르다.
		//특정지역에 적용시는 ZoneId객체를 파라메터로 사용
		//ZonedDateTime클래스는 특정 존의 시각을 처리하는 클래스
		//ZonedId클래스는 존의 id를 처리하는 클래스
		//of("zone id")메서드는 존아이디 문자열로 ZoneId객체를 반환
	}

}
