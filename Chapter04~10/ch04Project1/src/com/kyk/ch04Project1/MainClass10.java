package com.kyk.ch04Project1;

public class MainClass10 {
	
	private int pri; //�޼��� �ۿ��� �ݵ� ��������(�۷ι�����), private : ���� Ŭ������ ������ ����(���Ȼ�)

	public static void main(String[] args) {
		//�޼��� �ȿ��� ���� ���ú���(��������)
		int sum = 0;
		int i   = 0;
		//�⺻�� byte short int long float double boolean char
		//�������� �⺻���� �ƴѰ� : MainClass10, String, System, Math, Integer, Scanner
		
		while(true) { //���ǽ��� true�̹��� ������ ����� ���� �� ���ѷ����� �� �� ����
			if(sum > 100) {
				break; //break�� �ڽ��� ���� �ݺ����� ����
			}
			
			++i;
			sum += i;
		}
		
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}

}
