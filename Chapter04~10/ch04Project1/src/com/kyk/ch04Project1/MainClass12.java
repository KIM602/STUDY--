package com.kyk.ch04Project1;

public class MainClass12 {

	public static void main(String[] args) {
		//���� for�� �տ� '�̸� :' ���� ���δ�.
		Loop1 : for(int i = 2 ; i <= 9 ; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				if(j == 5) {
					break Loop1; //�󺧸� Loop1�� for���� �ߴ�
					//break;�� ���� for���� �ߴ�
					//continue Loop1; //Loop1�� ���� �ݺ� �ܰ� 
					//continue;�� �ڽ��� ���� �ݺ����� continue
				}
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println();
		}
		
	}

}
