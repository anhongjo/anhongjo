package hello;

public class WebClient {
	public static void main(String args[])
	throws Exception {
		String host = "www.chosun.com";
		Socket socket = new Socket(host, 80);
			BufferedReader in = new BufferedReader{
				new InputStreamReader)socket.getInputStream()));
				PrintSteram out = new PrintStream(socket.getOutputStream());
				
				out.println("GET / HTTP/ 1.0");
				out.println();
				out.println();
				String data = null;
				
				while((data = in.readLine()) != null) {
					System.out.println(data);
				}
				socket.close();
			}
	}
}
