package finance;

public class ThisKeywordDemo {

	int num=100;
	int sum;
	public void display() {
		int num=300;	//local variable
		int temp;
		if(true)
			temp = 0;
	
		System.out.println(num);		//300
		System.out.println(this.num);	//100
		System.out.println(temp);   //temp	//
		System.out.println(sum);   //sum
	}
	
	public static void main(String[] args) {
		ThisKeywordDemo d = new ThisKeywordDemo();
		d.display();
	}
}
