package com.kyk.ch15Project1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class MainClass01 {

	public static void main(String[] args) { //read하면 데이터를 하나씩 빼와 소모하므로 기본값으로 남음
		byte[] inSrc = {0,1,2,3,4,5,6,6,7,8,9}; //byte배열은 원래는 -128 ~ 127까지의 정수 사용가능
		byte[] outSrc = null;
		byte[] temp = new byte[10];
		
		ByteArrayInputStream input = null;
		//상위 추상클래스 InputStream을 상속받은 메모리를 대상으로 바이트 단위로 처리하는 클래스
		ByteArrayOutputStream output = null;
		//상위 추상클래스 OutputStream을 상속받은 메모리를 대상으로 바이트 단위로 처리하는 클래스
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
	
		int data = 0;
		
		while((data = input.read()) != -1) {
			//int java.io.ByteArrayInputStream.read()는 input으로부터 1바이트를 읽어온다.(0 ~ 255)
			//-1은 읽어올 값이 있을시 반환
			//void java.io.ByteArrayOutputStream.wirte(int b)
			output.write(data);
		}
		
		outSrc = output.toByteArray(); //스트림의 내용을 byte배열로 변환한다.
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		
		byte[] inSrc1 = {0,1,2,3,4,5,6,7,8,9,-126};
		input = new ByteArrayInputStream(inSrc1);
		input.read(temp,0,temp.length);
		//int java.io.ByteArrayInputStream.read(byte[] b, int off, int len)
		//반환값은 읽은 데이터 수 off색인번호 위치에서부터 len개를 읽어 byte배열 b에 저장
		//temp는 저장 배열, 0은 색인번호 0, temp.length은 배열 원소의 개수
		output = new ByteArrayOutputStream();
		output.write(temp,5,5);
		//void java.io.ByteArrayOutputStream.write(byte[] b, int off, int len)
		//배열 b의 off에서부터 len개를 wirte
		//배열 temp의 색인번호 5번부터 5개를 output에 write
		
		outSrc = output.toByteArray();
		
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("Output Source" + Arrays.toString(outSrc));
	}

}
