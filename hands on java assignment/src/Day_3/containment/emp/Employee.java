package Day_3.containment.emp;

import Day_3.containment.date.MyDate;

public class Employee {

	private int empId;
	private String name;
	private MyDate birthDate;

	public Employee() {
		
	}

	public Employee(int empId, String name, MyDate birthDate) {
		this.empId = empId;
		this.name = name;
		this.birthDate = birthDate;
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

	public MyDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}

	public void display() {
		System.out.println("Employee Details:-\nempId:" + empId +
				"\nName:" + name + "\nbirthdate" + birthDate);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", "
				+ "name=" + name + ", birthDate=" + birthDate + "]";
	}
	
	
}
