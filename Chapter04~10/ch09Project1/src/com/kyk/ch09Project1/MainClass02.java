package com.kyk.ch09Project1;

public class MainClass02 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		//boolean java.lang.String.equals(Object anObject)
		//ObjectŬ������ equals�޼��带 String���� ������
		//Object�� equals�� �������� �ּҸ� ���ϳ� ������ �� equals�� ���� ��
		System.out.println(str1.hashCode());
		//int java.lang.String.hashCode()�� Object�� hashCode�� �������ؼ� ���� ������ ���� �ؽ��ڵ尪
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		//Sytem.identityHashCode�� ����ϸ� ���� Object�� hashCode���� ��ȯ
	}

}
