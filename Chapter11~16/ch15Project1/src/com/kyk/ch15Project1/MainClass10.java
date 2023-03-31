package com.kyk.ch15Project1;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class MainClass10 {

	public static void main(String[] args) {
		PrintStream ps = null; //���� ��Ʈ��
		FileOutputStream fos = null; //�⺻ ��� ��Ʈ��
		
		try {
			fos = new FileOutputStream("test.txt");
			ps = new PrintStream(fos);
			System.setOut(ps); //��� ����� ����, PrintStream�� ���� test.txt�� ����ϴ� ��ü�� ����ϹǷ� ����� ���Ͽ� ��
			//setOut�� ǥ�� ��� System.out�� ���Ͽ� ó��
			//setErr�� ǥ�� ��� System.err�� ���Ͽ� ó��
			//System.setErr(ps); //System.err�� ���Ͽ� ���
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//����� ���â�� ó��
		System.out.println("Hello by System.out"); //���Ͽ� ó��
		System.err.println("Hello by System.err"); //�ֿܼ� ���(���ڻ� red)
	}

}
