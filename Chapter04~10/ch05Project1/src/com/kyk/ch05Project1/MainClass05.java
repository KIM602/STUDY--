package com.kyk.ch05Project1;

public class MainClass05 {

	public static void main(String[] args) {
		//main�޼����� �Ķ���ʹ� String[] args�̴�.
		//�ܺο��� main�޼��带 ȣ��ÿ� �Ķ���Ϳ� �µ��� String�迭�� ���� �־��ش�.
		//�޼���� �Լ���� �����ϸ� �ȴ�. f(x,y) = x * 5 + y * 7; ����� f(3,4)
		System.out.println("�Ű������� ����:" + args.length);
		for(int i = 0 ; i < args.length ; i++) {
			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
			
		}
	}

}
