package com.kyk.ch15Project1;

import java.io.BufferedReader;
import java.io.FileReader;

//BufferedReader�� BufferedWriter�� ���۸� ����Ͽ� �ӵ��� �����ϴ� ���ڱ�� ��Ʈ�� Ŭ����
public class MainClass08 {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("MainClass01.java");
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		for(int i = 1 ; (line = br.readLine()) != null; i++) {
			//�ڹ������̹Ƿ� ;�� �������� ������ ��ȯ
			if((line.indexOf(";")) != -1) {
				System.out.println(i + ":" + line);
			}
		}
		
		br.close();
		fr.close();
	}

}
