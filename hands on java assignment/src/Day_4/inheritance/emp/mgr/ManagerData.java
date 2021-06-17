package Day_4.inheritance.emp.mgr;

import Day_4.inheritance.emp.EmployeeData;

public class ManagerData extends EmployeeData {

	public Manager getEmployee() {
		Manager mgr = new Manager();
		mgr.setEmpId(8);
		mgr.setIncentives(8000);
		mgr.setName("Rohit Khatwani");
		mgr.setSalary(90000);
		return mgr;
	}
}
