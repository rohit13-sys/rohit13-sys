package Day_5.com.pheonix.designpatterns.factory.car;

public class CoupleCar extends Car {

	public CoupleCar() {
		System.out.println("default constructor of Couple car");
	}
	
	@Override
	public void start() {
		System.out.println("CoupleCar starts");
	}
	@Override
	public void run() {
		System.out.println("CoupleCar runs");
	}
	
	@Override
	public void stop() {
		System.out.println("CoupleCar stops");
	}
}
