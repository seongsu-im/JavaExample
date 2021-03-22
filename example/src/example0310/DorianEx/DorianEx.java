package example0310.DorianEx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DorianEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file1 = "C:\\\\Programs\\\\dorian.txt";
		File src = new File(file1);
		FileReader fr = null;
		BufferedReader in = null;
		String str = "";
		String[] sArray = {};
		Map<String, Integer> m = new HashMap <String, Integer>();

		try {
			fr = new FileReader(src);
			in = new BufferedReader(fr);
			

			while(((str = in.readLine()) != null)) {

				sArray = str.split(" |,|\\.|'");
				
				//
				for(String a : sArray) {
					Integer freq = m.get(a.toLowerCase());
					m.put(a.toLowerCase(),  (freq == null) ? 1 : freq + 1);

				}
			}
			
			
			boolean tf = true;

			while(tf) {
				Scanner scan = new Scanner(System.in);
				System.out.printf("찾고 싶은 단어 ? ");
				String word = scan.next().toLowerCase();
				
				if( (m.get(word)) == null) {
					System.out.println("찾는 값이 없습니다.");
				}else {
					System.out.println(m.get(word) + "번 사용됨.");
				}

				
			}

			in.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}