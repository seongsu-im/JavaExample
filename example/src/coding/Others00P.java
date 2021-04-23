package coding;

import java.io.FileWriter;
import java.io.IOException;

public class Others00P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));
		
		
		try {
			FileWriter f1 = new FileWriter("data.txt");
						
			f1.write("hello");
			f1.write(" Java");
			f1.close();
			
			FileWriter f2 = new FileWriter("data2.txt");
			
			f2.write("hello");
			f2.write(" Java2");
			f2.close();
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		}
	
		
	}

}
