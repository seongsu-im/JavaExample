package programmers;

import java.util.Scanner;

public class NumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수 num이 짝수면 Even num이 홀수면 Odd

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num%2==0) {

			System.out.print("\"Even\"");

		}

		else {

			System.out.print("\"Odd\"");

		}

	}

}

class Solution {
    public String solution(int num) {
                
      if(num%2==0) {

			return("Even");

		}

		else {

			return("Odd");

		}
                
    }
}