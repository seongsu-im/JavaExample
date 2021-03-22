package example0304.ShapeEx;

public class ShapeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Circle circle = new Circle("red",false,5.5);
		
		System.out.println(circle.toString()+"의 면적은,"+ circle.getArea()+", 둘레는"+circle.getPerimeter());
		System.out.println(circle.toString()+"의 면적은,"+ circle.getArea()+", 둘레는"+circle.getPerimeter());
		System.out.println(circle.toString()+"의 반지름은 "+ circle.getRadius());
		
		
	}

}
