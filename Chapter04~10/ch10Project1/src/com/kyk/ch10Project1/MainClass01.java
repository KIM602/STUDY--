package com.kyk.ch10Project1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass01 {

	public static void main(String[] args) {
		//Date�� �ڹ� 1.0���� ������ ���� ������ Ŭ������ �и��������� ���е��� ����
		Date now = new Date(); //���� �ð��� ������ ���� ��ü ����
		String strNow1 = now.toString();
		//toString()�� Object�� toString()�� �������̵� �Ͽ� �ð� ǥ�ÿ� �����ϵ��� ���
		System.out.println(strNow1); //Tue May 10 12:21:42 KST 2022
		
		//�ѱ��� �ð� ǥ�ù������ ���� ó��
		//SimpleDateFormat�� �ð�ǥ�ù���� ó���ϴ� Ŭ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String strNow2 = sdf.format(now);
		//SimpleDateFormat��ü���� ������ �������� format�޼���� date��ü�� �̿��Ͽ� ���ڿ��� ����
		System.out.println(strNow2); //2022�� 05�� 10�� 12�� 29�� 46��
		//������ ���� yyyy�� MM�� dd�� hh�� mm�� ss�� �������� ����
		//���Ͽ��� �⵵�� yyyy, ���� MM, ��¥ dd, �ð��� hh, ���� mm, �ʴ� ss�� ǥ��
		
		Date myDateObj = new Date();
		System.out.println("Before formatting : " + myDateObj);
		SimpleDateFormat myFormatObj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formattedDate = myFormatObj.format(myDateObj);
		System.out.println("After formatting : " + formattedDate);
	}

}
