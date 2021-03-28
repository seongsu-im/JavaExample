package exex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class PointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Point> point = new ArrayList<Point>();
		
		point.add(new Point(2,3));
		point.add(new Point(3,4));
		point.add(new Point(1,-6));
		point.add(new Point(1,-6));
		
		HashSet<Point> setpoint = new HashSet<Point>(point);
		
		setpoint.add(new Point(2,4));
		Iterator<Point> it = setpoint.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
		
		/*for(int i=0; i<point.size(); i++) {
		System.out.println(point.get(i));
		}
		
		*/
	}

}
