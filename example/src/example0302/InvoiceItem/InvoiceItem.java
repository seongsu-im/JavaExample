package example0302.InvoiceItem;

public class InvoiceItem {

	private String id; //상품 아이디
	private String desc; //상품명
	private	int qty; //구매 수량
	private double unitPrice; //단가
	
	public InvoiceItem(String id, String desc, int qty, double unitPrice) {
		super();
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}
	
			//구매 총액
	public double getTotal() {
		
		return qty*unitPrice;
		
	}

	@Override
	public String toString() {
		return String.format("InvoiceItem[id=%s, desc=%s, qty=%d, unitPrice=%.1f]의 구매총액은 %.1f", id,desc,qty,unitPrice,getTotal());
	}
	
	
	
}
