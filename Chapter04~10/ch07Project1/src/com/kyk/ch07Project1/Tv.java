package com.kyk.ch07Project1;

//����ϴ� Ŭ������ ���� ��� extends Object�� ���� �Ǿ� ����
//Object�� �ڹ��� �ֻ���Ŭ������ 11���� �޼��带 ������ ����
public class Tv extends Object {
	
	//��� �ν��Ͻ� ����
	boolean power; //�⺻�� false�� ����
	int channel; // �⺻���� 0
	
	//�ν��Ͻ� ��� �޼���
	void power() {
		power = !power;
		//return; void�ô� return�� ���� ����
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
	
	//�����ڰ� ��������� ������ �����Ƿ� �⺻ �����ڰ� ����������
	/*
	 * public Tv( ) {  } 
	 */
}
