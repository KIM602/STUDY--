package com.kyk.ch08Project1;

public class MainClass10 {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
			
		}
		catch(SpaceException e) {
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
			System.out.println("������ Ȯ���� �Ŀ� �ٽ� ��ġ�Ͻñ� �ٶ��ϴ�.");
		}
		catch(MemoryException me) {
			System.out.println("���� �޽��� : " + me.getMessage());
			me.printStackTrace();
			System.gc(); //Garbage Collection�� �����Ͽ� �޸𸮸� �÷��ش�.
			System.out.println("�ٽ� ��ġ�� �õ��ϼ���.");
		}
		finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		//���ܹ߻��� �����ڰ� ���� SpaceException, MemoryException�� main�޼��忡�� ó���ϵ��� ��
		if(!enoughSpace()) {
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
			//�����ڰ� ���� ���ܸ� �߻����� ������
		}
		if(!enoughMemory()) {
			throw new MemoryException("�޸𸮰� �����մϴ�.");
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

//JDK�� ����ó�� Ŭ������ ����ϴ� ������ ���� ����ó�� Ŭ����
class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg); //���� ������ �޼����� ���� ���� �ν��Ͻ��� ����
	}
}

class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}