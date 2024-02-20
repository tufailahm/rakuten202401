package hr;

public class Leave {
	
	private int numberOfDays;
	private int maxLimit=5;
	{
		numberOfDays=200;
		if(numberOfDays>maxLimit)
			numberOfDays=5;
		System.out.println("3.Hello");
	}
	static
	{
		System.out.println("1.Rakuten");
	}
	public Leave() {
		System.out.println("4. Leave Default constructor");
		numberOfDays = 0;
	}
	public Leave(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	public int getNumberOfDays() {
		return numberOfDays;
	}
	public void approved() {
		System.out.println("Apply leave for days : "+numberOfDays);
	}
	
	public void applyLeave() {
		numberOfDays = 2;
	}
	
	public void applyLeave(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	
	public void applyLeave(int numberOfDays,String reason) {
		this.numberOfDays = numberOfDays;
	}
	
	public void applyLeave(String reason,int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	
	public void sum(int num1,int num2)
	{
		System.out.println(num1+num2);
	}
	
	
	//var args
	public void sum(int num1,int num2,int...numbers)
	{
			int total =0;
			for(int i:numbers)
			{
				total += i;
			}
			System.out.println("2 is mandatory and Total is :"+total);
	}
	
	public static void main(String[] args) {
		System.out.println("2. Main called");
		Leave l1 = new Leave();
		l1.applyLeave(7, "sick");
		
		l1.sum(12,98,88);
		l1.sum(11,11);

		
	}

}
