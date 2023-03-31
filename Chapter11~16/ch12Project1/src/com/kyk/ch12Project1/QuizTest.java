package com.kyk.ch12Project1;

import java.util.HashMap;

public class QuizTest {

	public static void main(String[] args) {
		//1��
		HashMap <String, Integer> map = new HashMap<String, Integer>();
		//���׸��� Ÿ���Ķ���ʹ� �������̾�� �Ѵ�.
		
		System.out.println("//2��//");
		Product1<String> abc = new Product1<String>();
		//�ν��Ͻ��� �����ϰ� �����ÿ� ���� ������ ������Ÿ���� ���
		
		System.out.println("//3��//");
		Level myVar;
		myVar=Level.MEDIUM;
		System.out.println(myVar);
		
		System.out.println("//4��//"); //values()�� �ش� enum�� ���Ҹ� ��ȯ�ϴµ� ���ҵ��� enum��
		Level[] lv = Level.values();
			for(Level i : lv) {
				System.out.println(i);
			}
		
		System.out.println("//5��//");
		switch(myVar) {
		case LOW: //case�������� level�� ������ ����� ���
			System.out.println("LOW");
			break;
		case MEDIUM:
			System.out.println("MEDIUM");
			break;
		case HIGH:
			System.out.println("HIGH");
			break;
		}
	}
	
	enum Level{
		LOW
		,MEDIUM
		,HIGH
	}

}

class Product1<T> { //���׸� Ŭ������ ���� �� Ÿ�� ������ T,E,K,V ...�� ����Ͽ� ����
	T p;
	T example (T t) {
		T ret = t;
		return ret;
	}
}


/*
 * 1. Ÿ���Ķ���Ͱ� String�� Integer�� map��ü�� ����
 * 2. ���׸�Ŭ���� Product�� ����
 * 		- Ÿ���Ķ���͸� �̿��Ͽ� ������� p�� ����
 * 		- Ÿ���Ķ���͸� �̿��Ͽ� ����Ÿ�԰� �Ķ���Ϳ� Ÿ���Ķ���Ͱ� ����� �޼��带 ����
 * 			(  ) example(() t) {
 *				() ret = t
 *				return ret; 
 * 			}
 * 		- main�޼��忡�� Product��ü�� StringŸ���Ķ���͸� �̿��Ͽ� ����
 * 3. QuizTestŬ���� �ȿ� enum Level1�� ����� ����� LOW, MEDIUM, HIGH�� ����
 * 	   Level�ν��Ͻ� myVar�� �����ϰ� ���� MEDIUM�� ��
 * 	   myVar���� ���
 * 4. enum Level�� ������� for���� �̿��Ͽ� ���
 * 5. Level enum�� switch�� ����
 */