

public class Person {

	private int age;
	private String name;

	public Person()
	{
		age=10;
		name="Ira";
	}
	
	public Person(int age, String name) {
		this.age=age;
		this.name=name;
	}

	public void display() {
		System.out.println("Name: "+name+"\tAge: "+age+"\n");
	}
	
	public void setValues() {
		
		age=21;
		name="Ira";
	}
	
	public void setValues(int a, String n) {
		
		age=a;
		name=n;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
