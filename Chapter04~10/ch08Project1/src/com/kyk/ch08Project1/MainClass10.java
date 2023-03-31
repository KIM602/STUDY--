package com.kyk.ch08Project1;

public class MainClass10 {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
			
		}
		catch(SpaceException e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
		}
		catch(MemoryException me) {
			System.out.println("에러 메시지 : " + me.getMessage());
			me.printStackTrace();
			System.gc(); //Garbage Collection을 수행하여 메모리를 늘려준다.
			System.out.println("다시 설치를 시도하세요.");
		}
		finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		//예외발생시 개발자가 만든 SpaceException, MemoryException을 main메서드에서 처리하도록 함
		if(!enoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다.");
			//개발자가 만든 예외를 발생시켜 던져줌
		}
		if(!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}
	}
	private static boolean enoughMemory() {
		return true;
	}

	static boolean enoughSpace() {
		return false;
	}

	static void deleteTempFiles() {
		
	}
	static void copyFiles() {
		
	}
}

//JDK의 예외처리 클래스를 상속하는 개발자 정의 예외처리 클래스
class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg); //예외 내용의 메세지를 가진 예외 인스턴스를 만듬
	}
}

class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}