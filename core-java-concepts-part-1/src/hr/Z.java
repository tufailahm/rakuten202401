package hr;

class W {
	static {
		System.out.println("3.######static block of W class");
	}
	public W() {
		System.out.println("4. W constructor");
	}
}

public class Z {
	W w = new W();
	{
		System.out.println("5. instance block of Z class");
	}
	static {
		System.out.println("1. static block of Z class");
	}

	public Z() {
		System.out.println("6. Z constructor");
	}

	public static void main(String st[]) {
		System.out.println("2. In main");
		new Z();
		new Z();
	}
}
