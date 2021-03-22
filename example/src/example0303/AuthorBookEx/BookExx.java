package example0303.AuthorBookEx;

import java.util.Scanner;

public class BookExx {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		Book[] book1 = new Book[10];
		int count = 0;

		while(true) {

			System.out.println("1.도서 정보 입력 | 2.도서 목록 보기 | 3.검색하기(제목) | 4.수량정보(여성작가수량/보유도서수량) | 5.프로그램종료");
			int menu = scan.nextInt();

 
			if(menu == 1) {

				System.out.println("책제목, 저자, 이메일, 성별, 가격, 수량 순으로 입력하시요-->> ");
				book1[count] = new Book(scan.next(), new Author(scan.next(), scan.next(), scan.next()),scan.nextDouble(),scan.nextInt());
				count++;
			}


			else if(menu == 2) {

				for(int i =0; i<count; i++) {

					System.out.println(book1[i].toString());
				}


			}

			else if(menu ==3 ) {

				System.out.print("제목을 입력하세요 -->");
				String name = scan.next();
				for(int i = 0; i<count; i++) {

					if(name.equals(book1[i].getTitle())) {

						System.out.println(book1[i].toString());
						break;
					}

				}

			}

			else if(menu == 4) {

				int fqty = 0;
				int qty = 0;
				
				for(int i =0; i<count; i++) {

					if(book1[i].getAuthor().getGender().equals("f")) {

						fqty += book1[i].getQty();

					}
					
					qty += book1[i].getQty();

					
				}

				System.out.printf("여성작가도서/총보유도서 : (%d/%d)\n",fqty,qty);	
		
			}

			else {

				System.out.println("프로그램종료");
				System.exit(0);
			}

		}


	}

}
