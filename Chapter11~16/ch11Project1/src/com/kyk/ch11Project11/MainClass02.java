package com.kyk.ch11Project11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MainClass02 {

	public static void main(String[] args) {
		Stack st = new Stack(); // LIFO ������� ������ ó���ϴ� Ŭ��~~
		Queue q = new LinkedList(); // Queue�� �������̽�, LinkedList�� Queue�� ������, FIFO���
		
		// Stack�� ��ü����  
		st.push("0"); //�������� pop()
		st.push("1"); 
		st.push("2");

		// Queue�� ��ü ����
		q.offer("0"); // �������� poll()
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack = ");
		while(!st.empty()) { // st�� ������� ������ ����
			System.out.println(st.pop()); // ���ÿ��� ��� �ϳ��� ������ ���

		}
		
		System.out.println("= Queue +");
		if(!q.isEmpty()) { // q�� ������� ������
			System.out.println(q.poll()); // q���� ��� �ϳ��� ������ ���(FIFO)
		}
	}

}
