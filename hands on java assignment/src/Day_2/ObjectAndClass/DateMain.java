package Day_2.ObjectAndClass;

public class DateMain {

	public static void main(String args[]) {
		MyDate obj1 = new MyDate();
		MyDate obj2 = new MyDate();

		obj1.initDate(8, 06, 2021);
		obj1.printDate();

		obj2.initDate(2, 06, 2021);
		obj2.printDate();
	}

}
