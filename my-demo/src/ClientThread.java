
import java.io.*;
import java.net.*;

public class ClientThread {
	Socket s;

	static final boolean AUTOFLUSH = true;

	static BufferedReader br;

	static PrintWriter ps;

	String str;

	boolean running = true;

	public ClientThread() {
		try {
			InetAddress addr = InetAddress.getLocalHost();
			s = new Socket(addr, 2222);
			//s=new Socket("100.100.0.2",2222);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void conn() {
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			ps = new PrintWriter(s.getOutputStream(), AUTOFLUSH);
		} catch (Exception e) {
		}

		while (running) {
			try {
				str = br.readLine();
				if (str.equals("BYE")) {
					ps.close();
					br.close();
					s.close();
					running = false;
				} else {
					System.out.println(str);
					System.out
							.println("Enter the message to be passed to server.");
					System.out
							.println("Enter 'QUIT' to DISCONNECT FROM SERVER.");
					DataInputStream ds = new DataInputStream(System.in);
					String d = ds.readLine();
					ps.println(d);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String sam[]) {
		ClientThread cc = new ClientThread();
		cc.conn();
	}

}