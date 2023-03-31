package com.kyk.ch16Project1;

import java.net.URL;
import java.net.URLConnection;

public class MainClass03 {

	public static void main(String[] args) {
		String address = "https://www.w3schools.com/html/tryit.asp?filename=tryhtml_elements";
		try {
			URL url = new URL(address);
			URLConnection conn = url.openConnection();
			
			/*
			System.out.println("conn.toString() : " + conn);
			System.out.println("getAllowUserInteraction() : " + conn.getAllowUserInteraction());
			System.out.println("\tgetConnectTimeout() : " + conn.getConnectTimeout()); //time_out�� 0���� ����
			System.out.println("getContent() : " + conn.getContent());
			*/
			
			System.out.println("getURL() : " + conn.getURL());
			System.out.println("getUseCaches() : " + conn.getUseCaches()); //cache�޸� ��� ����
			System.out.println("getContentType() : " + conn.getContentType()); //�ڿ��� ����(������)
			System.out.println("\tgetData() : " + conn.getDate()); //posixŸ��(�и�������� ���� �ð� 1970.1.1.����)
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
