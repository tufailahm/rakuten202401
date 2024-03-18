
import java.net.*;
import java.io.*;

public class Client {
	public static void main(String sam[]) {
		try {
			InetAddress addr = InetAddress.getLocalHost();
			Socket s = new Socket(addr, 9999);
			System.out.println(s.toString());
			BufferedReader br = new BufferedReader(new InputStreamReader(s
					.getInputStream()));
			String str = br.readLine();
			System.out.println(str);
			DataInputStream ds = new DataInputStream(System.in);
			System.out.println("Enter the message to be passed to server");
			String ans = ds.readLine();

			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			pw.println(ans);
			pw.close();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}