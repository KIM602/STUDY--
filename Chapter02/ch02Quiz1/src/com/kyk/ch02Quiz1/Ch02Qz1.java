package com.kyk.ch02Quiz1;

public class Ch02Qz1 {

	public static void main(String[] args) {
		/*
		 * ���� 1 : I am learning Java�� ����ϰ� ���� �ٲټ���.
		 * ���� 2 : 5 * 6 ���� ����ϰ� ���� �ٲټ���.
		 * ���� 3 : ����¥�� �ּ� �̰��� ���� �ּ��Դϴ� �����
		 * ���� 4 : ������ ���� �ּ� �̰��� 1��° �� �ּ�, �̰��� 2��° �� �ּ��� ���弼��.
		 * ���� 5 :
		 *   4����Ʈ ���� myNum�� ����� 5�� ����(�������� �⺻���� 4����Ʈ ����)
		 *   4����Ʈ �Ǽ� myFloatNum�� ����� 5.99f ����
		 *   2����Ʈ ���������� myLetter�� ����� D�� ����
		 *   1����Ʈ �������� myBool�� ����� false�� ����
		 *   ���ڿ� ���� myText�� ����� Hello�� ����
		 *   8����Ʈ ���� ���� myLong�� ����� 5000L�� ����
		 *   8����Ʈ �Ǽ� myDouble�� ����� 11.22�� ����(�Ǽ����� �⺻���� ������)
		 *   
		 *   ���� �������� ����ϼ���.
		 */
		
		
		System.out.println("I am learning Java");
		System.out.println(5*6);
		//�̰��� ���� �ּ��Դϴ�.
		/* 
		 * �̰��� ù��° �� �ּ�
		 * �̰��� �ι�° �� �ּ�
		 */
		int myNum = 5;
		float myFloatNum = 5.99f; //f�� float���� ��Ÿ���� ���̻�
		char myLetter = 'D'; //char���� ' '�ȿ� �־���
		boolean myBool = false; //boolean���� true�� false �ΰ��� ����
		String myText= "Hello"; //String���� " "�ȿ� �־��ְ� �⺻�� ������ �ƴϰ� ��������
		long myLong = 5000L; //long�� ������ �ڿ� L�� ÷��
		double myDouble = 11.22; //�Ǽ��� �⺻���� double����
		//���� ��½ô� ���� �̸��� �־��ָ� ��
		
		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(myText);
		System.out.println(myLong);
		System.out.println(myDouble);
		
		//��Ŭ���������� �����ϸ� �ڵ����� �����ϵǾ� ����Ʈ�ڵ�(����)�� .class������ ����
	}

}
