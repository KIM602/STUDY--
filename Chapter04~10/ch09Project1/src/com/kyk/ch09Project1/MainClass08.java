package com.kyk.ch09Project1;

//StringBuffer��ü ������ new StringBuffer("abc");
//StringBuffer�� String���� ��ȯ�� toString()�޼��峪 new String(StringBuffer sb);

public class MainClass08 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		//new ������ �̹Ƿ� �ٸ� �ּҸ� ���� �ν��Ͻ�
		System.out.println("sb == sb2 ? " + (sb == sb2));
		//== �����ڴ� �ּҸ� ���ϹǷ� false
		System.out.println("sb == sb2 ? " + sb.equals(sb2));
		//String�� equals�� ���� ���ϵ��� ������ �Ǿ� ������ StringBuffer�� �������̵� �ȵ�. ��, Object���
		//��, �ּ� �� (false)
		
		//StringBufer�� ������ String���� ��ȯ�Ѵ�.
		String s = sb.toString(); //StringBufferŬ������ toString()����Ͽ� ��ȯ
		//String s = new String(sb); //StringBuffer��ü�� String�������� �Ķ���ͷ� ���
		String s2 = sb2.toString();
		
		System.out.println("s.equals(s2) ? " + s.equals(s2));
		//���ڿ��� equals�� ���� ���ϵ��� �������̵� ��
	}

}
