package com.kyk.ch09Project1;


//wrapperŬ������ �⺻���� Ŭ������
//Byte, Character, Short, Integer, Long, Float, Double, Boolean 8����
//Ŭ�����̹��� ù �ڴ� �빮���̰�, �⺻���� �����ϳ� char�� int�� �� �ƴ� ���� �ܾ�
//�������� Byte, Short, Integer, Long, Float, Double�� ����Ŭ������ �߻�Ŭ���� Number�� ���� 
public class MainClass11 {

	public static void main(String[] args) {
		Integer i = new Integer(100); //int�� wrapper����ε� ������ ����� ����
		Integer i1 = 100; //�����ں��� �⺻�� �� ����
		Integer i2 = new Integer(100);
		
		System.out.println("i == i2 ? " + (i == i2));
		//wrapperŬ������ equals�� ���� ���ϵ��� �ڹٿ��� ������
		System.out.println("i.equals(i2) ? " + i.equals(i2)); //true
		System.out.println("i.equals(i2) = " + i.compareTo(i2));
		//compereTo�޼���� ���ڷ� �� ���ڸ� ���Ͽ� ������ 0, �ٸ��� 0�� �ƴ� ����
		System.out.println("i.toString() = " + i.toString());
		//���ڸ� ���ڿ��� ��ȯ
		System.out.println("MAX_VALUE = " + Integer.MAX_VALUE); //�ִ� ������
		System.out.println("MIN_VALUE = " + Integer.MIN_VALUE); //�ּ� ������
		System.out.println("SIZE = " + Integer.SIZE + " bits"); //bit��
		System.out.println("BYTES = " + Integer.BYTES + " bytes"); //����Ʈ��
		System.out.println("TYPE = " + Integer.TYPE); //�⺻��������
	}

}
