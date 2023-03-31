package com.kyk.ch15Project1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass04 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("primitive.dat");
		DataOutputStream dos = new DataOutputStream(fos); //스트림을 기본형 데이터로 처리하는 보조 스트림
		
		dos.writeUTF("홍길동"); //UTF문자로 처리(세계의 모든 언어를 처리)
		dos.writeDouble(95.5); //double형으로 출력 처리
		dos.writeInt(1); //int로 처리
		
		dos.writeUTF("김자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		//write후에는 버퍼를 지워주어야 하므로 flush()사용
		dos.flush();
		dos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("primitive.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i = 0; i < 2; i++) {
			//write한 순서대로 맞는 데이터형 처리 메서드 사용
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			
			System.out.println(name + " : " + score + " : " + order);
		}
		
		dis.close();
		fis.close();
	}

}
