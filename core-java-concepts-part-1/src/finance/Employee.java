package finance;

public class Employee {
		private int employeeId=0;
		private String employeeName=null;
		private int salary=0;
		
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
		
		
		
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public int getEmployeeId() {
			return employeeId;
		}
	
		
}
