package exex;

public class Phone {
	
	private String name;
	private String PhoneNo;
	private String Address;
	
	public Phone(String name, String phoneNo, String address) {
		super();
		this.name = name;
		PhoneNo = phoneNo;
		Address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return String.format ("%s %s %s",name,PhoneNo,Address);
	}
	

	
	
}
