package com.kyk.ch15Project1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass04 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("primitive.dat");
		DataOutputStream dos = new DataOutputStream(fos); //��Ʈ���� �⺻�� �����ͷ� ó���ϴ� ���� ��Ʈ��
		
		dos.writeUTF("ȫ�浿"); //UTF���ڷ� ó��(������ ��� �� ó��)
		dos.writeDouble(95.5); //double������ ��� ó��
		dos.writeInt(1); //int�� ó��
		
		dos.writeUTF("���ڹ�");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		//write�Ŀ��� ���۸� �����־�� �ϹǷ� flush()���
		dos.flush();
		dos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("primitive.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i = 0; i < 2; i++) {
			//write�� ������� �´� �������� ó�� �޼��� ���
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			
			System.out.println(name + " : " + score + " : " + order);
		}
		
		dis.close();
		fis.close();
	}

}
