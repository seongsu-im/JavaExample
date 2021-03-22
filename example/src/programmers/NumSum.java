package programmers;

import java.util.Scanner;

public class NumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		int n = scan.nextInt();
		
		for(int i = 1; i<=n; i++) {
			
			
			if(n%i==0) {
				
				sum += i;
				
			}
		}
		
		System.out.print(sum);

	}

}
