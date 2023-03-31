package com.kyk.ch11Project11;

import java.io.FileOutputStream;
import java.util.Properties;

public class MainClass09 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		//HashTable을 상속하고 Map인터페이스를 구현한 Map그룹
		//Properties는 key와 value 모두 String
		//setProperty(key, value)로 값을 추가
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "한글");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		try {
			//파일경로는 workspace의 프로젝트 폴더 바로 밑에 생김
			prop.store(new FileOutputStream("output.txt"), "Properties Example"); //txt파일에 저장
			prop.storeToXML(new FileOutputStream("output.xml"), "Properties Example"); //xml파일에 저장
		}
		
		catch(Exception e) {
			e.getMessage();
		}
		
		System.out.println("run");
	}

}
