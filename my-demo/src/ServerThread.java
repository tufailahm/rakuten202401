
import java.util.*;
import java.net.*;
import java.io.*;

class ServerThread {
	ServerSocket ss = null;

	DataInputStream ds;

	boolean keeprunning = true;

	public static void main(String sam[]) {
		ServerThread ser = new ServerThread();
		ser.correspond1();
	}

	public ServerThread() {
		try {
			System.out.println("Starting up the server");
			ss = new ServerSocket(2222);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void correspond1() {
		System.out.println("Waiting for the clients to communicate");
		Socket soc = null;
		try {
			while (keeprunning) {
				soc = ss.accept();
				communic1 comn = new communic1(soc);
				Thread thr = new Thread(comn);
				System.out.println("A client is contacting me");
				thr.start();
			}
			ss.close();
			soc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void stop() {
		if (keeprunning) {
			keeprunning = false;
		}
	}
}

// new class

class communic1 implements Runnable {
	static public Socket ms = null;

	static private PrintWriter pw = null;

	static private BufferedReader bfr = null;

	Date dd = new Date();

	static boolean running = true;

	static String answer = null;

	public communic1(Socket so) {
		ms = so;
		System.out.println(ms);
	}

	public void run() {
		try {
			System.out.println(dd);
			bfr = new BufferedReader(new InputStreamReader(ms.getInputStream()));
			pw = new PrintWriter(ms.getOutputStream(), true);
			pw.println("+hello" + dd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		communic1.mess();
	}

	public static void mess() {
		try {

			while (running) {
				String clientquery = bfr.readLine();
				if (clientquery.toUpperCase().equals("QUIT")) {
					pw.println("BYE");
					pw.close();
					bfr.close();
					ms.close();
					running = false;
					break;
				} else {
					System.out.println(clientquery);
					System.out.println("enter the reply to client");
					DataInputStream dis = new DataInputStream(System.in);
					answer = dis.readLine();
					pw.println(answer);

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}