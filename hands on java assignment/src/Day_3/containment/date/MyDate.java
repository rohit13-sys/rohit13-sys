package Day_3.containment.date;

import Day_2.SettersAndGetters.MyDateSG;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	MyDateSG myDateSG=new MyDateSG();

	public MyDate() {
		System.out.println("Default constructor");
	}

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	
	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}
