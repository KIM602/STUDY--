package com.kyk.ch15Project1;

import java.io.FileReader;
import java.io.FileWriter;

//���ڱ�� stream�� 2����Ʈ UTF�� ó��
public class MainClass06 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader(args[0]);
			//FileReader(String fileName)�����ڴ� �Ķ���ͷ� ���� �̸��� ���
			FileWriter fw = new FileWriter(args[1]);
			
			int data = 0;
			while((data = fr.read()) != -1) { //char�ڵ带 �о� ���������� ����
				if(data != '\t' && data != '\n' && data != ' ' && data != '\r') {
					fw.write(data);
				}
			}
			fr.close();
			fw.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
