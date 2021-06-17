package Day_2.DefaultConstructor;

public class DateMainC {
	public static void main(String args[]){
		MyDateC myDate1=new MyDateC();
		myDate1.setDay(12);
		myDate1.setMonth(05);
		myDate1.setYear(2021);
		myDate1.printDate();
		
		MyDateC myDate2=new MyDateC();
		myDate2.setDay(13);
		myDate2.setMonth(05);
		myDate2.setYear(2021);
		myDate2.printDate();
	}
}
