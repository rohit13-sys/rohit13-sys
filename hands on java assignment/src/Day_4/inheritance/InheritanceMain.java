package Day_4.inheritance;

//Author:Rohit khatwani
//Date:13-06-2021
//version:1.0
//copyRight:Sterlite Technologies

import Day_4.inheritance.emp.Employee;
import Day_4.inheritance.emp.mgr.Manager;
import Day_4.inheritance.emp.WageEmp;

public class InheritanceMain {

	public static void main(String args[]) {
		System.out.println("Problem statement B:\n");
		Employee emp = new Employee(1, "Rohit", 25000);
		System.out.println(emp.toString());

		System.out.println("\n*******************************\n");

		System.out.println("Problem statement C:\n");
		Manager mgr = new Manager();
		mgr.setEmpId(2);
		mgr.setName("Rohitk");
		mgr.setIncentives(5000);
		mgr.setSalary(50000);
		System.out.println("Manager Details");
		mgr.showIncentives();
		mgr.display();
		System.out.println("ToString:" + mgr.toString());

		System.out.println("\n*******************************\n");

		System.out.println("Problem statement D:\n");
		Manager mgr1 = new Manager(3, "Rohit khatwani", 60000, 6000);
		mgr1.showIncentives();
		mgr1.display();
		System.out.println("To String:" + mgr1.toString());

		System.out.println("\n*******************************\n");

		System.out.println("Problem statement E:\n");
		WageEmp wageEmp = new WageEmp();
		wageEmp.setNoOfHours(30);
		wageEmp.setRatePerHour(300);
		wageEmp.calculateWage();
		wageEmp.setEmpId(3);
		wageEmp.setName("Rohit bhai");
		wageEmp.setSalary(70000);
		wageEmp.display();
		System.out.println("ToString:"+wageEmp.toString());
		
		System.out.println("\n*******************************\n");
		
		System.out.println("Problem statement F:\n");
		WageEmp wageEmp1=new WageEmp(4,"Rk",30,300);
		wageEmp1.setSalary(80000);
		wageEmp1.display();
		System.out.println(wageEmp.toString());
		
	}
}