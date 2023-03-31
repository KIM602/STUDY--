package com.kyk.ch15Project1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//FileInputStream과 FileOutputStream은 파일을 대상으로 입출력 처리
//이미지나 파일 업로딩 다운로딩시에 응용
public class MainClass02 {

	public static void main(String[] args) throws IOException {
		//FileInputStream생성자는 예외처리
		FileInputStream fis = new FileInputStream(args[0]);
		//java.io.FileInputStream.FileInputSteam(String name) throws FileNotFoundException
		//생성자의 파라메터에 파일이름을 사용하여 객체 생성하면 파일로부터 입력을 처리하는 인스턴스 생성
		//파일이 없으면 에러
		
		FileOutputStream fos = new FileOutputStream(args[1]);
		//file이 없으면 출력할 파일을 만들어줌

		int data = 0;
		while((data = fis.read()) != -1) {
			char c = (char) data;
			System.out.print(c);
			fos.write(data);
		}
		
		fis.close();
		fos.close();
	}

}
