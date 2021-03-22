package example0302.Rectangle;

public class Rectangle {

	
	private double length = 1.0;
	private double width = 1.0;
	
	public Rectangle() {
		super();
	}

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
			//getArea 면적 - 정사각형 면적 구하는법 가로*세로
	public double getArea() {
		
		return length*width;
		
	}
			//둘레
	public double getPerimeter() {
		
		
		return (2*length)+(2*width);
	}

	@Override
	public String toString() {
	
		return String.format("Rectangle[length = %.1f, width= %.1f]의 둘레는 %.1f, 면적은 %.1f",length,width,getPerimeter(),getArea()); 
		
	}
	
	
	
}
