
public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date1 = new Date();
		Date date2 = new Date(01,10,1996);
		
		System.out.println("Default date: \t");
		date1.display();
		date1.setDay(20);
		date1.setMonth(05);
		
		System.out.println("\nChanged date: \t");
		date1.display();
		
		System.out.println("\nDate2 Paarmeterized: \t");
		date2.display();
		
		}

}
