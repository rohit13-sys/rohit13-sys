package Day_4.inheritance.emp.wage;

import Day_4.inheritance.emp.EmployeeData;
import Day_4.inheritance.emp.WageEmp;

public class WageEmpData extends EmployeeData {
	public WageEmp getEmployee() {
		WageEmp wageEmp = new WageEmp();
		wageEmp.setNoOfHours(30);
		wageEmp.setRatePerHour(300);
		wageEmp.setEmpId(9);
		wageEmp.setName("Rohit Khatwani");
		wageEmp.setSalary(70000);
		return wageEmp;
	}
}
