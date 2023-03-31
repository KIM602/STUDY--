package com.kyk.ch15Project1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//직렬화
public class MainClass14 {

	public static void main(String[] args) {
		try {
			String fileName = "UserInfo.ser";
			FileOutputStream fos = new FileOutputStream(fileName); //기본 OutputStream
			BufferedOutputStream bos = new BufferedOutputStream(fos); //buffer사용 보조스트림
			ObjectOutputStream out = new ObjectOutputStream(bos); //직렬화를 처리하는 스트림 인스턴스
			
			UserInfo u1 = new UserInfo("JavaMan", "1234", 30);
			UserInfo u2 = new UserInfo("JavaWoman", "4321", 26);
			
			ArrayList<UserInfo> list = new ArrayList<UserInfo>();
			
			list.add(u1);
			list.add(u2);
			
			//객체 직렬화
			out.writeObject(u1);
			out.writeObject(u2);
			out.writeObject(list); //직렬화 클래스를 포함한 Collection도 가능
			out.close();
			System.out.println("직렬화가 잘 끝났습니다.");
			
			System.out.println("==========역직렬화==========");
			FileInputStream fis = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream in = new ObjectInputStream(bis);
			
			//객체를 읽을 때는 출력한 순서와 일치해야 한다.
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
