package com.kyk.ch05Project1;

public class QuizClass {

	public static void main(String[] args) {
		/*
		 * 1. �̸��� cars�� ���ڿ� �迭�� ����� �ʱⰪ���� volvo, BMW, Ford�� ����
		 * 2. 1�������� cars�迭�� �ι�° ���Ҹ� ���
		 * 3. ���� volvo�� Openl�� �����ϰ� ���
		 * 4. �迭 cars������ ũ�⸦ ���Ͽ� ���
		 * 5. enhanced for��
		 *     for( �迭������ �������� ������ : �迭�����̸�) {
		 *      //�� ���Һ��� �ݺ�
		 *     }
		 *     cars�迭�� ���Ҹ� for���� ����Ͽ� ���
		 *     ��. �⺻ for��
		 *     ��. enhanced for������ ���
		 */
		
		System.out.println("1��.");
		String [] cars = new String[3];
		cars[0] = "volvo";
		cars[1] = "BMW";
		cars[2] = "Ford";
		
		System.out.println("2��");
		System.out.println(cars[1]);
		
		System.out.println("3��");
		String tmp = cars[0];
		cars[0] = "Open1";
		for (int i = 0 ; i < cars.length ; i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println("4��");
		System.out.println(cars.length);
		
		System.out.println("5��");
		System.out.println(" ��.");
		for (int i = 0 ; i <cars.length ; i++)
			System.out.println(cars[i]);
		
		System.out.println(" ��.");
		for (String cars1 : cars) {
			System.out.println(cars1);
		}
	}

}
