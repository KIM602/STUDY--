package com.kyk.ch07Project1;

//MainClass13Ŭ���� ���ο� ����Ŭ������ ����
public class MainClass13 {

	public static void main(String[] args) {
		//�ڱ�Ŭ������ ���� Ŭ���� �����ڴ� ����Ŭ�����̸�.���
		System.out.println(InstanceInner.CONST);
		//instanceŬ��������̳� static final�̹Ƿ� ����
		//System.out.println(InstanceInner.iv);
		//main�� static�̹Ƿ� �ٷδ� instance�� ���� ����(��ü�� ���� ����)
		System.out.println(StaticInner.cv);
		System.out.println(StaticInner.CONST);
		//System.out.println(StaticInner.iv);
		//staticŬ������ �ִ� �ν��Ͻ��� �ٷ� ���� �Ұ�
	}
	
	class InstanceInner { //���� �ν��Ͻ�Ŭ����
		int iv = 100; //�ν��Ͻ��� ����
		//static int cv = 100; //static������ �ν��Ͻ�Ŭ���� �ȿ����� �Ұ���
		final static int CONST = 100; //����� ����
	}
	
	static class StaticInner { //static���� Ŭ����, ��� ����
		int iv =200;
		static int cv = 200;
		final static int CONST = 200; //����� ����
	}
	
	void myMethod() {
		class LocalInner { //�޼��� ���� ���� ���� Ŭ����
			int iv = 300;
			//static int cv = 300; //�ν��Ͻ��� Ŭ������ �Ǿ� �ȵ�
			final static int CONST = 300; //����� ����
		}
	}
}
