
public class Employee {

	private int empId;
	private double salary;
	private String empName;
	private String companyName;
	
	public Employee() {
		
		empId=10;
		salary=10000;
		empName="aaa";
		companyName="citi ltd";
	}

	public Employee(int empId, double salary, String empName) {
		this();
		this.empId = empId;
		this.salary = salary;
		this.empName = empName;
	}
	
	public void display() {
		
		System.out.println("EmpId: "+empId+"\tEmpName: "+empName+"\tSalary: "+salary+"\tCompanyName: "+companyName+"\n");
	}
	
	
	
}
