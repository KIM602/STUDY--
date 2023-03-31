package com.kyk.ch05Project1;

public class MainClass04 {

	public static void main(String[] args) {
		String[] names = {"Kim", "Park", "Yi"}; //String배열 선언과 초기화, 크기가 3인 배열 생성
		for(int i = 0 ; i < names.length; ++i) {
			System.out.println("names[" + i +"]);" + names[i]);
		}
		String tmp = names[2]; //names배열은 String배열이므로 원소는 String이므로 tmp를 String
		System.out.println("tmp:"+tmp);
		//배열의 변경은 배열 원소값을 변경
		names[0] = "Yu";
		for(int i = 0 ; i < names.length ; ++i)	{
			System.out.println("names[" + i + "]:" + names[i]);
		}
		
		String str = "ABCDE"; //char[] str = {'A','B','C','D','E'}
		char ch = str.charAt(3);
		String tmp1 = str.substring(1, 4); //색인번호 1번부터 색인번호 4-1(3)까지 추출
		//substring(int from,int end)는 from색인번호에서 end-1색인번호사이의 문자열을 변환
		//문자열 비교는 str.equals(비교문자열), str.equalsIgnoreCase(문자열)
		System.out.println(tmp1);
	}
}
