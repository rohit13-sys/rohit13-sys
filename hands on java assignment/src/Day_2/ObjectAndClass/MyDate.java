package Day_2.ObjectAndClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {
	
	private int date;
	private int month;
	private int year;
	
	public void initDate(int date,int month,int year){
		this.date=date;
		this.month=month;
		this.year=year;
	}
	
	public void printDate(){
		System.out.println(+date+"/"+month+"/"+year);
	}
}

