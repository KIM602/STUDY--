package com.kyk.ch11Project11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MainClass02 {

	public static void main(String[] args) {
		Stack st = new Stack(); // LIFO 방식으로 데이터 처리하는 클라스~~
		Queue q = new LinkedList(); // Queue는 인터페이스, LinkedList는 Queue를 구현함, FIFO방식
		
		// Stack에 객체저장  
		st.push("0"); //꺼낼때는 pop()
		st.push("1"); 
		st.push("2");

		// Queue에 객체 저장
		q.offer("0"); // 꺼낼때는 poll()
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack = ");
		while(!st.empty()) { // st가 비어있지 않을때 실행
			System.out.println(st.pop()); // 스택에서 요소 하나를 꺼내서 출력

		}
		
		System.out.println("= Queue +");
		if(!q.isEmpty()) { // q가 비어있지 않을때
			System.out.println(q.poll()); // q에서 요소 하나를 꺼내서 출력(FIFO)
		}
	}

}
