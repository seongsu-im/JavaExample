package exex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> map = new HashMap<String, String>();
		
		Scanner scan = new Scanner(System.in);
		
		map.put("love","사랑");
		map.put("apple","사과");
		map.put("baby","아기");
		
		
	
		while(true) {
			
			System.out.println("찾고 싶은 단어는?");
			System.out.println(map.get(scan.next()));
		}
		
		
		
	}

}
