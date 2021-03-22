package example0303.CustomerInvoiceEx;

public class Invoice {

	
	private int id;
	private Customer customer;
	private double amount;
	
	public Invoice(int id, Customer customer, double amount) {
		super();
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getId() {
		return id;
	}


	public String getCustomerName() {
		
			return customer.getName();
	}
	
	
	public double getAmountAfterDiscount() {  //최종지불액
		
		
		return amount - amount*getCustomer().getDiscount()/100;
		
	}

	@Override
	public String toString() {
		return String.format("%s님께서 %d를 구매하고 총액 %.1f원에서 %d%% 할인 받아 최종 지불액은 %.1f원임 ",customer,id,amount,getCustomer().getDiscount(),getAmountAfterDiscount());
	}
	
	
	
}


