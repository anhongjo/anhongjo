package hello;

import java.io.*;
import java.net.*;

public class EchoServer {
	int port;
	ServerSocket server;
	
	public EchoServer(int port) throws IOException{
		this.port = port;
		server = new ServerSocket(port);
	}
	public void service() throws IOException
	{
		System.out.println("EchoServer is ready.");
		Socket client = server.accept();
		BufferedReader in = new BufferedReader(
				new InputStreamReader(client.getInputStream()));
		PrintWriter out = new PrintWriter(
				new OutputStreamWriter(client.getOutputStream()));
		while(true) {
			String msg = in.readLine();
			System.out.println(msg);
			if(msg.equals("bye")) {
				break;
			}
			out.println(">>" + msg);
			out.flush();
		}
		
	}
	 public void close() throws IOException{
	        server.close();
	    }
	    public static void main(String args[]) {
	        try {
	            EchoServer es = new EchoServer(1289);
	            es.service();
	            es.close();
	        }catch(Exception e) {
	            System.out.println(e);
	        }
	    }
	}