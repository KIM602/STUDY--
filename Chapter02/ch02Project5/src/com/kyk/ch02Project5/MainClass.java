package com.kyk.ch02Project5;

public class MainClass {

	public static void main(String[] args) {
		String url = "www.codechobo.com";
		float f1 = .10f; // 0.10, 1.0e-1
		float f2 = 1e1f; // 10.0, 1.0e1, 1.0e+1
		//e는 지수를 나타내며 10의 몇승을 표시시 사용
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("fi=%f, %e, %g%n", f1, f1, f1);
		//f1값을 %f, %e, %g방식으로 출력함
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		System.out.printf("d=%f%n", d);
		//변수 d값을 %f로 출력
		System.out.printf("d=%14.10f%n", d);
		//변수 d값을 %f형식으로 출력하되 소수점 포함 총자리수 14개에서 소수점은 10자리, 빈자리는 공백
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		//url변수를 문자열로 표시하되 총자리수가 20이며 오른쪽 정렬(+)
		System.out.printf("[%-20s]%n", url); //왼쪽 정렬(-)
		System.out.printf("[%.8s]%n", url); //왼쪽에서 8글자만 출력
	}

}
