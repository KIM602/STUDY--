package com.kyk.ch15Project1;

import java.io.FileReader;
import java.io.FileWriter;

//문자기반 stream은 2바이트 UTF로 처리
public class MainClass06 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader(args[0]);
			//FileReader(String fileName)생성자는 파라메터로 파일 이름을 사용
			FileWriter fw = new FileWriter(args[1]);
			
			int data = 0;
			while((data = fr.read()) != -1) { //char코드를 읽어 정수형으로 변형
				if(data != '\t' && data != '\n' && data != ' ' && data != '\r') {
					fw.write(data);
				}
			}
			fr.close();
			fw.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
