package example0309.MemberEx;

import java.util.ArrayList;
import java.util.Scanner;


class Member{

	String name;
	String phoneNo;
	String addr;

	public Member() {
		super();
	}

	public Member(String name, String phoneNo, String addr) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return name +" "+ phoneNo +" " + addr;
	}




}


public class MemberEx {

	public static void main(String[] args) {


		ArrayList<Member> list = new ArrayList<Member>();
		Scanner scan = new Scanner(System.in);

		while(true) {

			System.out.println("======================================================================");
			System.out.println("1.전화번호 추가 2.전화번호 조회 3.전화번호 삭제 4.전화번호 목록 5.프로그램 종료");
			System.out.println("======================================================================");
			System.out.print("메뉴를 선택하세요>>");
			int menu = scan.nextInt();

			if(menu==1) {
				System.out.println("이름, 전화번호, 주소 순으로 입력하세요");
				list.add(new  Member(scan.next(), scan.next(), scan.next()));

			}

			else if(menu==2) {

				System.out.println("조회할 회원의 이름을 입력하세요 >>");
				String name = scan.next();
			
				if(list.size()>0) {
					String message = "";
					for(Member member : list) {

						// 있으면 보여주고 없으면 존재하지 않는 회원입니다.
						// 그런데 전부 돌아서 확인한 뒤에 출력되어야함
						
						if(name.equals(member.getName())){

							message = member.toString();
						}						

					}
					
					if(!"".equals(message)) {
						System.out.println(message);
					}else {
						System.out.println("존재하지 않는 회원입니다.");
					}
					
					
				}

				else {
					System.out.println("존재하지 않는 회원입니다");
				}
			}

			else if(menu==3) {

				System.out.println("삭제회원의 이름을 입력하세요 >>");
				String name = scan.next();

		
				Member mb = new Member("", "", "");
				for(Member member : list) {
					if(name.equals(member.getName())) {
					
						mb = member;

					}
				}
			
				list.remove(mb);
			}


			else if(menu == 4) {

				System.out.println("목록에 저장된 회원 수는 "+list.size()+"명 입니다.");
				for(Member member:list) {
					System.out.println(member.toString());
				}

			}
			
			else {
				System.exit(0);
			}
		}

	}

}
