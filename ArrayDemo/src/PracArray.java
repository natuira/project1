
public class PracArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = new int[11];
	
		array[0]=12;
		array[1]=34;
		array[2]=44;
		array[3]=54;
		array[4]=34;
		array[5]=55;
		array[6]=65;
		array[7]=78;
		array[8]=90;
		array[9]=23;
		array[10]=90;
		
		int i=0;
		System.out.println("Using while");
		while(i<array.length) {
			System.out.print(array[i]+"\t");
			i++;
		}
		
		
		System.out.println("\nUsing do-while");
		i=0;
		do {
			System.out.print(array[i]+"\t");
			i++;
		}while(i<array.length);
		
		int search = 54; 
		int count=0;
		
		i=0;
		boolean flag=false;
		while(i<array.length) {
		
		
			if(array[i]==search) {
				flag=true;
				count++;
			}
			i++;
		
			
		}
		
		if(flag)
		{
			System.out.println("\nValue Found");
		}
		else {
			System.out.println("\nValue not found");
		}
				
		
	}

}
