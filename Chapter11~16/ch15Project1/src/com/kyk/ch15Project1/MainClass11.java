package com.kyk.ch15Project1;

import java.io.File;

public class MainClass11 {

	public static void main(String[] args) throws Exception {
		File f1 = new File("D:/KYK/workspace/ch15Project1/src/com/kyk/ch15Project1/MainClass01.java");
		//�������� ���� �̸��� ����Ͽ� ���� ��ü ����
		File f2 = new File("forest.jpg"); //���� �̸��� ����Ͽ� ���� ��ü ����, ������ ���� ���(������Ʈ ��)�� �־�� ��
		String fileName = f1.getName(); //������ �����̸�
		System.out.println("��θ� ������ �����̸� - " + f1.getName());
		int pos = fileName.lastIndexOf("."); //Ȯ���� ǥ�� .�� ���ι�ȣ
		System.out.println("Ȯ���ڸ� ������ �����̸� - " + fileName.substring(0,pos));
		System.out.println("Ȯ���� - " + fileName.substring(pos+1));
		//String java.lang.String.substring(int beginIndex) beginIndex���� ���������� ����
		
		System.out.println("��θ� ������ �����̸� - " + f1.getPath()); //����� �� ����� ǥ��
		System.out.println("������ ������ - " + f1.getAbsolutePath()); //����� �ÿ��� ��ü ������ ǥ��
		System.out.println("������ ���԰�� - " + f1.getCanonicalPath()); // './' �Ǵ� '../'�� �����Ͽ� ǥ��
		System.out.println("������ �����ִ� ���丮 - " + f1.getParent());
		System.out.println();
		System.out.println("File.pathSeperator - " + File.pathSeparator);
		System.out.println("File.pathSeperatorChar - " + File.pathSeparatorChar);
		System.out.println("File.separator - " + File.separator);
		System.out.println("File.separatorChar - " + File.separatorChar);
		System.out.println();
		
		System.out.println("user.dir = " + System.getProperty("user.dir"));
		System.out.println("sun.boot.class.path = " + System.getProperty("sun.boot.class.path"));
	}
}
