package Day_2.staticAssignment;

public class Bank {

	public static void main(String args[]) {
		// default interest rate
		System.out.println("Interest Rate:" + Account.getInterestRate());
		
		// for default constructor object
		System.out.println("\n***************************************");
		Account acc = new Account();
		acc.setAccNo(852369);
		acc.setBalance(45000);
		acc.setDurationYears(2f);
		acc.setOwnerName("Rohit Khatwani");
		acc.printDetails();
		acc.calculateInterest();
		
		//parameterized constructor object
		System.out.println("\n***************************************");
		System.out.println("Parameterized constructor:");
		
		Account acc1 = new Account(123456, "Rohit khatwani", 25000, 1.5f);
		acc1.printDetails();
		acc1.calculateInterest();
		
		System.out.println("\n*****************************************");
		System.out.println("Accounts:"+Account.getCount());
		
	}
}
