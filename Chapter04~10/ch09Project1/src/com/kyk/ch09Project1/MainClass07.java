package com.kyk.ch09Project1;

//�⺻������ ���ڿ��� ��ȯ�ô� String.valueOf(�⺻�� ��) �Ǵ� �⺻���� + ""�� ���
//���ڿ��� �⺻������ ����ô� �⺻���� Ŭ����.parse�⺻��Ŭ����(���������ڿ�) �Ǵ� valueOf(������ ���ڿ�)

public class MainClass07 {

	public static void main(String[] args) {
		int iVal = 100;
		//�������� String���� ��ȯ�ô� String.valueOf(�⺻����);�� ���
		String strVal = String.valueOf(iVal);
		
		double dVal = 200.0;
		String strVal2 = dVal + ""; //���ڿ� ���� ������ + �� �� ""�� ����Ͽ� ���ڿ��� ����
		
		double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
		//���ڿ� +100�� Integer.parseInt�޼���� ������ ��ȯ
		//���ڿ� 200.0�� Double�� ������ ��ȯ
		
		//parse���������޼��� ��� jdk1.5�̻���� ����ϴ� valueOf�޼��� ���
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("", strVal,"+", strVal2, "=") + sum);
		//join�޼���� StringŬ���� ���� static�޼���� ���� ���� ������ �ڴ� ���� ǥ��
		System.out.println(strVal + "+" + strVal2 + "=" + sum2);
	}

}
