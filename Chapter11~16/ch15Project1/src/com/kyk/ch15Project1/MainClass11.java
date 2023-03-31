package com.kyk.ch15Project1;

import java.io.File;

public class MainClass11 {

	public static void main(String[] args) throws Exception {
		File f1 = new File("D:/KYK/workspace/ch15Project1/src/com/kyk/ch15Project1/MainClass01.java");
		//절대경로의 파일 이름을 사용하여 파일 객체 만듬
		File f2 = new File("forest.jpg"); //파일 이름만 사용하여 파일 객체 만듬, 파일이 현재 경로(프로젝트 밑)에 있어야 함
		String fileName = f1.getName(); //마지막 파일이름
		System.out.println("경로를 제외한 파일이름 - " + f1.getName());
		int pos = fileName.lastIndexOf("."); //확장자 표시 .의 색인번호
		System.out.println("확장자를 제외한 파일이름 - " + fileName.substring(0,pos));
		System.out.println("확장자 - " + fileName.substring(pos+1));
		//String java.lang.String.substring(int beginIndex) beginIndex부터 마지막까지 선택
		
		System.out.println("경로를 포함한 파일이름 - " + f1.getPath()); //상대경로 시 상대경로 표시
		System.out.println("파일의 절대경로 - " + f1.getAbsolutePath()); //상대경로 시에도 전체 절대경로 표시
		System.out.println("파일의 정규경로 - " + f1.getCanonicalPath()); // './' 또는 '../'을 정리하여 표시
		System.out.println("파일이 속해있는 디렉토리 - " + f1.getParent());
		System.out.println();
		System.out.println("File.pathSeperator - " + File.pathSeparator);
		System.out.println("File.pathSeperatorChar - " + File.pathSeparatorChar);
		System.out.println("File.separator - " + File.separator);
		System.out.println("File.separatorChar - " + File.separatorChar);
		System.out.println();
		
		System.out.println("user.dir = " + System.getProperty("user.dir"));
		System.out.println("sun.boot.class.path = " + System.getProperty("sun.boot.class.path"));
	}
}
