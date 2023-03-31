package com.kyk.ch10Project1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class MainClass05 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		//���� ��¥�� �ð� ������ ���� LocalDateTime��ü�� now() Ŭ���� �޼���� ó��
		//Date�� new Date(), Calendar�� Calendar.getInstance()
		System.out.println(now);
		//2022-05-10T15:45:33.931421900ó�� ��-��-��T�ð�:��:��.���뼼����
		String strDateTime = now.getYear() + "�� ";
		strDateTime += now.getMonthValue() + "�� ";
		strDateTime += now.getDayOfMonth() + "�� ";
		strDateTime += now.getHour() + "�� ";
		strDateTime += now.getMinute() + "�� ";
		strDateTime += now.getSecond() + "�� ";
		strDateTime += now.getNano() + "������";
		
		System.out.println(strDateTime + "\n");
		
		//���� �ľ��� LocalDateTime��ü�� LocalDate��ü�� ��ȯ
		LocalDate nowDate = now.toLocalDate();
		if(nowDate.isLeapYear()) {
			System.out.println("���ش� ����: 2���� 29�ϱ��� �ֽ��ϴ�.\n");
		}
		else {
			System.out.println("���ش� ���: 2���� 28�ϱ��� �ֽ��ϴ�.\n");
		}
		
		//ǥ�ؼ����(���������)�� ������ ���� �׸���ġõ���� ǥ�ؽð�
		//��������(����) ó��
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		//now()�޼���� �����ε��Ǿ� �Ķ���Ͱ� �ٸ���.
		//Ư�������� ����ô� ZoneId��ü�� �Ķ���ͷ� ���
		//ZonedDateTimeŬ������ Ư�� ���� �ð��� ó���ϴ� Ŭ����
		//ZonedIdŬ������ ���� id�� ó���ϴ� Ŭ����
		//of("zone id")�޼���� �����̵� ���ڿ��� ZoneId��ü�� ��ȯ
	}

}
