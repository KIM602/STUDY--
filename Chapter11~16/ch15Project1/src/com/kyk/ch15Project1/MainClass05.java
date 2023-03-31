package com.kyk.ch15Project1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Vector;

public class MainClass05 {

	public static void main(String[] args) throws Exception {
		byte[] arr1 = {0, 1, 2};
		byte[] arr2 = {3, 4, 5};
		byte[] arr3 = {6, 7, 8};
		byte[] outSrc = null;
		
		Vector<ByteArrayInputStream> v = new Vector<>(); //Collection의 List계열 클래스
		
		v.add(new ByteArrayInputStream(arr1));
		v.add(new ByteArrayInputStream(arr2));
		v.add(new ByteArrayInputStream(arr3));
		
		SequenceInputStream input = new SequenceInputStream(v.elements());
		//Enumeration<ByteArrayInputStream> java.util.Vector.elements()는 Enumeration객체 변환(Collection을 반복처리 하는 클래스)
		//ByteArrayInputStream 3개를 연결하여 사용하는 보조 스트림을 만듬
		//ByteArrayInputStream인스턴스 2개를 만들어 생성자 파라메터에 넣어도 됨(2개만 사용)
		//public SequenceInputStream(InputStream s1, InputStream s2)
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data = 0;
		
		while((data = input.read()) != -1) {
			output.write(data);
		}
		
		outSrc = output.toByteArray();
		
		System.out.println("Input Source1 : " + Arrays.toString(arr1));
		System.out.println("Input Source1 : " + Arrays.toString(arr2));
		System.out.println("Input Source1 : " + Arrays.toString(arr3));
		System.out.println("Output Source1 : " + Arrays.toString(outSrc));
	}

}
