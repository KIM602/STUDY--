package com.kyk.ch08Project1;

public class MainClass05 {

	public static void main(String[] args) {
		//예외의 고의 발생은 try 블록 안에서 발생시킴
		try {
			//자바의 클래스 등의 설명을 보려면 클래스를 선택 후 shift + F2
			Exception e= new Exception("고의로 발생시켰음.");
			//예외 발생시 메세지를 넣어주는 생성자를 사용하여 예외 인스턴스를 만듬
			throw e; //throw키워드를 이용하여 던지면 해당 catch블록이 받아서 처리
		}
		catch(Exception e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("finally"); //try~catch에서 무조건 꼭 거치는 부분
		}
		
		System.out.println("프로그램이 정상 종료되었음.");
	}

}
