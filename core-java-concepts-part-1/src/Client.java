import finance.Employee;
import hr.*;
public class Client {

	int num=10;
	public void display() {
		System.out.println("Display called");
		System.out.println("Num is : "+num);
	}
	public static void main(String[] args) {
		
		Employee ramesh = new Employee(101, "Ramesh",98000);
		ramesh.printEmployeeDetails();
		Employee neha = new Employee();
		neha.printEmployeeDetails();
		Employee richard = new Employee("Richard");
		richard.printEmployeeDetails();
		Employee william = new Employee(111,"William");
		william.printEmployeeDetails();

		
		
		
		
		
		
		
		
		
		
		
		

	}

}
