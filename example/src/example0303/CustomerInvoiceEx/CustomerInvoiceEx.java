package example0303.CustomerInvoiceEx;

import java.util.Scanner;

public class CustomerInvoiceEx {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Invoice[] invoice = new Invoice[3];
		
		
		for(int i=0; i<invoice.length; i++) {
									
			System.out.println("상품아이디, 고객명, 할인율, 총액 순서대로 입력하세요 -->");
			
			invoice[i] = new Invoice(scan.nextInt(), new Customer(i+1,scan.next(),scan.nextInt()),scan.nextDouble());
					
					
		}
		
		for(int i=0; i<invoice.length; i++) {
			
				System.out.print(invoice[i].toString()+"\n");
				
		}
	
	}

}
