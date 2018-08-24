import java.util.Scanner;

import com.pojo.Employee;

public class EmployeeIOImpl implements EmployeeIO {

	@Override
	public Employee readEmployee() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		System.out.println("Enter name");
		e.setName(sc.next());
		
		System.out.println("Enter Age: ");
		e.setAge(sc.nextInt());
		
		System.out.println("Enter EmpId: ");
		e.setEmpId(sc.nextInt());
		
		System.out.println("Enter Salary: ");
		e.setEmpSalary(sc.nextDouble());
		
		
		
		return e;
	}

	@Override
	public void writeEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		//System.out.println(employee);
		

	}

}
