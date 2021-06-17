package Day_2.staticAssignment;

public class Account {
	// private data members
	private int accNo;
	private String ownerName;
	private double balance;
	private float durationYears;

	// static data members
	private static int count;
	private static float interestRate;

	// static block
	static {
		interestRate = 0.05f;
	}

	// default constructor
	Account() {
		System.out.println("default constructor:");
		count++;
	}

	// parameterized constructor
	Account(int accNo, String ownerName, double balance, float durationYears) {

		this.accNo = accNo;
		this.balance = balance;
		this.durationYears = durationYears;
		this.ownerName = ownerName;
		count++;
	}

	// getter setter methods
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public float getDurationYears() {
		return durationYears;
	}

	public void setDurationYears(float durationYears) {
		this.durationYears = durationYears;
	}

	public static int getCount() {
		return count;
	}

	public static float getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(float interestRate) {
		Account.interestRate = interestRate;
	}

	// Calculate interest
	public void calculateInterest() {
		System.out.println("Interest calculated");
		System.out.println("Interest Amount:" + ((balance * durationYears * interestRate)));
	}

	// print details
	public void printDetails() {
		System.out.println("Acc No:" + accNo + "\nownerName:" + ownerName + "\nbalance:" + balance + "\ndurationYears:"
				+ durationYears + "\ninterestRate:" + interestRate);
	}

}
