import com.pojo.Circle;
import com.pojo.Rectangle;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c = new Circle(7);
		Rectangle r = new Rectangle(4,6);
		
		c.setName("Circle");
		c.calcArea();
		c.calcPerimeter();
		
		r.setName("Rectangle");
		r.calcArea();
		r.calcPerimeter();
		
		System.out.println(c);
		System.out.println(r);
		
	}

}
