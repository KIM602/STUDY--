package com.kyk.ch09Project1;

public class MainClass13 {

	public static void main(String[] args) {
		int i = 10;
		//�⺻���� wrapperŬ������ �ν��Ͻ��� ��ȯ(����ȯ ��������)
		Integer intg = (Integer)i; //Integer intg = Integer.valueOf(i);
		//Integer intg = i; ���ָ� �⺻�� i�� �ڵ����� ����ڽ̵�
		Object obj = (Object)i; //Object obj = (Object)Integer.valueOf(i);
		
		Long lng = 100L;
		//Long lng1 = new Long(100L); �����ڷ� wrapperŬ���� �ν��Ͻ� ������ �ﰡ�϶�
		int i2 = intg + 10; //wrapper�������� �⺻������ ���� ����
		//wrapper�ν��Ͻ� intg�� ��ڽ��� �Ǿ� �⺻������ �ٲ�
		long l = intg + lng; //������ ���� ������ ����(��ڽ̿� ���� �⺻������ ��ȯ�Ͽ� ����)
		
		Integer intg2 = 20; //����ڽ�
		int i3 = (int)intg2; //�������� �⺻������ ����ȯ�� ����(����ȯ ��������)
		
		Integer intg3 = intg2 + i3; //i3�� ����ڽ̵Ǿ� ���� ����(wrapperŬ������ ���� ����)
		
		//wrapper �ν��Ͻ��� �ڵ����� �⺻������ ����
		System.out.println("i = " + i);
		System.out.println("intg = " + intg);
		System.out.println("obj = " + obj);
		System.out.println("lng = " + lng);
		System.out.println("lntg + 10 = " + i2);
		System.out.println("intg + lng = " + l);
		System.out.println("intg2 = " + intg2);
		System.out.println("i3 = " + i3);
		System.out.println("intg + i3 = " + intg3);
	}
}
