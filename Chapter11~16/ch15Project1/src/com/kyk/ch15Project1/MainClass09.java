package com.kyk.ch15Project1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//InputStreamReader�� OutputStreamWriter�� ����Ʈ ���� ��Ʈ���� ���ڱ�� ��Ʈ��ó�� ����ϰ� ����
public class MainClass09 {

	public static void main(String[] args) throws Exception {
		String line = "";
		
		InputStreamReader isr = new InputStreamReader(System.in);
		//System.in�Ӽ��� InputStream�ν��Ͻ���
		//InputStreamReader������ �Ķ���ͷ� InputStream�ν��Ͻ��� ���
		BufferedReader br = new BufferedReader(isr);
		System.out.println("������� OS�� ���ڵ� : " + isr.getEncoding());
		do {
			System.out.println("������ �Է��ϼ���. ��ġ�÷��� q�� �Է��ϼ���.>");
			line = br.readLine(); //���� ������ �о��
			System.out.println("�Է��Ͻ� ���� : " + line);
		}while(!line.equalsIgnoreCase("q"));
		
		br.close(); //System.in�� ���� ǥ�� ������� ���� �ʾƵ� �ȴ�.
		System.out.println("���α׷��� �����մϴ�.");
	}
}
