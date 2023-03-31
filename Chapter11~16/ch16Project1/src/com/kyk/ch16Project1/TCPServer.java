package com.kyk.ch16Project1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TCPServer {

	public static void main(String[] args) {
		//TCP��ſ��� ���� ó���� �ϴ� Ŭ������ ServerSocket�̴�.
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(7777); //port 7777�� ����ϴ� severSocket
			System.out.println(getTime() + "������ �غ�Ǿ����ϴ�.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		while(true) {
			try {
				System.out.println(getTime() + "�����û�� ��ٸ��ϴ�.");
				//���������� Ŭ���̾�Ʈ�� �����û�� �� ������ ������ ���߰� ��� ��ٸ���.
				//Ŭ���̾�Ʈ�� �����û�� ���� Ŭ���̾�Ʈ ���ϰ� ����� ���ο� ������ �����Ѵ�.
				Socket socket = serverSocket.accept(); //������ ����ϴٰ� ������ �Ͼ�� Socket��ü�� �����Ͽ� ��ȯ
				System.out.println(getTime() + socket.getInetAddress() + "�κ��� �����û�� ���Խ��ϴ�.");
				//������ ��½�Ʈ���� ��´�.
				OutputStream out = socket.getOutputStream(); //socket�� ����Ǵ� OutputStream��ü�� ����
				DataOutputStream dos = new DataOutputStream(out); //data�� �⺻��ó�� ó���ϴ� ���� ��Ʈ��
				//���� ����(remote socke)�� �����͸� ������.
				dos.writeUTF("[Notice] Test Message1 from Server."); //UTF ���ڿ��� write�ϴ� �޼���
				//�������α׷������� ��� ��Ʈ���� �ۼ��ϸ� �������� ���۵ȴ�.
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
