package com.kyk.ch06Project1;

//call by reference(������ �Ű�����)
public class MainClass06 {

	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d); //�޼��� ȣ��, d�� ������ ������ ���ڶ�� �θ��� d��ü��, static�޼����� change�޼��带 static�޼���ȿ��� ȣ�ٽô� Ŭ����, �̸��� �ʿ� ����
		//static�޼����̹Ƿ� ��ü ���� ��� �� �ʿ� ����
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	
	//�޼��� ����
	//static���� �޼���� Ŭ������ �޼���
	static void change(Data2 d) { //Dta2��ü�� �Ķ�����̹Ƿ� call by reference�� ���޵Ǵ� ���� �ּҰ�
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
		//String ��ü�� Ŭ������ ��ü�̳� �Һ�(immutable)��ü�� �����ص� ȣ���� �������� ������ �ȵ�. ��, �⺻������ ���
		//���߿� ���� StringBuffer�� StringBuild�� ����ؾ� �Ѵ�.
	}

}

class Data2 {
	int x; //�ν��Ͻ��� ����
	
	//�⺻�� �����ڷ� �ٸ� �����ڰ� ���� �� ���� ����
	//�����ڴ� ����Ÿ���� ���� �̸��� Ŭ�������� Ư�� �޼���
	//�⺻���� ()�� �Ķ���Ͱ� ����
	public Data2()  {
		super(); //�����ص� ����
	}
}