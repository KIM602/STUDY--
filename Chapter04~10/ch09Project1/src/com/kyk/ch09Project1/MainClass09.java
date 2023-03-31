package com.kyk.ch09Project1;

public class MainClass09 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("01");
		//append(문자열)메서드는 StringBuffer인스턴스 자신에게 붙이기
		StringBuffer sb2 = sb.append(23); //sb는 0123
		sb.append('4').append(56); //chaining sb는 0123456
		
		StringBuffer sb3 = sb.append(78); //sb는 012345678
		sb3.append(9.0); //0123456789.0
		
		//sb2나 sb3는 sb의 주소값을 가지므로 모두 같이 값이 변경된다.
		
		System.out.println("sb =" + sb);
		System.out.println("sb2 = " + sb2);
		System.out.println("sb3 = " + sb3);
		
		System.out.println("sb = " + sb.deleteCharAt(10));
		//sb에서 색인번호  10번의 문자를 삭제
		System.out.println("sb = " + sb.delete(3, 6));
		//색인번호 3번부터 6-1까지 삭제
		System.out.println("sb = " + sb.insert(3, "abc"));
		//색인번호 앞에 문자열 삽입
		System.out.println("sb = " + sb.replace(6, sb.length(), "END"));
		//6번 색인번호부터 문자열의 크기-1까지(마지막 색인번호)까지를 END로 교체
		System.out.println("capacity = " + sb.capacity());
		//용량은 한 문자당 2바이트 차지(9자 * 2) - 유니코드 특성
		System.out.println("length = " + sb.length());
		//문자의 수
	}

}
