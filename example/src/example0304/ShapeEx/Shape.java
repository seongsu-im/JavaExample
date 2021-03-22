package example0304.ShapeEx;

public abstract class  Shape {
	
	String color = "red";
	boolean filled = true;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	

	abstract double getArea();
	
	abstract double getPerimeter();
	@Override
	public String toString() {
		
		System.out.println("Shape[color="+color+", filled="+filled+"]");
		return "" ;
	}
	
	
	
}
