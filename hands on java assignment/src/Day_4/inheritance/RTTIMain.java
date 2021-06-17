package Day_4.inheritance;

//Author:Rohit khatwani
//Date:13-06-2021
//version:1.0
//copyRight:Sterlite Technologies

import Day_4.inheritance.emp.Employee;
import Day_4.inheritance.emp.WageEmp;
import Day_4.inheritance.emp.mgr.Manager;

public class RTTIMain {

	public static void showEmpInfo(Employee emp) {
		if (emp instanceof Manager) {

			((Manager) emp).display();
			((Manager) emp).showIncentives();
			emp.toString();
//			System.out.println("ToString:" + mgr.toString());

		}

		else if (emp instanceof WageEmp) {

			((WageEmp) emp).display();
			((WageEmp) emp).calculateWage();
			emp.toString();
		}

	}

	public static void main(String args[]) {

		System.out.println("Problem statement C:\n");
		Manager mgr = new Manager();
		mgr.setEmpId(5);
		mgr.setIncentives(6000);
		mgr.setName("Rohitttt");
		mgr.setSalary(70000);
		showEmpInfo(mgr);

		System.out.println("\n*******************************\n");

		System.out.println("Problem statement E:\n");
		WageEmp wageEmp = new WageEmp();
		wageEmp.setEmpId(6);
		wageEmp.setName("Rohitttt");
		wageEmp.setNoOfHours(30);
		wageEmp.setRatePerHour(300);
		wageEmp.setSalary(80000);
		showEmpInfo(wageEmp);

	}
}
