package example0303.AccountEx;

public class AccountEx {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		System.out.println("---------------------------------");
		System.out.println("초기계좌정보");
		Account acc = new Account("11-111-111", "코난", 20000);
		Account bcc = new Account("22-222-222", "장미", 100000);
		Account ccc = new Account("33-333-333", "미란", 50000);
		
		System.out.println(acc.toString());
		System.out.println(bcc.toString());
		System.out.println(ccc.toString());
		

		System.out.println("---------------------------------");
		
		acc.transferTo(bcc, 30000);
		acc.deposit(50000);
		acc.transferTo(bcc, 30000);
		System.out.printf("dd%d\n",acc.getBalance());
		ccc.withdraw(4500);
		
		System.out.println("---------------------------------");
		System.out.println("은행 업무 이후 계좌 정보");
		
		System.out.println(acc.toString());
		System.out.println(bcc.toString());
		System.out.println(ccc.toString());

	}
}
