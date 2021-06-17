package Day_4.inheritance.covariant;

import Day_4.inheritance.emp.EmployeeData;
import Day_4.inheritance.emp.mgr.ManagerData;
import Day_4.inheritance.emp.wage.WageEmpData;

public class CovariantMain {

	public static void main(String args[]) {
		
		System.out.println("Problem statement A:\n");
		EmployeeData empData = new EmployeeData();
		System.out.println(empData.getEmployee().toString());
		
		System.out.println("\n*******************************\n");
		
		System.out.println("Problem statement B:\n");
		ManagerData mgrData=new ManagerData();
		System.out.println("Incentives:"+mgrData.getEmployee().getIncentives());
		System.out.println(mgrData.getEmployee().toString());
		
		System.out.println("\n*******************************\n");
		
		System.out.println("Problem statement C:\n");
		WageEmpData wageEmpData=new WageEmpData();
		wageEmpData.getEmployee().calculateWage();
		System.out.println(wageEmpData.getEmployee().toString());
	}
}
