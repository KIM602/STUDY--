package com.kyk.ch04Project1;

public class MainClass11 {

	public static void main(String[] args) {
		for(int i = 0 ; i <= 10 ; i++) {
			if(i % 3 == 0) { //3의 배수
				continue; //continue는 여기서 바로 다음 반복으로 반환, 즉 continue 밑의 문장은 실행 안함
			}
			System.out.println(i);
		}
	}

}
