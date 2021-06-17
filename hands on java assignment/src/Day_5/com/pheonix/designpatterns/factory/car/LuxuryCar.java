package Day_5.com.pheonix.designpatterns.factory.car;

public class LuxuryCar extends Car {

	public LuxuryCar() {
		System.out.println("default constructor of LuxuryCar");
	}

	@Override
	public void start() {
		System.out.println("LuxuryCar starts");
	}

	@Override
	public void run() {
		System.out.println("LuxuryCar runs");
	}

	@Override
	public void stop() {
		System.out.println("LuxuryCar stops");
	}
}
