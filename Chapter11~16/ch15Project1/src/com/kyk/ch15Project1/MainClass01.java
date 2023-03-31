package com.kyk.ch15Project1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class MainClass01 {

	public static void main(String[] args) { //read�ϸ� �����͸� �ϳ��� ���� �Ҹ��ϹǷ� �⺻������ ����
		byte[] inSrc = {0,1,2,3,4,5,6,6,7,8,9}; //byte�迭�� ������ -128 ~ 127������ ���� ��밡��
		byte[] outSrc = null;
		byte[] temp = new byte[10];
		
		ByteArrayInputStream input = null;
		//���� �߻�Ŭ���� InputStream�� ��ӹ��� �޸𸮸� ������� ����Ʈ ������ ó���ϴ� Ŭ����
		ByteArrayOutputStream output = null;
		//���� �߻�Ŭ���� OutputStream�� ��ӹ��� �޸𸮸� ������� ����Ʈ ������ ó���ϴ� Ŭ����
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
	
		int data = 0;
		
		while((data = input.read()) != -1) {
			//int java.io.ByteArrayInputStream.read()�� input���κ��� 1����Ʈ�� �о�´�.(0 ~ 255)
			//-1�� �о�� ���� ������ ��ȯ
			//void java.io.ByteArrayOutputStream.wirte(int b)
			output.write(data);
		}
		
		outSrc = output.toByteArray(); //��Ʈ���� ������ byte�迭�� ��ȯ�Ѵ�.
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		
		byte[] inSrc1 = {0,1,2,3,4,5,6,7,8,9,-126};
		input = new ByteArrayInputStream(inSrc1);
		input.read(temp,0,temp.length);
		//int java.io.ByteArrayInputStream.read(byte[] b, int off, int len)
		//��ȯ���� ���� ������ �� off���ι�ȣ ��ġ�������� len���� �о� byte�迭 b�� ����
		//temp�� ���� �迭, 0�� ���ι�ȣ 0, temp.length�� �迭 ������ ����
		output = new ByteArrayOutputStream();
		output.write(temp,5,5);
		//void java.io.ByteArrayOutputStream.write(byte[] b, int off, int len)
		//�迭 b�� off�������� len���� wirte
		//�迭 temp�� ���ι�ȣ 5������ 5���� output�� write
		
		outSrc = output.toByteArray();
		
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("Output Source" + Arrays.toString(outSrc));
	}

}
