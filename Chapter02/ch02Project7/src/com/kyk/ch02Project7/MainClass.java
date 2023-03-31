package com.kyk.ch02Project7;

public class MainClass {

	public static void main(String[] args) {
		
		short sMin = -32768, sMax = 32767;
		//short형은 2바이트(16비트)이므로 표시 가능한 값이 2의 16승개 (65536개)
		//음과 양으로 절반씩 사용, 단 중앙에 0이 있어 양에서는 -1한다.
		char cMin = 0, cMax = 65535;
		//char형은 문자로도 나타내고 문자별 코드번호 숫자로도 나타냄, char는 -가 없음
		System.out.println("sMin = " + sMin);
		System.out.println("sMin-1= " + (short)(sMin-1));
		//최소값에서 -하면 최대값으로 나옴
		System.out.println("sMax = " + sMax);
		System.out.println("sMax+1= " + (short)(sMax+1));
		//최대값이 1을 더하면 최소값으로 나오는데 이렇게 하기 위해 형번환 처리
		System.out.println("cMin = " + (int)cMin);
		//char을 int형으로 형변환시 int형변환. 숫자로 나오게 함.
		System.out.println("cMin-1= " + (int)--cMin);
		//--는 결합연산자로 1을 감소시키는 연산자
		//최대값으로 나옴]
		System.out.println("cMax = " + (int)cMax);
		System.out.println("cMax+1= " + (int)++cMax);
		//++는 연산자로 1을 더하는 연산자
		//최소값으로 나옴
		
		System.out.println((char)65); //더 큰 int형 65를 적은 char로 형변환
		System.out.println((int)1.5f); //더 큰 float형을 int형으로 형변환
		
	}

}
