package com.kyk.ch02Project3;

public class MainClass {
	//{ }��� �ۿ� ����Ǵ� ������ ���������� �⺻���� ����
	/*
	 * boolean�� false, �������� 0, char�� 'u\0000', �������� null
	 */
	static int age;
	static String name = "kim";
	static char ch; //�⺻���� �����̽�
	public static void main(String[] args) {
		//���������� �޼��� �ȿ��� ��� ����
		System.out.println(age); //age�� �⺻ ���̹Ƿ� 0
		System.out.println(name);
		System.out.println(ch);
		//�޼���ȿ��� �����ϴ� ������ ��� ����(����)������ ����� �԰� �ʱ�ȭ ���� �־�߸� ���� ����
		String name1 = "Ja" + "Va"; //+�� ���ڿ����տ�����(concate)
		String str = name1 + 8.0; //���ڿ� + ���ڴ� ���ڸ� ���ڿ��� ó���ؼ� ����
		
		System.out.println(name1);
		System.out.println(str);
		
		System.out.println(7 + " "); //7�� ���ڿ��� ó����
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + ""); //7 + 7�� �����̹Ƿ� + ����
		System.out.println("" + 7 + 7);
	}

}
