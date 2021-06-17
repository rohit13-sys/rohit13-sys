package Day_2.SettersAndGetters;

public class MyDateSG {
	private int day;
	private int month;
	private int year;
	
	public MyDateSG(){
		System.out.println("Default constructor");
	}
	
	public MyDateSG(int day,int month,int year){
		System.out.println("Parameterized Constructor");
		this.day=day;
		this.month=month;
		this.year=year;
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
		System.out.println("Date is"+day+"/"+month+"/"+year);
	}
}
