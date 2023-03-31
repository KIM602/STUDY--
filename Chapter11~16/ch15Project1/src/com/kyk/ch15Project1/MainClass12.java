package com.kyk.ch15Project1;

import java.io.File;

public class MainClass12 {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE : java DIRECTORY를 입력하세요");
			System.exit(0); //자바 프로그램 종료
		}
		
		File f = new File(args[0]);
		if (!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		
		for(File x : files) {
			String fileName = x.getName();
			System.out.println(x.isDirectory() ? "[" + fileName + "]" : fileName);
		}
	}
}
