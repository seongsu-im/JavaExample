package example0304.ShapeEx;

public class Circle extends Shape {

	
	double radius = 1.0;
	
	public Circle() {
		
	}

	public Circle(String color, boolean filled) {
		this.color=color;
		this.filled=filled;
	}
	
	public Circle(String color, boolean filled, double radius) {
		this.color=color;
		this.filled=filled;
		this.radius=radius;
	}
	
	

	@Override
	double getArea() {  
		
		return radius*radius*Math.PI;
	}

	@Override
	double getPerimeter() {  
	
		return radius*2*Math.PI;
	
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		
		return  "Circle[Shape[color="+color+", filld="+filled+"], radius="+radius+"]";
	}

	
	
	
}
