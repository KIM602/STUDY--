package com.kyk.ch15Project1;

import java.io.BufferedReader;
import java.io.FileReader;

//BufferedReader와 BufferedWriter는 버퍼를 사용하여 속도를 개선하는 문자기반 스트림 클래스
public class MainClass08 {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("MainClass01.java");
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		for(int i = 1 ; (line = br.readLine()) != null; i++) {
			//자바파일이므로 ;이 마지막인 라인을 반환
			if((line.indexOf(";")) != -1) {
				System.out.println(i + ":" + line);
			}
		}
		
		br.close();
		fr.close();
	}

}
