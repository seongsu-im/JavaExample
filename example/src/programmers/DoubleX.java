package programmers;

import java.util.Scanner;

public class DoubleX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n = 121;
			
		
			double x = Math.sqrt(n);
			
			
			if(n%x==0) {	
				
				System.out.println((long)Math.pow((x+1), 2));
				
			}
			
			else {
				
				System.out.println("-1");
			}
		}
		
	}


