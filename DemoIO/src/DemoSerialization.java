import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.pojo.Student;

public class DemoSerialization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Student []s1 = new Student[2];
		Student s2 = new Student();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<2;i++) {
			s1[i]=new Student();
			System.out.println("Student "+(i+1)+" information: ");
			System.out.println("Enter RollNo: ");
			s1[i].setRollNo(sc.nextInt());
			
			System.out.println("Enter name: ");
			s1[i].setName(sc.next());
			
			System.out.println("Enter Total: ");
			s1[i].setTotal(sc.nextInt());
			String str;
			
				
		}
		
		
		
			FileOutputStream fo = new FileOutputStream("student1.txt",true);
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(s1);
			//ObjectOutputStream oo1 = new ObjectOutputStream(fo);

			//oo1.writeObject(s2);
			
		InputStream obj = new FileInputStream("");
	

			
			try {
				oo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//	oo1.close();
			fo.close();
			
			System.out.println("Operation completed");
			
			
			
			FileInputStream fi = null;
			try {
				fi = new FileInputStream("student1.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				ObjectInputStream oi = new ObjectInputStream(fi);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		/*	Object obj= oi.readObject();
			Student s11 = (Student)obj;
			System.out.println(s11);
			Student s21 = (Student)obj;
			System.out.println(s21);*/
		
		
		
	}

}