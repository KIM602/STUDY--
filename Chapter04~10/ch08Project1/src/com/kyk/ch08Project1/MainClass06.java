package com.kyk.ch08Project1;

public class MainClass06 {

	public static void main(String[] args) {
		//���ܿ��� Exception�迭�� RuntimeException�迭�� ���е�
		Exception e = new Exception();
		//throw e; //������ ���� �߻�
		//throw new Exception(); ���ٷ� ó��
		//Exception ���ܴ� try~catch��  ���ܸ� ó�� ���ϸ� ������ ����(check����)
		
		throw new RuntimeException(); //������ ������ ���� ���α׷� ���� �� ���� �߻�(unchecked ����)
		//�����߿��� ���ܰ� �߻��ϹǷ� �ش� ���ܸ� ó��
		//RuntimeException�� Exception�� �����̹Ƿ� catch(Exception e)�� ���� ó��
	}

}
