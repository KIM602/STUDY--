package com.kyk.ch07Project1;

public class MainClass15 {

	public static void main(String[] args) {
		//����Ŭ������ ���� �ٸ� Ŭ������ �����ϱ� ���� �ٸ� Ŭ���� ��ü ����
		Outer2 oc = new Outer2();
		//�ٸ� Ŭ������ ����Ŭ������ ������������ Ŭ���� ��θ� ���
		//�ν��Ͻ��� ���� Ŭ���� ��ü�� ����Ŭ������ ���� �ٸ� Ŭ���� ��ü�� �̿�
		Outer2.InstaceInner ii = oc.new InstaceInner();
		System.out.println("ii.iv : " + ii.iv);
		
		//�ٸ� Ŭ������ static�� Ŭ������ static����� ��ü ���� ���� Ŭ���� ��θ� ���
		System.out.println("Outer2.StaticInner.cv : " + Outer2.StaticInner.cv);
		
		//staticŬ������ �ν��Ͻ� ������ �ܺ� ��ü�� �ȸ���� Ŭ���� ��θ� ����Ͽ� ��ü ����
		Outer2.StaticInner si = new Outer2.StaticInner();
		System.out.println("si.iv : " + si.iv);
	}

}

//����Ŭ������ ���� Ŭ����
class Outer2 {
	class InstaceInner { //�ν��Ͻ��� ���� Ŭ����
		int iv = 100; //�ν��Ͻ������ ���� static final ����� ����
	}
	
	static class StaticInner { //static�� ���� Ŭ����
		int iv = 200; //�ν��Ͻ� static ��� ����
		static int cv = 300;
	}
	
	void myMethod() { //Outer2�� �ν��Ͻ��� �޼���
		class LocalInner { //���� ����Ŭ����(�޼��� �ȿ����� ����)
			int iv = 400; //static�� �Ұ�
		}
	}
}
