package com.kyk.ch15Project1;

import java.io.Serializable;

//직렬화 가능 클래스 만들기
public class UserInfo implements Serializable {
	//인스턴스멤버변수만 직렬화 대상
	String name ;
	String password; //직렬화에 미포함 하려면 transient제한자를 붙이면 됨
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
