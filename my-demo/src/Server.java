
import java.io.*;
import java.net.*;

public class Server {
	public static void main(String sam[]) {
		try {
			ServerSocket ss = new ServerSocket(9999);
			Socket s = ss.accept();
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			pw.println("Welcome to our n/w Mr. client");
			System.out.println(s);
			DataInputStream ds = new DataInputStream(s.getInputStream());
			System.out.println(ds.readLine());
			pw.close();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

