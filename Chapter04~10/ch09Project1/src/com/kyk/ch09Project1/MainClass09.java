package com.kyk.ch09Project1;

public class MainClass09 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("01");
		//append(���ڿ�)�޼���� StringBuffer�ν��Ͻ� �ڽſ��� ���̱�
		StringBuffer sb2 = sb.append(23); //sb�� 0123
		sb.append('4').append(56); //chaining sb�� 0123456
		
		StringBuffer sb3 = sb.append(78); //sb�� 012345678
		sb3.append(9.0); //0123456789.0
		
		//sb2�� sb3�� sb�� �ּҰ��� �����Ƿ� ��� ���� ���� ����ȴ�.
		
		System.out.println("sb =" + sb);
		System.out.println("sb2 = " + sb2);
		System.out.println("sb3 = " + sb3);
		
		System.out.println("sb = " + sb.deleteCharAt(10));
		//sb���� ���ι�ȣ  10���� ���ڸ� ����
		System.out.println("sb = " + sb.delete(3, 6));
		//���ι�ȣ 3������ 6-1���� ����
		System.out.println("sb = " + sb.insert(3, "abc"));
		//���ι�ȣ �տ� ���ڿ� ����
		System.out.println("sb = " + sb.replace(6, sb.length(), "END"));
		//6�� ���ι�ȣ���� ���ڿ��� ũ��-1����(������ ���ι�ȣ)������ END�� ��ü
		System.out.println("capacity = " + sb.capacity());
		//�뷮�� �� ���ڴ� 2����Ʈ ����(9�� * 2) - �����ڵ� Ư��
		System.out.println("length = " + sb.length());
		//������ ��
	}

}
