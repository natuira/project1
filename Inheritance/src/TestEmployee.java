import com.pojo.Employee;
import com.pojo.Person;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeIO eio = new EmployeeIOImpl();
		Employee e = new Employee();
		e=eio.readEmployee();
		eio.writeEmployee(e);
		
		
	//	e.display();

		System.out.println(e);
	}

}
