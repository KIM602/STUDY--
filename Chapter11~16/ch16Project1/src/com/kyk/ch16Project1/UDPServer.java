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
		DatagramSocket socket = new DatagramSocket(777); //����ó�����ʿ��� ������
		DatagramPacket inPacket, outPacket; //��,���ſ� ��Ŷ(�����͸� �����ϴ� ��Ŷ)
		
		byte[] inMsg = new byte[10];
		byte[] outMsg;
		
		while(true) {
			//�����͸� �����ϱ� ���� ��Ŷ�� �����Ѵ�.
			inPacket = new DatagramPacket(inMsg, inMsg.length); //������ �����͸� �ι�° �Ķ���ͷ� ���� ũ���� �迭�� �����ϴ� ���� ��Ŷ�� ����
			socket.receive(inPacket); //��Ŷ�� ���� �����͸� ����(receive)�Ѵ�.
			//������ ��Ŷ���κ��� client�� IP�ּҿ� Port�� ��´�.
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();
			
			//������ ���� �ð��� �ú��� ����([hh:mm:ss])�� ��ȯ�Ѵ�.
			SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
			String time = sdf.format(new Date());
			outMsg = time.getBytes(); //time�� byte�迭�� ��ȯ�Ѵ�.
			
			//��Ŷ�� �����ؼ� client���� ����(send)�Ѵ�.
			outPacket = new DatagramPacket(outMsg, outMsg.length, address, port); //address�� port�� �ִ� �����ڴ� �۽ſ� ��Ŷ ��ü
			socket.send(outPacket); //�۽���Ŷ�� address�� port�� ������.
		}
	}

}
