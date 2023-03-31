package com.kyk.ch16Project1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UDPServer {

	public static void main(String[] args) {
		try {
			new UDPServer().start();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void start() throws IOException {
		DatagramSocket socket = new DatagramSocket(777); //예외처리가필요한 생성자
		DatagramPacket inPacket, outPacket; //송,수신용 패킷(데이터를 수용하는 패킷)
		
		byte[] inMsg = new byte[10];
		byte[] outMsg;
		
		while(true) {
			//데이터를 수신하기 위한 패킷을 생성한다.
			inPacket = new DatagramPacket(inMsg, inMsg.length); //수신한 데이터를 두번째 파라메터로 정한 크기의 배열에 저장하는 수신 패킷을 생성
			socket.receive(inPacket); //패킷을 통해 데이터를 수신(receive)한다.
			//수신한 패킷으로부터 client의 IP주소와 Port를 얻는다.
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();
			
			//서버의 현재 시간을 시분초 형태([hh:mm:ss])로 반환한다.
			SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
			String time = sdf.format(new Date());
			outMsg = time.getBytes(); //time을 byte배열로 변환한다.
			
			//패킷을 생성해서 client에게 전송(send)한다.
			outPacket = new DatagramPacket(outMsg, outMsg.length, address, port); //address와 port가 있는 생성자는 송신용 패킷 객체
			socket.send(outPacket); //송신패킷을 address와 port로 보낸다.
		}
	}

}
