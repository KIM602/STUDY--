package com.kyk.ch03Project4;

public class MainClass06 {

	public static void main(String[] args) {
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		//���ǿ�����(���׿����� ���)
		absX = x >= 0 ? x : -x;
		//absX�� ���ǽ��� ����� ������ ���� x >= 0�� ���ǽ� ? : �� ���ǽ� ������
		//��ȯ���� �����ϴ� ���� �̻���ϸ� ����
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		
		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');
		//���� �����ڸ� ��ø(���ǿ������� ���ο��� ���ǿ����� ���� ��ø���)
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-');
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-');
		
		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
		
		//���ǿ�����(���׿�����)�� if~else if~else if~else�� ��������
		
		//���մ��� ������(�ǰ�)
		x = x + 5;
		x += 5; //�ǰ�
		
		x = x * 5;
		x *= 5;
		
	}
}
