package Day_4.inheritance.emp;

public class WageEmp extends Employee {

	private int noOfHours;
	private float ratePerHour;
	
	public WageEmp(){
//		System.out.println("WageEmp default constructor");
		
	}
	
	public WageEmp(int empId,String name,int hours,float rate){
		super(empId,name);
		this.noOfHours=hours;
		this.ratePerHour=rate;
	}

	public int getNoOfHours() {
		return noOfHours;
	}

	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}

	public float getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(float ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	
	public void calculateWage(){
		System.out.println("Wage:"+(getNoOfHours()*getRatePerHour()));
	}
	
	public void display(){
		super.display();
	}
	
	@Override
	public String toString(){
		return super.toString();
	}
}
