package com.kyk.ch09Project1;

public class MainClass06 {

	public static void main(String[] args) {
		//���̰� 0�� char�迭�� �����Ѵ�.(��� ���������� ���ؼ��� ���̰� 0�� �迭 ����)
		char[] cArr = new char[0]; //char[] cArr = ();
		String s = new String(cArr); //String s = new String("");�� ����.
		
		System.out.println("cArr.length=" + cArr.length);
		System.out.println("@@@" + s + "@@@");
		
		//�ƹ��͵� ���� �ʱⰪ�� String�� String str = null;���� str = ""�� ���ִ� ���� ����
		//char�� �ʱⰪ�� char ch = \u0000;���� ch = ' ';�� ���ִ� ���� ����
	}

}
