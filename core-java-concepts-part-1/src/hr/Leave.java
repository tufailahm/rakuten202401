package hr;

import java.util.Scanner;

public class Leave {
	
	int numberOfDays;
	
	public Leave() {
		
	}
	public Leave(int i) {
		
	}

	public void applyLeave() {
		System.out.println("Apply leave called");
	}
	
	public static void main(String[] args) {
		
		Leave l1 = new Leave();
		Leave l2 = new Leave(5);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of days leave :  ");
		int noOfDays = sc.nextInt();
		
		System.out.println("You applied for : "+noOfDays+ " leave");
		
		
	}
	
	
}
