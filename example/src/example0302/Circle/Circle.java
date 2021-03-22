package example0302.Circle;

public class Circle {
	
	double radius = 1.0;
	String color = "red";
	
	
	public Circle(){
					
	}
	
	public Circle(double r){
		
		this.radius = r;
	}

	public double getRadius() {
		return radius;
	}
		
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		
	return radius*radius*Math.PI;
				
	}
	
	
	public double getCircumference() {
		
		return radius*2*Math.PI;
		
	}

	@Override
	public String toString() {
		
		System.out.printf("Circle[radisu=%.1f]의 둘레는 %.2f,면적은 %.2f\n",radius,getCircumference(),getArea());
		return "";
	}

	
}
