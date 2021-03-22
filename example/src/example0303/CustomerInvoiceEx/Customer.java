package example0303.CustomerInvoiceEx;

public class Customer {

	private int id;   // 1~3
	private String name; 
	private int discount; // 할인율 (%)
	
	

	public Customer(int id, String name, int discount) {
		super();
		this.id = id;
		this.name = name;
		this.discount = discount;
	}

		
	public int getId() {
		return id;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return String.format("%s(%d)", name,id);
			
	}
		
	
}
