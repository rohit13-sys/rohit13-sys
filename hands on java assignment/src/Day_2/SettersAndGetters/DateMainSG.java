package Day_2.SettersAndGetters;

public class DateMainSG {

	public static void main(String args[]) {
		MyDateSG myDate = new MyDateSG();
		myDate.setDay(12);
		myDate.setMonth(05);
		myDate.setYear(2021);
		System.out.println("Date is:" + myDate.getDay() + 
				"/" + myDate.getMonth() + "/" + myDate.getYear());
		MyDateSG myDate1=new MyDateSG(22,07,2021);
		System.out.println("Date is:" + myDate1.getDay() + 
				"/" + myDate1.getMonth() + "/" + myDate1.getYear());
	}
}
