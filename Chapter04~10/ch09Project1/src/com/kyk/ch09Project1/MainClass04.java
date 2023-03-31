package com.kyk.ch09Project1;

//StringŬ������ ����Ұ���(immutable) finalŬ�����̴�.
//�ν��Ͻ� ������ ������ �����ô� ���� ������ ���� �ּҸ� ���� ���� ��ü�̴�.
//new������ ���ÿ��� ���� ������ �ٸ� �ν��Ͻ�(�ּҰ��� �ٸ� ��������)
//equals�� Object�� �޼��带 String���� �������̵��Ͽ� ���� ���Ѵ�.
// == ������ �񱳴� ���񱳰� �ƴ� �������� �ּ� ��

public class MainClass04 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		//������ �ʱ�ȭ�ϰ� ���� �����Ƿ� ���� �ּҸ� ���� �ν��Ͻ�
		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");
		
		System.out.println("str1 == str2 ? " + (str1 == str2));
		//==�����ڷ� ���ϹǷ� �ּ� �� (true)
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		//equals�� ���� �� (true)
		
		System.out.println();
		String str3 = new String("abc");
		String str4 = new String("abc");
		//new�����ڸ� ����ϸ� �ٸ� �ּҸ� ���� �ν��Ͻ������� ����
		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String STR4 = NEW String(\"abc\");");
		
		System.out.println("str3 == str4 ? " + (str3 = str4));
		//==�� �ּҺ�(false)
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));
		//�� ��(true)
	}

}
