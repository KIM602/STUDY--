package com.kyk.ch15Project1;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class MainClass10 {

	public static void main(String[] args) {
		PrintStream ps = null; //보조 스트림
		FileOutputStream fos = null; //기본 출력 스트림
		
		try {
			fos = new FileOutputStream("test.txt");
			ps = new PrintStream(fos);
			System.setOut(ps); //출력 대상을 변경, PrintStream이 파일 test.txt에 출력하는 객체를 사용하므로 출력이 파일에 됨
			//setOut은 표준 출력 System.out을 파일에 처리
			//setErr은 표준 출력 System.err을 파일에 처리
			//System.setErr(ps); //System.err시 파일에 출력
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//변경된 출력창에 처리
		System.out.println("Hello by System.out"); //파일에 처리
		System.err.println("Hello by System.err"); //콘솔에 출력(글자색 red)
	}

}
