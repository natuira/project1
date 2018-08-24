import java.util.Arrays;
import java.util.Scanner;

import com.pojo.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter RollNo: ");
		int r = sc.nextInt();
		
		System.out.println("Enter Name: ");
		String n = sc.next();
		
		System.out.println("Enter Marks for 3 subjects: ");
		int [] m = new int[3];
	Arrays.fill(m, 0);
		for(int i=0;i<3;i++) {
			m[i]=sc.nextInt();
		}
		
		s1.setRollNo(r);
		s1.setName(n);
		s1.setMarks(m);
		
		s1.display();
	}

}
