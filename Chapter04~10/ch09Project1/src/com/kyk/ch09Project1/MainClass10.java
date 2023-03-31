package com.kyk.ch09Project1;

import static java.lang.Math.*; //Math클래스의 모든 static메서드는 Math생략
import static java.lang.System.*; //System클래스의 모든 static메서드는 System생략

//Math클래스는 수학, 과학 관련 처리 클래스로 메서드 모두 static메서드임
public class MainClass10 {

	public static void main(String[] args) {
		double val = 90.7552;
		//import static이 정의되어 클래스 이름 없이 사용
		out.println("round(" + val + ")=" + round(val)); //반올림(소수점 밑에서 반올림)
		val *= 100; //val = val * 100;
		out.println("round(" + val + ")=" + round(val)); //반올림(소수점 밑에서 반올림)
	
		out.println("round(" + val + ")/100 = " + round(val)/100); //반올림, int로 나누므로 90
		out.println("round(" + val + ")/100.0 = " + round(val)/100.0); //반올림, double로 나누므로 더블형
		out.println();
		
		//out.printf("ceil(%3.1f)=%3.1f%n", 1.1, ceil(1.1));
		out.println(ceil(1.1));
		//ceil은 자기보다 큰 정수 중 가장 적은 정수를 소수점 있게 표현
		out.println(floor(1.5));
		//자기보다 적은 정수 중 가장 큰 수를 소수점으로 표시
		out.println(rint(1.5)); //반올림(더블형으로 표시)
		
		out.println(random()); //임의의 더블형 값을 생성, 0부터 1미만
	}

}
