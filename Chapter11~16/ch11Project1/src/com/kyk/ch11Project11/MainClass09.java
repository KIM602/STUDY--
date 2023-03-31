package com.kyk.ch11Project11;

import java.io.FileOutputStream;
import java.util.Properties;

public class MainClass09 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		//HashTable�� ����ϰ� Map�������̽��� ������ Map�׷�
		//Properties�� key�� value ��� String
		//setProperty(key, value)�� ���� �߰�
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "�ѱ�");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		try {
			//���ϰ�δ� workspace�� ������Ʈ ���� �ٷ� �ؿ� ����
			prop.store(new FileOutputStream("output.txt"), "Properties Example"); //txt���Ͽ� ����
			prop.storeToXML(new FileOutputStream("output.xml"), "Properties Example"); //xml���Ͽ� ����
		}
		
		catch(Exception e) {
			e.getMessage();
		}
		
		System.out.println("run");
	}

}
