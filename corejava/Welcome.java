class Hi
{
	public void display()
	{
		System.out.println("Display");
	}
	public static void main(String[] args)
	{
		System.out.println("Hi and welcome");
		Hi h = new Hi();
		h.display();
		Employee e = new Employee();
		e.allocateProject();
	}
}
class Customer
{
	public static void main(String[] args)
	{
		System.out.println("Customer main called");
	}	
}
public class Welcome
{

}