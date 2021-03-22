package example0304.ShapeEx;

public class Square extends Rectangle{

	double side;
	
	public Square(){

	}

	public Square(double side){
		
		this.side = side;
	}
	
	
	public Square(double side, String color, boolean filled){

		this.color = color;
		this.filled = filled;
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getWidth() {
		return width;
		
	}
	
//	public double setWidth(double side) {
//		
//		return side;
//	}
//		
		
	@Override
	public String toString() {
		
		System.out.println("Square[Rectangle[[Shape[color="+color+", filld="+filled+"], width="+width+"length="+length+"]");
		
		return "" ;
	}
	
	
}
