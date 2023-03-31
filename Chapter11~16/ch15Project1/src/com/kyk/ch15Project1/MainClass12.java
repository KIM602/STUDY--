package com.kyk.ch15Project1;

import java.io.File;

public class MainClass12 {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE : java DIRECTORY�� �Է��ϼ���");
			System.exit(0); //�ڹ� ���α׷� ����
		}
		
		File f = new File(args[0]);
		if (!f.exists() || !f.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		
		for(File x : files) {
			String fileName = x.getName();
			System.out.println(x.isDirectory() ? "[" + fileName + "]" : fileName);
		}
	}
}
