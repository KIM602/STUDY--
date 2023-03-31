package com.kyk.ch15Project1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass03 {

	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("forest.jpg");
		
		start = System.currentTimeMillis();
		
		while(fis1.read() != -1) {
			
		}
		
		end = System.currentTimeMillis();
		 
		System.out.println("������� �ʾ��� �� : " + (end - start) + "ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("forest.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		//���� ��Ʈ���� BufferedInputStream�� ��� ��Ʈ���� FileInputStream�ν��Ͻ��� �̿��Ͽ� ����
		start = System.currentTimeMillis();
		
		while(bis.read() != -1) {
			
		}
	
		end = System.currentTimeMillis();
		
		System.out.println("������� �� : " + (end - start) + "ms");
		
		bis.close();
		fis2.close();
		
		//buffer���� buffer�� �ѹ� ��ġ�Ƿ� �ణ�� �ð��� �� �ҿ�� ���� �ְ� ���� ���� ������ cpu�� ȿ���� ��������.
		
		FileOutputStream fos = new FileOutputStream("123.txt");
		//BufferedOutputStream�� ���� ũ�⸦ 5�� �Ѵ�.
		BufferedOutputStream bos1 = new BufferedOutputStream(fos,5); //�⺻ũ��� 8192����Ʈ�̳� ���⼭�� 5����Ʈ�� ����
		for(int i = '1'; i <= '9' ; i++) {
			bos1.write(i);
		}
		//BufferedOutputStream�� ũ�Ⱑ 5����Ʈ�̹Ƿ� 6���ʹ� ��� ����
		bos1.flush();
		bos1.close();
		
		FileInputStream fis3 = new FileInputStream("forest.jpg");
		BufferedInputStream bis3 = new BufferedInputStream(fis3);
		FileOutputStream fos3 = new FileOutputStream("forest1.jpg");
		BufferedOutputStream bos3 = new BufferedOutputStream(fos3);
		
		int data = -1;
		while((data = bis3.read()) != -1) {
			bos3.write(data);
		}
		
		bos3.flush();
		bos3.close();
		fos3.close();
		bis3.close();
		fis3.close();
	}

}
