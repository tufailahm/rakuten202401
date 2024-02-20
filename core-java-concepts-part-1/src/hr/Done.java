package hr;

public class Done {

	int marks=99;
	{
		System.out.println("1.   111");
		marks++;
	}
	public Done() {
		marks++;
		System.out.println("4.    000");

	}
	{
		System.out.println("2.   3333");

		marks++;
	}
	{
		System.out.println("3.     222");
		marks++;
	}
	public static void main(String[] args) {
		
		Done d = new Done();
	}
}
