package exex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneEx {

	public static void main(String[] args) throws IOException {


		HashMap<String,Phone> map = new HashMap<String, Phone>();
		Scanner scan = new Scanner(System.in);
		File file = new File("d:/temp/contact.txt");
		
		String line = "";
		
		BufferedReader bufferRe = new BufferedReader(new FileReader(file));
		while((line = bufferRe.readLine())!=null) {
			
			String[] array = line.split(" ");
			//이름 전화번호 주소 형식으로 들어감
			 String name = array[0];
			 String phoneNo = array[1];
			 String address = array[2];
		
			map.put(name, new Phone(name,phoneNo,address));
						
		}
	
		
		bufferRe.close();


		while(true) {

			System.out.println("======================================================================================");
			System.out.println("1.전화번호 추가 2.전화번호 조회 3.전화번호 삭제 4.전화번호 목록 5.연락처파일로 저장 6.프로그램 종료");
			System.out.println("======================================================================================");
			System.out.print("메뉴를 선택하세요>> ");
			int menu = scan.nextInt();

			if(menu == 1) {
				// 키,벨류에 공통으로 들어가는 이름이 있어서 name 변수 선언
				System.out.println("이름,전화번호,주소 순으로 입력하세요");
				String name = scan.next();
				map.put(name, new Phone(name,scan.next(),scan.next()));

			}

			else if(menu == 2) {
				// 이름으로 조회를 할 시 조회할 회원의 이름(키값)이 나오면 
				// 1번에서 입력했던 벨류(이름,전화번호,주소) 가 나와야됨
				// 조회할 키값이 없다면 존재하지 않는 회원입니다 출력

				System.out.print("조회할 회원의 이름을 입력하세요>>");
				String name = scan.next();

				// for문 안에서 존재 하지않는 회원입니다 넣을 시 중첩으로 나와서 for문 밖으로 뺴야됨
				// for문 밖으로 뺄 경우 if를 생성을 해야하는데 boolean 값이 false 일경우 존재하지 않는 회원입니다.
				// boolean 값이 true 이면 정상 메세지 출력
				// existYn은 참,거짓 구분을 하기 위해 변수 선언
				boolean existYn = false;
				for(Map.Entry<String, Phone> entry : map.entrySet()) {

					if(name.equals(entry.getKey())) {

						System.out.println(entry.getValue().toString());
						
						existYn = true;
					}

				}

				// 조회시 잘 나오지만 존재하지 않는 회원입니다라고 컬렉션에 나오는 문제 발생 
				// 존재하지 않는 회원입니다 부분을 공란으로 바꿔야 하는 작업 필요
				if(existYn == false) {
					System.out.println("존재하지 않는 회원입니다");
				}


			}

			else if(menu == 3) {

				//이름(키) 검색 시 동일 인물이 있다면 삭제 삭제를 하면 해당멤버를 삭제하였습니다. 

				System.out.print("삭제 회원의 이름을 입력하세요>> ");
				String name = scan.next();

				boolean existYn = false;
				for(Map.Entry<String, Phone> entry : map.entrySet()) {

					if(name.equals(entry.getKey())) {

						map.remove(name);
						System.out.println("해당멤버를 삭제하였습니다");
						existYn=true;
					}
				}


				if(existYn==false) {

					System.out.println("존재하지 않는 회원입니다");
				}
			}


			else if(menu == 4) {

				System.out.println("목록에 저장된 회원 수는 "+map.size()+"명입니다");

				for(Map.Entry<String, Phone> entry : map.entrySet()) {

					System.out.println(entry.getValue().toString());

				}
			}

			else if(menu == 5) {

				
				BufferedWriter buffer = new BufferedWriter(new FileWriter(file));

				for(Map.Entry<String, Phone> entry : map.entrySet()) {
					
					buffer.write(entry.getValue().toString()+"\n");
				
				}
				
				buffer.flush();
				buffer.close();
			}
			else {

				System.exit(0);

			}
		}

	}

}
