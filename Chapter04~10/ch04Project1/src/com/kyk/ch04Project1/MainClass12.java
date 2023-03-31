package com.kyk.ch04Project1;

public class MainClass12 {

	public static void main(String[] args) {
		//라벨은 for문 앞에 '이름 :' 으로 붙인다.
		Loop1 : for(int i = 2 ; i <= 9 ; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				if(j == 5) {
					break Loop1; //라벨명 Loop1의 for문을 중단
					//break;는 내부 for문만 중단
					//continue Loop1; //Loop1의 다음 반복 단계 
					//continue;는 자신의 내부 반복문의 continue
				}
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println();
		}
		
	}

}
