package com.kyk.ch07Project1;

public class MainClass11 {

	public static void main(String[] args) {
		//Unit[] group = new Unit[3];
		//Marine, Tank, Dropship�� Unit�� ����� ����Ŭ���� �ν��Ͻ��̹Ƿ� �������� ���� �迭 ���ҷ� ��� ����
		Unit[] group = { new Marine() , new Tank() , new Dropship() };
		//�迭�� ���� {  }�� �ٷ� �ִ� ����� �迭 ���� ����ÿ� ���� ���־�� �Ѵ�.
	
		for(int i = 0; i < group.length; i++) {
			group[i].move(100, 200);
	}
		
	/* 
	 * enhanced for
	 * for(Unit x : group) {
	 * x.move(100, 200); x�� ���������� ���� �ش� Ŭ������ move�� ȣ��
	 * }
	 */
	}
}

abstract class Unit { //�߻�Ŭ������ classŰ���� ���� abstract ������ �پ�
	//�߻�Ŭ������ 1�� �̻��� �߻�޼��带 ���� Ŭ����(�߻�޼��尡 ���� ��쿡�� �߻�Ŭ������ ���� ����)
	int x, y;
	abstract void move(int x, int y); //������Ÿ�Ը� �ִ� �߻�޼���
	void stop() { //{  }�� ������ �� �ȿ� ������ ��� �Ϲ� �޼���
		//�ƹ� �ϵ� ���ϴ� �޼���
	}
}

class Marine extends Unit { //�Ϲ� Ŭ������ �߻�Ŭ������ ��� ����
	void move(int x, int y) {
		//�߻�޼��带 �Ϲݸ޼���� ���� �� {  }�� ����� �ش�.
		//�����ÿ��� �޼��忡�� abstract�� ����
		System.out.println("Marine[x=" + x + ",y=" + y + "]");
	}
	
	void stimPack() {
		//�ƹ� �ϵ� ���ϴ� �޼���
	}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ",y=" + y + "]");
	}
	
	void changeMode() {
		
	}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("DropShip[x=" + x + ",y=" + y + "]");
	}
	
	void load()	{
		
	}
	
	void unload() {
		
	}
 }

