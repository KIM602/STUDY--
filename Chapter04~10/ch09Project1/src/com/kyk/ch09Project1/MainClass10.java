package com.kyk.ch09Project1;

import static java.lang.Math.*; //MathŬ������ ��� static�޼���� Math����
import static java.lang.System.*; //SystemŬ������ ��� static�޼���� System����

//MathŬ������ ����, ���� ���� ó�� Ŭ������ �޼��� ��� static�޼�����
public class MainClass10 {

	public static void main(String[] args) {
		double val = 90.7552;
		//import static�� ���ǵǾ� Ŭ���� �̸� ���� ���
		out.println("round(" + val + ")=" + round(val)); //�ݿø�(�Ҽ��� �ؿ��� �ݿø�)
		val *= 100; //val = val * 100;
		out.println("round(" + val + ")=" + round(val)); //�ݿø�(�Ҽ��� �ؿ��� �ݿø�)
	
		out.println("round(" + val + ")/100 = " + round(val)/100); //�ݿø�, int�� �����Ƿ� 90
		out.println("round(" + val + ")/100.0 = " + round(val)/100.0); //�ݿø�, double�� �����Ƿ� ������
		out.println();
		
		//out.printf("ceil(%3.1f)=%3.1f%n", 1.1, ceil(1.1));
		out.println(ceil(1.1));
		//ceil�� �ڱ⺸�� ū ���� �� ���� ���� ������ �Ҽ��� �ְ� ǥ��
		out.println(floor(1.5));
		//�ڱ⺸�� ���� ���� �� ���� ū ���� �Ҽ������� ǥ��
		out.println(rint(1.5)); //�ݿø�(���������� ǥ��)
		
		out.println(random()); //������ ������ ���� ����, 0���� 1�̸�
	}

}
