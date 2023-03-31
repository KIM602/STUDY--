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
			System.out.println("\tgetConnectTimeout() : " + conn.getConnectTimeout()); //time_out의 0으로 설정
			System.out.println("getContent() : " + conn.getContent());
			*/
			
			System.out.println("getURL() : " + conn.getURL());
			System.out.println("getUseCaches() : " + conn.getUseCaches()); //cache메모리 사용 여부
			System.out.println("getContentType() : " + conn.getContentType()); //자원의 형태(웹문서)
			System.out.println("\tgetData() : " + conn.getDate()); //posix타임(밀리세컨드로 현재 시간 1970.1.1.기준)
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
