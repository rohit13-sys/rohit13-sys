package Day_2.ThisKeyword;

public class DateMainT {
	
	public static void main(String args[]){
		MyDateT myDate1=new MyDateT();
		myDate1.setDay(12);
		myDate1.setMonth(05);
		myDate1.setYear(2021);
		myDate1.printDate();
		
		MyDateT myDate2=new MyDateT(9,06,2021);
		myDate2.printDate();
	}
}	
