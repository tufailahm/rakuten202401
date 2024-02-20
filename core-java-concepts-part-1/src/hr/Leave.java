package hr;

public class Leave {
	
	private int numberOfDays;
	
	public Leave() {
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
	

}
