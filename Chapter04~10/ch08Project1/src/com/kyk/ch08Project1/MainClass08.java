package com.kyk.ch08Project1;

import java.io.File;

public class MainClass08 {

	public static void main(String[] args) {
		try {
			//main메서드의 파라메터 args를 사용시는 run configuration으로 자바를 실행시 값을 더하여줌
			File f = createFile(args[0]); //args[0]는 파일 이름
			//File클래스는 file처리에 관한 속성, 메서드를 가지고 있는 클래스
			System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다");
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage() + "다시 입력해 주시기 바립니다.");
		}
		
		System.out.println("main의 마지막");
	}
	
	static File createFile(String fileName) throws Exception { //Exception예외처리를 호출한 메서드 main메서드로 위임
		if (fileName == null || fileName.equals("")) {
			throw new Exception("파일이름이 유효하지 않습니다.");
			//메세지가 파일이름이 유효하지 않습니다.를 가진 예외를 만들어 던져줌
		}
		
		File f = new File(fileName); //파일 객체 생성, fileName을 가진 파일들을 처리하는 인스턴스
		boolean b = f.createNewFile()	; //실제 파일을 생성(내용이 없는 파일을 디스크에 만듬)
		return f;
	}

}
