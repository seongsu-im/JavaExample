package example0303.AuthorBookEx;
//package ex;
//
//import java.util.Scanner;
//
//public class BookEx {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Scanner scan = new Scanner(System.in);
//		Book[] book = new Book[10];
//		int count = 0; //입력이 완료  배열객체 수 카운트
//
//		while(true) {
//
//			System.out.println("1.도서 정보 입력 | 2.도서 목록 보기 | 3. 검색하기(제목) | 4.수량정보(여성작가수량/보유도서수량) | 5.프로그램종료");
//			int menu = scan.nextInt();
//
//
//			if(menu == 1) {
//
//				System.out.println("책제목, 저자, 이메일, 성별, 가격, 수량 순으로 입력하세요 -->>");
//
//
//				book[count] = new Book(scan.next(), new Author(scan.next(), scan.next(), scan.next()), scan.nextDouble(), scan.nextInt());
//				count ++;
//			}
//
//			else if(menu == 2) {
//
//				for(int i =0; i<count; i++) {
//
//					System.out.println(book[i].toString());
//				}
//
//			}
//
//			else if(menu == 3) {
//
//				System.out.print("제목을 입력하세요 -->> ");
//				String name = scan.next();
//
//				for(int i =0; i<count; i++) {
//
//					if(name.equals(book[i].getTitle())) {
//
//						System.out.println(book[i].toString()); 
//
//						break;
//					}
//
//				}
//
//			}
//
//
//			else if(menu == 4) {
//
//				int qty = 0;
//				int fqty = 0;
//
//				for(int i = 0; i<count; i++) {
//
//					if(book[i].getAuthor().getGender().equals("f")) {
//
//						fqty += book[i].getQty();
//
//					}
//
//					qty += book[i].getQty();
//
//				}
//
//				System.out.printf("여성작가도서/총보유도서 : (%d/%d)\n", fqty ,qty);
//
//			}
//
//			else {
//				System.out.println("시스템이 종료 되었습니다.");
//				System.exit(0);
//			}
//		}
//	}
//
//}
