import com.myabstract.Cirlce;
import com.myabstract.Shape;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s = new Cirlce(4,"Circle");
		double a = s.area();
		
		System.out.println("Area: "+a);
		s.description();
		
	}

}