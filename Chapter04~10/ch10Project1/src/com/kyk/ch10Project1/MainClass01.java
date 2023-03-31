package com.kyk.ch10Project1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass01 {

	public static void main(String[] args) {
		//Date는 자바 1.0부터 제공된 가장 오래된 클래스로 밀리세컨드의 정밀도를 지님
		Date now = new Date(); //현재 시각의 정보를 지닌 객체 생성
		String strNow1 = now.toString();
		//toString()은 Object의 toString()을 오버라이드 하여 시각 표시에 적합하도록 출력
		System.out.println(strNow1); //Tue May 10 12:21:42 KST 2022
		
		//한국형 시각 표시방법으로 변경 처리
		//SimpleDateFormat은 시각표시방법을 처리하는 클래스
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		//SimpleDateFormat객체에서 지정한 형식으로 format메서드는 date객체를 이용하여 문자열로 변경
		System.out.println(strNow2); //2022년 05월 10일 12시 29분 46초
		//지정한 패턴 yyyy년 MM월 dd일 hh시 mm분 ss초 형식으로 나옴
		//패턴에는 년도는 yyyy, 월은 MM, 날짜 dd, 시간은 hh, 분은 mm, 초는 ss로 표시
		
		Date myDateObj = new Date();
		System.out.println("Before formatting : " + myDateObj);
		SimpleDateFormat myFormatObj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formattedDate = myFormatObj.format(myDateObj);
		System.out.println("After formatting : " + formattedDate);
	}

}
