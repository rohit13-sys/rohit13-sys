package Day_2.OverloadedConstructors;

public class DateMainP {
	public static void main(String args[]) {
		MyDateP myDate1 = new MyDateP();
		myDate1.setDay(9);
		myDate1.setMonth(06);
		myDate1.setYear(2021);
		myDate1.printDate();
		
		MyDateP myDate2 = new MyDateP(9,06,2021);
		myDate2.printDate();
	}
}
