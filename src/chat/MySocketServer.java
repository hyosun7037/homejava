package chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class MySocketServer {

	Vector<NewSocketThread> vt;
	ServerSocket serverSocket;
	
	public MySocketServer() throws Exception{
		vt = new Vector<>();
		serverSocket = new ServerSocket(3000);
		
		while(true) {
			Socket socket = serverSocket.accept();
			System.out.println("요청이 들어옴");
			NewSocketThread nt = new NewSocketThread(socket);
			Thread newWorker = new Thread(nt);
			newWorker.start();
			vt.add(nt);
		}
	}
	
	class NewSocketThread implements Runnable{
		Socket socket;
		BufferedReader br;
		BufferedWriter bw;
		
		public NewSocketThread(Socket socket) {
			this.socket = socket;
		}
		@Override
		public void run() {
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				
				String msg = "";
				
				while((msg = br.readLine()) != null) {
					System.out.println("클라이언트 : " +msg);
					for(NewSocketThread newSocketThread : vt) {
						if(newSocketThread != this) {
							newSocketThread.bw.write(msg+"\n");
							newSocketThread.bw.flush();
						}
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
	
	public static void main(String[] args) {

		try {
			new MySocketServer();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
