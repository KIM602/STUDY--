package com.kyk.ch05Project1;

public class MainClass03 {

	public static void main(String[] args) {
		int[] ball = new int[45]; //45개의 원소를 갖는 배열 (로또가 45개를 사용)
		
		//배열의 각 요소에 1~45의 값을 저장한다
		for(int i=0; i < ball.length; i++) {
			//로또에 사용되는 수 1~45를 배열에 순서대로 저장
			ball[i] = i + 1;
		}
			
		int tmp = 0; //값 교환시 사용하는 임시 변수
		int j = 0; //ball배열의 원소 색인번호를 임의로 추출하여 저장하는 변수
		
		//앞의 6개 원소만 임의로 추출된 원소값으로 교환
		for(int i = 0; i < 6; i++) {
				j = (int)(Math.random() * 45); //0부터 44까지 정수가 얻어짐
				//j를 추출할 ball의 색인번호
				tmp = ball[i];
				ball[i] = ball[j];
				ball[j] = tmp;
		}
		
		//로또 번호 출력은 앞에서 6개만 출력.
		for(int i = 0 ; i < 6 ; i++ ) {
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		}
	}

}
