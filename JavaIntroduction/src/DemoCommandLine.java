public class DemoCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Number of arguments: "+args.length);
		int sum = 0;
		for(String s: args) 
		{
			sum=sum+Integer.parseInt(s);
			System.out.println(s); 
			
		}
		System.out.println("Sum: "+sum);
		

	}

}