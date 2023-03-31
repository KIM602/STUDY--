package com.kyk.ch09Project1;

public class MainClass01 { //extends Object ����

	public static void main(String[] args) {
		Value v1 = new Value(10); //new ������ ȣ�⹮�� ����(�Ķ���Ϳ� ���޵Ǵ� ���� ����)�� 10�� ���
		Value v2 = new Value(10);
		//v1�� v2�ν��Ͻ�����(��������)�� ����Ű�� �޸𸮿��� �ּҰ� ������
		if(v1.equals(v2)) { //equals��  ObjectŬ������ �޼���� �ּ� ��(��ü�� ��)
			System.out.println("v1�� v2�� �����ϴ�.");
		}
		else {
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
		}
		
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1.equals(p2)) { //PersonŬ�������� �������� equals�޼��带 ���(�ν��Ͻ��� ��������� ��)
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		}
		else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
		}
	}

}

class Value { //extends Object ����
	int value; //�ν��Ͻ��� ���������ڴ� default�� ���� ��Ű�������� ��𼭳� ���� ����
	
	Value(int value) { //���������ڴ� default, ����Ÿ�Ծ��� Ŭ���� �̸��� �޼��� �̸��� �����Ƿ� ������, �Ķ���ͷ� �������� ó���ϴ� ������
		//������� value�� �Ķ���� value�� �����Ƿ� this�� ����
		this.value = value;
	}
}

class Person {
	long id;
	
	Person(long id) { //������
		this.id = id;
	}
	
	@Override //�޼��� �����Ǹ� ó���ϴ� ������̼�
	public boolean equals(Object obj) { //ObjectŬ������ �ִ� equals�޼��带 ������, ��ü�� ���ϴ� ���� �ƴ϶� ��ü�� id���� ��
		if(obj instanceof Person) { //instanceof�� Ŭ������ �ش��ϴ� �ν��Ͻ��� �Ǵ��ϴ� ������
			return id == ((Person)obj).id; //����Ŭ������ Object�� �ν��Ͻ��� ����Ŭ������ ��ü�� ��ȯ�Ϸ��� casting
			//��������� ����� id�� ���� id�� ������ true
		}
		else {
			return false;
		}
	}
}
