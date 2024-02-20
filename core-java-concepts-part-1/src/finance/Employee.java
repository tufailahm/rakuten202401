package finance;

public class Employee {
		int employeeId=0;
		String employeeName=null;
		int salary=0;
		
		public Employee() {
			employeeId = -999;
			employeeName ="NotAvailable";
			salary = -1;
		}
		public Employee(int employeeId, String employeeName, int salary) {
			this();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.salary = salary;
		}
		public Employee(int employeeId, String employeeName) {
			this();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
		}
		public Employee(String employeeName) {
			this();
			this.employeeName = employeeName;
		}
		public void printEmployeeDetails() {
			System.out.println("Employee id :"+employeeId);
			System.out.println("Employee name :"+employeeName);
			System.out.println("Salary :"+salary);

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
