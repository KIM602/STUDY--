package com.kyk.ch15Project1;

import java.io.StringReader;
import java.io.StringWriter;

//StringReader�� StringWriter�� �޸𸮿� �ִ� ���ڿ��� ó���ϴ� ��Ʈ�� Ŭ����
public class MainClass07 {

	public static void main(String[] args) throws Exception{
		String inputData = "ABCD";
		StringReader input = new StringReader(inputData);
		//�ν��Ͻ� ������ ������ �Ķ���ͷ� ���ڿ��� ���
		StringWriter output = new StringWriter();
		
		int data = 0;
		
		while((data = input.read()) != -1) {
			output.write(data);
		}
		
		System.out.println("Input Data : " + inputData);
		System.out.println("Output Data : " + output.toString());
	}

}
