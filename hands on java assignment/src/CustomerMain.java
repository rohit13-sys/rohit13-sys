
public class CustomerMain {

	public static void main(String args[]){
		Customer obj1=new Customer();
		obj1.setName("Rohit Khatwani");
		System.out.println("Name= "+obj1.getName());
		
		Customer obj2=new Customer(1,"Customer A",22,"Ahmedabad",382340);
		obj2.printDetails();
	}
}
