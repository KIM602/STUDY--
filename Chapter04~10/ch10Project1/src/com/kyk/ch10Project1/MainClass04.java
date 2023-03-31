package com.kyk.ch10Project1;

import java.text.SimpleDateFormat;
import java.util.Date;

//SimpleDateFormatŬ������ �ð��� ������ ������ ���ڿ��� ��ȯó���ϴ� Ŭ����
public class MainClass04 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString()); //Tue May 10 15:06:14 KST 2022
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//"yyyy-MM-dd"�� ���ڿ��� ��ȯ�� ����ϴ� ����
		//�⵵�� yyyy�� 4�ڸ� ǥ��, ���� MM���� 2�ڸ�, ��¥�� dd�� 2�ڸ�
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy��.MM.DD a HH:mm:ss");
		//a�� ���� ���� ǥ��, ���Ϲ��� H�� �ð��� 0~23���� ǥ��
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("������ E����");
		//E�� ����ǥ�� ���Ϲ���
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("������ D��° ��");
		//D�� 1���� ������ ��¥
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("�̳��� d��° ��");
		//d�� ���� ������ ��¥ ����
		System.out.println(sdf.format(now));
	}

}
