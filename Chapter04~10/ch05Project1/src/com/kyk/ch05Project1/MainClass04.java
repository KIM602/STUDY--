package com.kyk.ch05Project1;

public class MainClass04 {

	public static void main(String[] args) {
		String[] names = {"Kim", "Park", "Yi"}; //String�迭 ����� �ʱ�ȭ, ũ�Ⱑ 3�� �迭 ����
		for(int i = 0 ; i < names.length; ++i) {
			System.out.println("names[" + i +"]);" + names[i]);
		}
		String tmp = names[2]; //names�迭�� String�迭�̹Ƿ� ���Ҵ� String�̹Ƿ� tmp�� String
		System.out.println("tmp:"+tmp);
		//�迭�� ������ �迭 ���Ұ��� ����
		names[0] = "Yu";
		for(int i = 0 ; i < names.length ; ++i)	{
			System.out.println("names[" + i + "]:" + names[i]);
		}
		
		String str = "ABCDE"; //char[] str = {'A','B','C','D','E'}
		char ch = str.charAt(3);
		String tmp1 = str.substring(1, 4); //���ι�ȣ 1������ ���ι�ȣ 4-1(3)���� ����
		//substring(int from,int end)�� from���ι�ȣ���� end-1���ι�ȣ������ ���ڿ��� ��ȯ
		//���ڿ� �񱳴� str.equals(�񱳹��ڿ�), str.equalsIgnoreCase(���ڿ�)
		System.out.println(tmp1);
	}
}
