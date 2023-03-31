package com.kyk.ch10Project1;

import java.util.Calendar;
import java.util.TimeZone;

//DateŬ������ ������ CalendarŬ����(�ڹ� 1.1����)
public class MainClass02 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); 
		//���� Ŭ������ GregorianCalendar
		//Calendar�� �߻��̹��� �̸� ������ GregorianCalendar�� �̿��Ͽ� ��ü�� ����
		//����ð����� get(CalendarŬ������ static ������)���� ��
		int year = now.get(Calendar.YEAR); //�⵵ ��ȯ
		int month = now.get(Calendar.MONTH) + 1; //0~11 ��ȯ
		int day = now.get(Calendar.DAY_OF_MONTH); //���� ��¥
		int week = now.get(Calendar.DAY_OF_WEEK); //������ �Ͽ����� 1~������� 7
		String strWeek = null;
		
		switch(week) {
			case Calendar.MONDAY://2
				strWeek = "��";
				break;
			case Calendar.TUESDAY://3
				strWeek = "ȭ";
				break;
			case Calendar.WEDNESDAY://4
				strWeek = "��";
				break;
			case Calendar.THURSDAY://5
				strWeek = "��";
				break;
			case Calendar.FRIDAY://6
				strWeek = "��";
				break;
			case Calendar.SATURDAY://7
				strWeek = "��";
				break;
			default :
				strWeek = "��"; //7
		}
		
		int amPm = now.get(Calendar.AM_PM);
		
		String strAmPm = null;
		if(amPm == Calendar.AM_PM) {
			strAmPm = "����";
		}
		else {
			strAmPm = "����";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(year + "�� ");
		System.out.print(month + "�� ");
		System.out.println(day + "�� ");
		System.out.print(strWeek + "���� ");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "�� ");
		System.out.print(minute + "�� ");
		System.out.print(second + "��");
		
		String[ ] availableIDs = TimeZone.getAvailableIDs();
		//TimeZone����Ʈ�� ���ڿ� �迭�� ��ȯ
		for(String id : availableIDs) {
			System.out.println(id);
		}
		
		TimeZone tz = TimeZone.getTimeZone("Asia/Seoul");
		Calendar kc = Calendar.getInstance(tz); //TimeZone�� ���� �ð� ������ ��ȯ
		
	}

}
