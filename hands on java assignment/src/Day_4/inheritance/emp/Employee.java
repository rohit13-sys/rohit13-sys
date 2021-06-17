package Day_4.inheritance.emp;

public class Employee {

	private int empId;
	private String name;
	private double salary;

	public Employee() {
//		System.out.println("Employee Default constructor");
	}

	public Employee(int empId, String name) {
//		System.out.println("Employee Parameterized Constructor");
		this.empId = empId;
		this.name = name;
	}

	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	protected void display() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee salary: " + salary);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + getEmpId() + ", name=" + getName() + ", salary=" + getSalary() + "]";
	}
	
	

}
