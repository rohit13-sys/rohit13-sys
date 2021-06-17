package Day_4.inheritance;

//Author:Rohit khatwani
//Date:13-06-2021
//version:1.0
//copyRight:Sterlite Technologies

import Day_4.inheritance.emp.Employee;
import Day_4.inheritance.emp.WageEmp;
import Day_4.inheritance.emp.mgr.Manager;

public class InheritanceDTMain {
	
	public static void main(String args[]){
		
		System.out.println("Problem statement C:\n");
		Employee emp=new Manager(5,"Rohitttt",90000,6000);
		Manager mgr1=(Manager)emp;
		mgr1.display();
		mgr1.showIncentives();
		
		System.out.println("\n*******************************\n");
		
		System.out.println("Problem statement D:\n");
		Employee empWageEmp=new WageEmp(6,"RRRKKK",70,300);
		WageEmp wageEmp=(WageEmp)empWageEmp;
		wageEmp.setSalary(80000);
		wageEmp.display();
		wageEmp.calculateWage();
		
		
		
		
		
	}
	
}
