package programmers;

import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sum = 0;

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();

		if(b>a) {

			for(int i=a; i<=b; i++) {


				sum += i;

			}

		}

		else {

			for(int i=b; i<=a; i++) {

				sum += i;

			}

		}
		System.out.println(sum);
	}

}


