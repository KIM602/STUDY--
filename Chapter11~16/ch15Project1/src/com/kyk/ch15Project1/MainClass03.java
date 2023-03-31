package com.kyk.ch15Project1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass03 {

	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("forest.jpg");
		
		start = System.currentTimeMillis();
		
		while(fis1.read() != -1) {
			
		}
		
		end = System.currentTimeMillis();
		 
		System.out.println("사용하지 않았을 때 : " + (end - start) + "ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("forest.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		//보조 스트림인 BufferedInputStream은 기반 스트림인 FileInputStream인스턴스를 이용하여 생성
		start = System.currentTimeMillis();
		
		while(bis.read() != -1) {
			
		}
	
		end = System.currentTimeMillis();
		
		System.out.println("사용했을 때 : " + (end - start) + "ms");
		
		bis.close();
		fis2.close();
		
		//buffer사용시 buffer를 한번 거치므로 약간의 시간이 더 소요될 수도 있고 빠를 수도 있으나 cpu의 효율은 좋아진다.
		
		FileOutputStream fos = new FileOutputStream("123.txt");
		//BufferedOutputStream의 버퍼 크기를 5로 한다.
		BufferedOutputStream bos1 = new BufferedOutputStream(fos,5); //기본크기는 8192바이트이나 여기서는 5바이트로 만듬
		for(int i = '1'; i <= '9' ; i++) {
			bos1.write(i);
		}
		//BufferedOutputStream의 크기가 5바이트이므로 6부터는 기록 못함
		bos1.flush();
		bos1.close();
		
		FileInputStream fis3 = new FileInputStream("forest.jpg");
		BufferedInputStream bis3 = new BufferedInputStream(fis3);
		FileOutputStream fos3 = new FileOutputStream("forest1.jpg");
		BufferedOutputStream bos3 = new BufferedOutputStream(fos3);
		
		int data = -1;
		while((data = bis3.read()) != -1) {
			bos3.write(data);
		}
		
		bos3.flush();
		bos3.close();
		fos3.close();
		bis3.close();
		fis3.close();
	}

}
