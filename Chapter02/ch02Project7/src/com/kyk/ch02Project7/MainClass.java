package com.kyk.ch02Project7;

public class MainClass {

	public static void main(String[] args) {
		
		short sMin = -32768, sMax = 32767;
		//short���� 2����Ʈ(16��Ʈ)�̹Ƿ� ǥ�� ������ ���� 2�� 16�°� (65536��)
		//���� ������ ���ݾ� ���, �� �߾ӿ� 0�� �־� �翡���� -1�Ѵ�.
		char cMin = 0, cMax = 65535;
		//char���� ���ڷε� ��Ÿ���� ���ں� �ڵ��ȣ ���ڷε� ��Ÿ��, char�� -�� ����
		System.out.println("sMin = " + sMin);
		System.out.println("sMin-1= " + (short)(sMin-1));
		//�ּҰ����� -�ϸ� �ִ밪���� ����
		System.out.println("sMax = " + sMax);
		System.out.println("sMax+1= " + (short)(sMax+1));
		//�ִ밪�� 1�� ���ϸ� �ּҰ����� �����µ� �̷��� �ϱ� ���� ����ȯ ó��
		System.out.println("cMin = " + (int)cMin);
		//char�� int������ ����ȯ�� int����ȯ. ���ڷ� ������ ��.
		System.out.println("cMin-1= " + (int)--cMin);
		//--�� ���տ����ڷ� 1�� ���ҽ�Ű�� ������
		//�ִ밪���� ����]
		System.out.println("cMax = " + (int)cMax);
		System.out.println("cMax+1= " + (int)++cMax);
		//++�� �����ڷ� 1�� ���ϴ� ������
		//�ּҰ����� ����
		
		System.out.println((char)65); //�� ū int�� 65�� ���� char�� ����ȯ
		System.out.println((int)1.5f); //�� ū float���� int������ ����ȯ
		
	}

}
