package com.kyk.ch08Project1;

public class MainClass05 {

	public static void main(String[] args) {
		//������ ���� �߻��� try ��� �ȿ��� �߻���Ŵ
		try {
			//�ڹ��� Ŭ���� ���� ������ ������ Ŭ������ ���� �� shift + F2
			Exception e= new Exception("���Ƿ� �߻�������.");
			//���� �߻��� �޼����� �־��ִ� �����ڸ� ����Ͽ� ���� �ν��Ͻ��� ����
			throw e; //throwŰ���带 �̿��Ͽ� ������ �ش� catch����� �޾Ƽ� ó��
		}
		catch(Exception e) {
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("finally"); //try~catch���� ������ �� ��ġ�� �κ�
		}
		
		System.out.println("���α׷��� ���� ����Ǿ���.");
	}

}
