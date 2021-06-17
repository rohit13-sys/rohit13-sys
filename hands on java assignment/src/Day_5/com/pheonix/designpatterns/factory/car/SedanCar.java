package Day_5.com.pheonix.designpatterns.factory.car;

public class SedanCar extends Car {

	public SedanCar() {
		System.out.println("default constructor of sedan car");
	}
	
	@Override
	public void start() {
		System.out.println("Sedan car starts");
	}
	@Override
	public void run() {
		System.out.println("Sedan car runs");
	}
	
	@Override
	public void stop() {
		System.out.println("sedan car stops");
	}
	
}
