package com.kyk.ch04Project1;

public class MainClass02 {

	public static void main(String[] args) {
		int x = 0;
		
		System.out.printf("x=%d �϶�, ���ΰ��� %n",x);
		if(x == 0)
			System.out.println("x==0");
		//if�� true�� �� ������ ������ �ϳ��Ͻô� { }����
		if(x != 0) { //x�� 0�̹Ƿ� false�� �Ǿ� { }���� ����
			System.out.println("x!=0");
		}
		if(!(x == 0)) { //true�� �������������� !���� false�̹Ƿ� {}�������
			System.out.println("!(x==0)");
	    }
		if(!(x != 0)) { //false�� �������������� !���� �����Ͽ� true�̹Ƿ� {}����
			System.out.println("!(x!=0)");
		}
		
		String str = "3";
		char ch = ' ';
		if(str != null && !str.equals("")) {
			//���� ���ڿ� �� ������ ����Ͽ� ���ǽ��� ����
			ch = str.charAt(0); //str���ڿ����� ���ι�ȣ 0���� ����
			System.out.println("ch : " + ch);
		}
	}

}
