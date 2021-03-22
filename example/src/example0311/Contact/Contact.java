package example0311.Contact;

 class Contact {

		private String name;
		private String phoneNo;
		private String addr;


		public Contact (String name, String phoneNo, String addr) {
			super();
			this.name = name;
			this.phoneNo = phoneNo;
			this.addr = addr;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}

		public String getAddr() {
			return addr;
		}

		public void setAddr(String addr) {
			this.addr = addr;
		}

		@Override
		public String toString() {
			
			return name +" "+ phoneNo +" " + addr;
		}



	}
