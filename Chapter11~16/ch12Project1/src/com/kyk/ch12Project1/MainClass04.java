package com.kyk.ch12Project1;

import java.lang.annotation.*;

@Deprecated //������ ����� �ǰ�ġ �ʴ� Ŭ�����̴�.
@SuppressWarnings("1111") //��ȿ���� ���� �ֳ����̼��� �����Ѵ�.
@TestInfo(testedBy="aaa", testDate=@DateTime(yymmdd="160101",hhmmss="235959"))
public class MainClass04 {

	public static void main(String[] args) {
		//Class Class<T>
		Class<MainClass04> cls = MainClass04.class;
		TestInfo anno = cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy() = " + anno.testedBy());
	}

}

@Retention(RetentionPolicy.RUNTIME) //����ÿ� ��밡���ϵ��� ����
@interface TestInfo { //������̼� �̸��� TestInfo�� ������̼� ����
	//������̼ǿ� ����ϴ� �Ӽ����� �߻�޼���� ����(�߻�޼��� �̸��� �Ӽ���)
	int count() default 1; //default�� �⺻ ������ ���� ���� ���ҽ� ���� ��
	String testedBy();
	String[] testTools() default "JUnit"; //�迭�̹Ƿ� ���� { } �ȿ� �ִµ� �ϳ��� ���� ����
	TestType testType() default TestType.FIRST;
	DateTime testDate();
	
}

@Retention(RetentionPolicy.RUNTIME) //���� �ÿ� ��밡���ϵ��� ����
@interface DateTime {
	String yymmdd();
	String hhmmss();
}

enum TestType {
	FIRST, FINAL
}
