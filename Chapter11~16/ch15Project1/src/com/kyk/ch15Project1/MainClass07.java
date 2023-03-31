package com.kyk.ch15Project1;

import java.io.StringReader;
import java.io.StringWriter;

//StringReader와 StringWriter는 메모리에 있는 문자열을 처리하는 스트림 클래스
public class MainClass07 {

	public static void main(String[] args) throws Exception{
		String inputData = "ABCD";
		StringReader input = new StringReader(inputData);
		//인스턴스 생성시 생성자 파라메터로 문자열을 사용
		StringWriter output = new StringWriter();
		
		int data = 0;
		
		while((data = input.read()) != -1) {
			output.write(data);
		}
		
		System.out.println("Input Data : " + inputData);
		System.out.println("Output Data : " + output.toString());
	}

}
