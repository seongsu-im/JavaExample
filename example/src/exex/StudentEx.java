package exex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		HashMap<String,Student> map = new HashMap<String,Student>();
		
	
		System.out.println("이름, 아이디, 전화번호 순으로 입력하시오.");
		
		for(int i=0; i<4; i++) {
			
			String kname = scan.next();
			map.put(kname,new Student(kname,scan.nextInt(),scan.next()));
			
		}
			
		System.out.printf("등록된 학생의 수 : %d",map.size());
		
		for(Map.Entry<String,Student> entry : map.entrySet()) {
			
			System.out.println(entry.getValue());
			
		}
		
	}

}
