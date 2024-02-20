public class Client {

	int num;
	num=10;
	public void display() {
		System.out.println("Display called");
		System.out.println("Num is : "+num);
	}
	public static void main(String[] args) {
		System.out.println("Hi all");
		Client client = new Client();
		client.display();

	}

}
