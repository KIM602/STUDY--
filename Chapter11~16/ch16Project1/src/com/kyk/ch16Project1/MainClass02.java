package com.kyk.ch16Project1;

import java.net.URL;

public class MainClass02 {

	public static void main(String[] args) throws Exception{
		URL url = new URL("https://www.codechobo.com:8443/sample/" + "hello.html?referer=codechobo#index1");
		
		System.out.println("url.getAuthority() : " + url.getAuthority());
		//URL의 Authority부분을 반환 www.codechobo.com:80(호스트명과 포트번호)
		//System.out.println("url.getAuthority() : " + url.getContent());
		//URL의 content부분을 반환
		System.out.println("url.getDefaultPort() : " + url.getDefaultPort()); //http는 80, https는 443
		System.out.println("url.getPort() : " + url.getPort());
		System.out.println("url.getFile() : " + url.getFile()); //경로부터 쿼리까지
		System.out.println("url.getHost() : " + url.getHost()); //port제외
		System.out.println("url.getPath() : " + url.getPath()); //경로부터 파일까지
		System.out.println("url.getProtocol() : " + url.getProtocol());
		System.out.println("url.getQuery() : " + url.getQuery()); //?뒤의 쿼리문 #으로 된 참조는 제외
		System.out.println("url.getRef() : " + url.getRef()); //#이름
		System.out.println("url.getUserInfo() : " + url.getUserInfo());
		System.out.println("url.toExternalForm() : " + url.toExternalForm()); //URL객체를 문자열로 반환
		System.out.println("url.toURI() : " + url.toURI()); //URL을 URI로 변환
		//URI는 Uniform Resource Identifier의 약어로 URL을 포함하고 있다.
		//URL은 위치를 나타낼 뿐이지만 URI는 위치뿐만 아니라 식별 부호로서의 기능도 가진다.
	}

}
