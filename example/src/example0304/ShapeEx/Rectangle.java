package example0304.ShapeEx;

public class Rectangle extends Shape {

	
	double width = 1.0;
	double length = 1.0;
	
	public Rectangle() {
		
	}
	
	
	public Rectangle(String color, boolean filled) {
		
		this.color = color;
		this.filled = filled;
	}
	
	public Rectangle(String color, boolean filled, double width, double length) {
		
		this.color = color;
		this.filled = filled;
		this.width = width;
		this.length = length;
	}
	
	
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public String toString() {
		
		System.out.println("Rectangle[Shape[color="+color+", filld="+filled+"], width="+width+"length="+length+"]");
		
		return "" ;
	}
	
}
