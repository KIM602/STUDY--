package com.kyk.ch06Project1;

//call by value ��, �޼��� �Ķ���Ͱ� �⺻���� ���
public class MainClass07 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x); //�޼��� ȣ��(���ڰ� ���� 10, ���ڰ��� �Ķ������ �������� ��)
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x); //10
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
		//��ȯ���� void�̹Ƿ� return���� ����
		return;
	}

}

class Data {
	int x;
}
