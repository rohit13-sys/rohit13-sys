package Day_2.OverloadedConstructors;

public class MyDateP {
	private int day,month,year;
	
	MyDateP(){
		System.out.println("Default constructor");
	}
	
	MyDateP(int d,int m,int y){
		System.out.println("parameterized Constructor");
		this.day=d;
		this.month=m;
		this.year=y;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void printDate(){
		System.out.println("Date is:"+day+"/"+month+"/"+year);
	}
}
