import java.io.BufferedReader;

public class DemoID {
//declare an array
//dataType [] name_of_array;
//name of reference to an array
//variable name but not name of an object
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers;
		numbers = new int[5];
		
		numbers[0]=1;
		numbers[1]=2;
		numbers[2]=1;
		numbers[3]=3;
		numbers[4]=4;

		System.out.println("Num: "+numbers[0]);
	
		for(int i=0;i<numbers.length;i++) {
			System.out.println("numbers["+i+"] : "+numbers[i]);
		}
		
		
		//only sequential
		//preferred
		for(int x: numbers) {
			System.out.println(x);
		}
		
	}
	
	public static int add(int []numbers) {
		
		return(numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]);
		
	}
}