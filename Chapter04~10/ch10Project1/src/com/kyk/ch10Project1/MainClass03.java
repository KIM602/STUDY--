package com.kyk.ch10Project1;

import java.text.DecimalFormat;

//���ڸ� ���ϴ� ������ ���ڿ��� ó���ϴ� DecimalFormatŬ����
public class MainClass03 {

	public static void main(String[] args) {
		double num = 1234567.89;
		DecimalFormat df = new DecimalFormat("0");
		//���� "0"�� �������� �ݿø��� �����κи� 10���� ��ȯ
		System.out.println(df.format(num)); //1234568
		
		df = new DecimalFormat("0.0");
		//���� "0.0"�� ������ �ݿø��� �Ҽ��� ù��° ���� ó��
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000000000.00000");
		//"0000000000.00000"������ ������ 10�ڸ�, �Ҽ����� 5�ڸ��� ó���ϴµ� ���� �κ��� 0���� ó��
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		//"#"������ 10������ �����κи� ó���ϰ� ���� �κ��� 0���� ó�� ����(�ݿø�)
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		//"0.0"�� ����, ���ºκ��� ó�� ����
		System.out.println(df.format(num));
		
		df = new DecimalFormat("##########.#####");
		//"0000000000.00000"�� �����ϳ� �ڸ��� �κ��� ó�� ����
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0");
		//"#,###.0"������ ���ڸ� 10������ ó���ϰ� �Ҽ����� ���ڸ��� ǥ���ϴµ� ���ڸ� ���ڸ����� ����ǥ��, ����
		System.out.println(df.format(num));
	}

}
