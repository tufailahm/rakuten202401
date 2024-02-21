package com.bms.raukten.client;

public class Snippet {
	
	public static void main(String[] args) {
		
		System.out.println("Hi");
		String marks = "nine";
		System.out.println(marks+5);	//985
		
		int temp = 0;
		try {
			
			if(marks.equals("nine"))
				throw new ArrayIndexOutOfBoundsException();
			int numbers[] = new int[-10];
			int i=1/0;		//ArithmeticException
			temp = Integer.parseInt(marks);
		} 
		catch (NumberFormatException e)
		{
			System.out.println("Cannot convert alphabets to numbers");
		}
		catch (ArithmeticException e)
		{
			System.out.println("Cannot divide by zero");
		}
		catch (RuntimeException e)
		{
			System.out.println("Runtime exception happened "+e);
		}
		catch(Exception e)
		{
			System.out.println("Runtime exception happened "+e);
		}
		catch(Throwable e)
		{
			System.out.println("Throwable exception happened "+e);
		}
		finally {
			//closing operations
			System.out.println("##FINALLY CALLED");
			temp=0;
		}
		
		System.out.println(temp+5);
		
		System.out.println("Thanks");
	}
	
}

