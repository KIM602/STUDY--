package com.kyk.ch03Project4;

public class MainClass04 {

	public static void main(String[] args) {
		String str1 = "abc"; //str1�� ������ ����
		String str2 = new String("abc"); //������ ����
		//�ΰ��� ������ ������ ������� (��, ���� ����)
		
		System.out.printf("\"abc\" == \"abc\"?%b%n", "abc"=="abc");
		//"�� �ο��ȣ " "�ȿ��� ����Ϸ��� \"�� ��� ""abc"" "i \"am\" a boy"
		//%b�� boolean�� ���
		System.out.printf(" str1==\"abc\" ?%b%n",str1=="abc");
		//��ü���� ���ͷ����� ������ ==�� ���ϸ� true, �� ���� ���� ���ͷ��� ���� ��ü��
		System.out.printf(" str2==\"abc\" ?%b%n",str2=="abc");
		//str1��ü�� ����� ���ͷ��� str2��ü�ʹ� �ٸ�
		System.out.printf("str1.equals(\"abc\") ? %b%n",str1.equals("abc"));
		//printf������ ǥ���� ���� ���ͷ�, ����, ǥ����
		//equals�� ��ü(�ּ�)�� �� ���ϰ� ���� ��
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(str1) ? %b%n", str2.equals(str1));
		//str1�� str2�� �ٸ� ���������� ��ü�̳� ���� �����Ƿ� true
		System.out.printf("str2.equals(\"ABC\") ? %b%n",str1.equals("ABC"));
		//equals�� ��ҹ��� �����ϹǷ� false
		System.out.printf("str1.equalsIgnoreCse(\"ABC\") ? %b%n",str1.equalsIgnoreCase("ABC"));
		//equalsIgnoreCase()�� ��ҹ��� �����ϰ� ��
		
	}

}
