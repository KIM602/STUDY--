package com.kyk.ch15Project1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//InputStreamReader와 OutputStreamWriter는 바이트 기준 스트림을 문자기반 스트림처럼 사용하게 해줌
public class MainClass09 {

	public static void main(String[] args) throws Exception {
		String line = "";
		
		InputStreamReader isr = new InputStreamReader(System.in);
		//System.in속성은 InputStream인스턴스임
		//InputStreamReader생성자 파라메터로 InputStream인스턴스를 사용
		BufferedReader br = new BufferedReader(isr);
		System.out.println("사용중인 OS의 인코딩 : " + isr.getEncoding());
		do {
			System.out.println("문장을 입력하세요. 마치시려면 q를 입력하세요.>");
			line = br.readLine(); //다음 라인을 읽어옴
			System.out.println("입력하신 문장 : " + line);
		}while(!line.equalsIgnoreCase("q"));
		
		br.close(); //System.in과 같은 표준 입출력은 닫지 않아도 된다.
		System.out.println("프로그램을 종료합니다.");
	}
}
