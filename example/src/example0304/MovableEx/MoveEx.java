package example0304.MovableEx;

interface Movable{
	void moveUp();
	void moveDown();
	void moveLeft();
	void moveRight();
}

class MovablePoint implements Movable{
	int x, y;
	int xSpeed, ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	@Override
	public void moveUp() {
		y = y-ySpeed;	
	}
	
	@Override
	public void moveDown() {
		y = y+ySpeed; 
	}
	
	@Override
	public void moveLeft() {
		x = x-xSpeed;
	}
	
	@Override
	public void moveRight() {
		x = x+xSpeed;
	}

	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}
	
	
}

class MovableCircle implements Movable{
	private int radius;
	private MovablePoint center;
	
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		this.center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}
	 	
	@Override
	public void moveUp() {
		center.y = center.y-center.ySpeed;
	}
	
	@Override
	public void moveDown() {
		center.y = center.y+center.ySpeed;
	}
	
	@Override
	public void moveLeft() {
		center.x = center.x-center.xSpeed;
	}
	
	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		center.x = center.x+center.xSpeed;
	}
	
	public String toString() {
		return String.format("MovableCircle[x=%d, y=%d, xSpeed=%d, ySpeed=%d],radius=%d]", 
							center.x,center.y,center.xSpeed,center.ySpeed,radius);
	}
}	

public class MoveEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movable m1 = new MovablePoint(5, 6, 10, 15); // upcast
		System.out.println("원래 위치");
		System.out.println(m1);
		m1.moveLeft(); //왼쪽으로 10만큼 이동
		System.out.println("왼쪽으로 10만큼 이동");
		System.out.println(m1);
		System.out.println("========================================================");
		System.out.println("원래 위치");
		Movable m2 = new MovableCircle(1, 2, 3, 4, 20); // upcast
		System.out.println(m2);
		m2.moveRight(); //오른쪽으로 3만큼 이동
		System.out.println("오른쪽으로 3만큼 이동");
		System.out.println(m2);
		
	}

}