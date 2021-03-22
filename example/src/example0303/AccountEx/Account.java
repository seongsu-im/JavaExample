package example0303.AccountEx;

import java.util.Scanner;

class Account{
		private String id;
		private String name;
		private int balance = 0;

		public Account(String id, String name) {
			this(id, name, 0);
		}
		public Account(String id, String name, int balance) {
			this.id = id; 
			this.name = name; 
			this.balance = balance;
		}
		
		public String getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public int getBalance() {
			return balance;
		}
		
	
		public int deposit(int amount) {
			System.out.printf("%s님이 %d원을 입금하였음\n", name, amount);
			return balance+=amount; //balance = balance+amount
		}
		public int withdraw(int amount) {
			if(balance>=amount){
				balance -=amount;
				System.out.printf("%s님이 %d원을 출금하였음\n", name, amount);
			}else {
				System.out.printf("출금액이 잔액초과");
			}
			return balance;
		}
		public int transferTo(Account another, int amount) {
		
			if(balance>=amount){
				balance -=amount;
				another.balance+=amount;//상대계좌는 +(플러스)
				System.out.printf("%s님이 %s님에게 %d원을 송금하였음\n", name, another.name, amount);
			}else {System.out.printf("송금액이 잔액초과\n");
			}
			return balance;
		}
		public String toString() {
			return String.format("Account[id = %s, name = %s, balance = %d]"
					, id
					, name
					, balance);}
	}


