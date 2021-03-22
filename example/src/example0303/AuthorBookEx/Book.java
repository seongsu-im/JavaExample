package example0303.AuthorBookEx;

public class Book  {

	private String title;
	private Author author;
	private double price;
	private int qty;
	
	public Book(String title, Author author, double price, int qty) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getTitle() {
		return title;
	}

	public Author getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return String.format("Book[title=%s,%s,price=%.1f,qty=%d]\n",title,author,price,qty);
	}
			
}
