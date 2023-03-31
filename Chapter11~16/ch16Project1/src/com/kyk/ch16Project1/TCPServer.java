package com.kyk.ch16Project1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TCPServer {

	public static void main(String[] args) {
		//TCP통신에서 연결 처리를 하는 클래스는 ServerSocket이다.
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(7777); //port 7777을 사용하는 severSocket
			System.out.println(getTime() + "서버가 준비되었습니다.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		while(true) {
			try {
				System.out.println(getTime() + "연결요청을 기다립니다.");
				//서버소켓은 클라이언트의 연결요청이 올 때까지 실행을 멈추고 계속 기다린다.
				//클라이언트의 연결요청이 오면 클라이언트 소켓과 통신할 새로운 소켓을 생성한다.
				Socket socket = serverSocket.accept(); //접속을 대기하다가 접속이 일어나면 Socket객체를 생성하여 반환
				System.out.println(getTime() + socket.getInetAddress() + "로부터 연결요청이 들어왔습니다.");
				//소켓의 출력스트림을 얻는다.
				OutputStream out = socket.getOutputStream(); //socket과 연결되는 OutputStream객체를 생성
				DataOutputStream dos = new DataOutputStream(out); //data를 기본형처럼 처리하는 보조 스트림
				//원격 소켓(remote socke)에 데이터를 보낸다.
				dos.writeUTF("[Notice] Test Message1 from Server."); //UTF 문자열로 write하는 메서드
				//소켓프로그램에서는 출력 스트림에 작성하면 상대방으로 전송된다.
				dos.close();
				socket.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}	
		}
	}
	
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}

}
