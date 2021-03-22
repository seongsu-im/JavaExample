package example0302.InvoiceItem;

import java.util.Scanner;

public class InvoiceItemEx {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		InvoiceItem invoice = new InvoiceItem(scan.next(),scan.next(),scan.nextInt(),scan.nextDouble());
		InvoiceItem invoice2 = new InvoiceItem(scan.next(),scan.next(),scan.nextInt(),scan.nextDouble());
		InvoiceItem invoice3 = new InvoiceItem(scan.next(),scan.next(),scan.nextInt(),scan.nextDouble());
		
		
		System.out.println(invoice.toString());
		System.out.println(invoice2.toString());
		System.out.println(invoice3.toString());
	}
	

}
