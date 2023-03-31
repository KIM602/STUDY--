package com.kyk.ch15Project1;

import java.io.Serializable;

//����ȭ ���� Ŭ���� �����
public class UserInfo implements Serializable {
	//�ν��Ͻ���������� ����ȭ ���
	String name ;
	String password; //����ȭ�� ������ �Ϸ��� transient�����ڸ� ���̸� ��
	int age;
	
	public UserInfo() {
		this("Unknown","1111",0);
	}
	
	public UserInfo(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}


	@Override
	public String toString() {
		return "(" + name + "," + password + "," + age + ")";
	}
}
