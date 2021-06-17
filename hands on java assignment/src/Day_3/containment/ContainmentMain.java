package Day_3.containment;

import Day_3.containment.date.MyDate;
import Day_3.containment.emp.Employee;

public class ContainmentMain {

	public static void main(String args[]) {
		MyDate myDate = new MyDate(13, 9, 1999);
		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setName("Rohit");
		emp.setBirthDate(myDate);
		
		System.out.println("Showing data using default construcor using toString method:\n");
		System.out.println(emp.toString());
		
		System.out.println("\n****************************\n");
		System.out.println("Showing data with parameterized constructor using display method\n");
		Employee emp1 = new Employee(2, "RohitK", myDate);
		emp1.display();
	}

}
