package com.kyk.ch07Project1;

public class MainClass14 {

	public static void main(String[] args) {
		staticMethod(); //static�޼��忡�� static�޼��� ȣ��ô� �ٷ� ���
		MainClass14 m = new MainClass14();
		m.instanceMethod();//static �޼��� �ȿ��� �ν��Ͻ���� ���ٽô� ��ü.�̸�
	}
	
	class InstanceInner {
		//������ �⺻�����ڸ� �ִ� ���� Ŭ����
	}
	
	static class StaticInner {
		//������ �⺻�����ڸ� �ִ� ���� Ŭ����
	}
	
	//�ڱ�Ŭ������ ����Ŭ���� �ν��Ͻ��� ����Ŭ���� �����ڷ� ����
	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() { //outerŬ���� MainClass14�� static�޼��� 
		StaticInner obj2 = new StaticInner(); //static�� ����
		//InstanceInner obj1 = new InstaceInner(); //�ٷ� ���� �ȵ�
		//�ν��Ͻ���� ���� �Ϸ��� �ܺ�Ŭ���� ��ü ����
		MainClass14 out = new MainClass14();
		InstanceInner obj1 = out.new InstanceInner();
		
	}
	
	void instanceMethod() {
		//�ν��Ͻ��� �޼��� �ȿ����� �ν��Ͻ��� staticŬ���� ��� ���� ����
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		//LocalInner lv = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner {} //local ���� Ŭ����
		LocalInner lv = new LocalInner();
	}
	
}
