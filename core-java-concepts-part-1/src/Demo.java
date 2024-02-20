
public class Demo {

}

class Hello
{
	int num=10;
}
class Bye
{
	public void display()
	{
		Hello h = new Hello();
		System.out.println(h.num);

	}
}
class Thanks extends Hello
{
	public void display()
	{
		Hello h = new Hello();
		System.out.println(h.num);
		System.out.println(num);
	}
}