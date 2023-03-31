package com.kyk.ch08Project1;

import java.io.File;

public class MainClass08 {

	public static void main(String[] args) {
		try {
			//main�޼����� �Ķ���� args�� ���ô� run configuration���� �ڹٸ� ����� ���� ���Ͽ���
			File f = createFile(args[0]); //args[0]�� ���� �̸�
			//FileŬ������ fileó���� ���� �Ӽ�, �޼��带 ������ �ִ� Ŭ����
			System.out.println(f.getName() + "������ ���������� �����Ǿ����ϴ�");
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage() + "�ٽ� �Է��� �ֽñ� �ٸ��ϴ�.");
		}
		
		System.out.println("main�� ������");
	}
	
	static File createFile(String fileName) throws Exception { //Exception����ó���� ȣ���� �޼��� main�޼���� ����
		if (fileName == null || fileName.equals("")) {
			throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
			//�޼����� �����̸��� ��ȿ���� �ʽ��ϴ�.�� ���� ���ܸ� ����� ������
		}
		
		File f = new File(fileName); //���� ��ü ����, fileName�� ���� ���ϵ��� ó���ϴ� �ν��Ͻ�
		boolean b = f.createNewFile()	; //���� ������ ����(������ ���� ������ ��ũ�� ����)
		return f;
	}

}
