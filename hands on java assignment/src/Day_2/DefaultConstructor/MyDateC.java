package Day_2.DefaultConstructor;

public class MyDateC {

	private int day, month, year;

	MyDateC() {
		this.day = day;
		this.month = month;
		this.year = year;
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

	public void printDate() {
		System.out.println("Date is:" + this.day + "/" + this.month + "/" + this.year);
	}
}
