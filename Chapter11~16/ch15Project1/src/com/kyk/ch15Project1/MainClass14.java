package com.kyk.ch15Project1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//����ȭ
public class MainClass14 {

	public static void main(String[] args) {
		try {
			String fileName = "UserInfo.ser";
			FileOutputStream fos = new FileOutputStream(fileName); //�⺻ OutputStream
			BufferedOutputStream bos = new BufferedOutputStream(fos); //buffer��� ������Ʈ��
			ObjectOutputStream out = new ObjectOutputStream(bos); //����ȭ�� ó���ϴ� ��Ʈ�� �ν��Ͻ�
			
			UserInfo u1 = new UserInfo("JavaMan", "1234", 30);
			UserInfo u2 = new UserInfo("JavaWoman", "4321", 26);
			
			ArrayList<UserInfo> list = new ArrayList<UserInfo>();
			
			list.add(u1);
			list.add(u2);
			
			//��ü ����ȭ
			out.writeObject(u1);
			out.writeObject(u2);
			out.writeObject(list); //����ȭ Ŭ������ ������ Collection�� ����
			out.close();
			System.out.println("����ȭ�� �� �������ϴ�.");
			
			System.out.println("==========������ȭ==========");
			FileInputStream fis = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream in = new ObjectInputStream(bis);
			
			//��ü�� ���� ���� ����� ������ ��ġ�ؾ� �Ѵ�.
			u1 = (UserInfo)in.readObject();
			u2 = (UserInfo)in.readObject();
			list = (ArrayList)in.readObject();
			
			System.out.println(u1);
			System.out.println(u2);
			System.out.println(list);
			
			in.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
