package example0311.Contact;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class ContactEx {

	public static void main(String[] args) throws IOException {

		ArrayList<Contact> arraylist = new ArrayList<Contact>();
		Scanner scan = new Scanner(System.in);
	
//		
//		File file = new File("d:/temp/contact.txt");
//		
//		BufferedReader bufferReader = new BufferedReader(new FileReader(file));
//		
//		String c;
//		while((c = bufferReader.readLine())!= null) {
//			String[] arr = c.split(" ");
//			arraylist.add(new Contact(arr[0],arr[1],arr[2]));
//		}
//		
//		bufferReader.close();
		
						
		while(true) {

			System.out.println("===================================================================");
			System.out.println("1.전화번호 추가 2.전화번호 조회 3.전화번호 삭제 4.전화번호 목록 5.연락처파일로 저장 6.종료");
			System.out.println("===================================================================");
			System.out.print("메뉴를 선택하세요>>");
			
			int menu = scan.nextInt();

			if(menu == 1) {

				System.out.println("이름, 전화번호, 주소 순으로 입력하세요");
				arraylist.add(new Contact(scan.next(),scan.next(),scan.next()));
				
			}

			else if(menu == 2) {


				System.out.println("조회할 회원의 이름을 입력하세요>>");
				String name = scan.next();

				if(arraylist.size()>0) {

					for(Contact contact : arraylist) {

						if(name.equals(contact.getName())) {

							System.out.println(contact.toString());

						}

						else {

							System.out.println("존재하지 않는 회원입니다.");
						}

					}

				}

				else {

					System.out.println("존재하지 않는 회원입니다.");
				}

			}


			else if (menu == 3) {

				System.out.println("삭제할 회원의 이름을 입력하세요>>");
				String name = scan.next();

				Contact con = new Contact("", "", "");

				for(Contact contact : arraylist) {

					if(name.equals(contact.getName())) {

						con = contact;
						System.out.println("해당멤버를 삭제하였습니다.");	
					}


					else {

						System.out.println("존재하지 않는 회원입니다.");
					}

				}
				arraylist.remove(con);
			}

			else if (menu == 4) {

				System.out.println("목록에 저장된 회원 수는 " + arraylist.size() +" 명 입니다.");

				for(Contact contact : arraylist) {
					System.out.println(contact.toString());

				}
			}

//			else if (menu == 5) {
//
//				
//
//				BufferedWriter buffer = new BufferedWriter(new FileWriter(file));
//				
//				
//				
//				for(Contact contact : arraylist) {
//
//					buffer.write(contact.toString()+"\n");
//					
//										
//				}
//				buffer.flush();
//				buffer.close();
//			}
			
						
			
			else {

				System.exit(0);
			}
		}

	}

}
