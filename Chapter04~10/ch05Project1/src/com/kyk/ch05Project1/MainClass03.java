package com.kyk.ch05Project1;

public class MainClass03 {

	public static void main(String[] args) {
		int[] ball = new int[45]; //45���� ���Ҹ� ���� �迭 (�ζǰ� 45���� ���)
		
		//�迭�� �� ��ҿ� 1~45�� ���� �����Ѵ�
		for(int i=0; i < ball.length; i++) {
			//�ζǿ� ���Ǵ� �� 1~45�� �迭�� ������� ����
			ball[i] = i + 1;
		}
			
		int tmp = 0; //�� ��ȯ�� ����ϴ� �ӽ� ����
		int j = 0; //ball�迭�� ���� ���ι�ȣ�� ���Ƿ� �����Ͽ� �����ϴ� ����
		
		//���� 6�� ���Ҹ� ���Ƿ� ����� ���Ұ����� ��ȯ
		for(int i = 0; i < 6; i++) {
				j = (int)(Math.random() * 45); //0���� 44���� ������ �����
				//j�� ������ ball�� ���ι�ȣ
				tmp = ball[i];
				ball[i] = ball[j];
				ball[j] = tmp;
		}
		
		//�ζ� ��ȣ ����� �տ��� 6���� ���.
		for(int i = 0 ; i < 6 ; i++ ) {
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		}
	}

}
