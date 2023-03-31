package com.kyk.ch15Project1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//FileInputStream�� FileOutputStream�� ������ ������� ����� ó��
//�̹����� ���� ���ε� �ٿ�ε��ÿ� ����
public class MainClass02 {

	public static void main(String[] args) throws IOException {
		//FileInputStream�����ڴ� ����ó��
		FileInputStream fis = new FileInputStream(args[0]);
		//java.io.FileInputStream.FileInputSteam(String name) throws FileNotFoundException
		//�������� �Ķ���Ϳ� �����̸��� ����Ͽ� ��ü �����ϸ� ���Ϸκ��� �Է��� ó���ϴ� �ν��Ͻ� ����
		//������ ������ ����
		
		FileOutputStream fos = new FileOutputStream(args[1]);
		//file�� ������ ����� ������ �������

		int data = 0;
		while((data = fis.read()) != -1) {
			char c = (char) data;
			System.out.print(c);
			fos.write(data);
		}
		
		fis.close();
		fos.close();
	}

}
