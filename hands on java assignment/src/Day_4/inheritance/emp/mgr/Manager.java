package Day_4.inheritance.emp.mgr;

import Day_4.inheritance.emp.Employee;

public class Manager extends Employee {

	private double incentives;

	// Employee obj1 = new Employee();

	public Manager() {
		super();
		// System.out.println("Manager default constructor");
	}

	public Manager(int empId, String name, double salary, double incentives) {
		super(empId, name, salary);
		this.incentives = incentives;
	}

	public double getIncentives() {
		return incentives;
	}

	public void setIncentives(double incentives) {
		this.incentives = incentives;
	}

	public void showIncentives() {
		System.out.println("Incentives: " + getIncentives());
	}

	@Override
	public void display() {
		super.display();
	}

	@Override
	public String toString() {

		return super.toString();

	}

}
