
public class Demo1DObjects {

	
	public static void main(String [] args) {
		Person [] persons;
		persons= new Person[5];
		persons[0]=new Person();
		persons[1]=new Person(12,"A");
		persons[2]=new Person(120,"B");
		persons[3]=new Person(45,"C");
		persons[4]=new Person(18,"D");

		//persons[3].display();
		
		for(Person p : persons) {
			p.display();
		}
		
		
		
	}
}
