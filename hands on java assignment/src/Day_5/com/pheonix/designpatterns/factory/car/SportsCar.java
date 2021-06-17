package Day_5.com.pheonix.designpatterns.factory.car;

public class SportsCar extends Car {

	public SportsCar() {
		System.out.println("default constructor of SportsCar");
	}
	
	@Override
	public void start() {
		System.out.println("SportsCar starts");
	}
	@Override
	public void run() {
		System.out.println("SportsCar runs");
	}
	
	@Override
	public void stop() {
		System.out.println("SportsCar stops");
	}
}
