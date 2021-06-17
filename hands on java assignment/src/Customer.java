
public class Customer {
	
		private int customerId;
		private String name;
		private int age;
		private String city;
		private int pinCode;
		
		public Customer(){
			
		}
		
		public Customer(int customerId,String name,int age,String city,int pinCode){
			this.customerId=customerId;
			this.name=name;
			this.age=age;
			this.city=city;
			this.pinCode=pinCode;
		}
		
		
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void printDetails(){
			System.out.println("Customer:\ncustomerId "+customerId+"\nname= "+name+"\nage= "+age+"\ncity= "+city+"\npincode= "+pinCode);
		}

		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", name=" + name + ", age=" + age + ", city=" + city
					+ ", pinCode=" + pinCode + "]";
		}
		
	}
	



