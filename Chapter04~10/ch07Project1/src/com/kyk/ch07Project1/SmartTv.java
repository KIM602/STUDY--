package com.kyk.ch07Project1;

//extendsŰ���带 ����Ͽ� TvŬ������ ���
//Tv�� parentŬ�����̰� SmartTv�� childŬ�����̴�.
public class SmartTv extends Tv {
	//TvŬ����(ObjectŬ������ ���Ե�)�� ���
	//����� ��������� ����޼��常 ����ϰ� �����ڿ� �ʱ�ȭ����� ����
	//TvŬ������ ��������� �߰��Ͽ� ����� �������
	boolean caption;
	//TvŬ������ ����޼��忡 �߰��Ͽ� ����� ��� �޼���
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
	
	//�⺻�� �����ڴ� ������
}
