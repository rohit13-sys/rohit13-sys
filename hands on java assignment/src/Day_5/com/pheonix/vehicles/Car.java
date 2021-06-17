package Day_5.com.pheonix.vehicles;

import Day_5.com.pheonix.interfaces.Movable;
import Day_5.com.pheonix.interfaces.Runnable;

public class Car extends Vehicle implements Movable, Runnable {

	@Override
	public void run() {
		System.out.println("Car runs");
	}

	@Override
	public void move() {
		System.out.println("Car moves");
	}

	@Override
	public void start() {
		System.out.println("Car start");
		super.start();
	}

	@Override
	public void stop() {
		System.out.println("Car stops");
		super.stop();
	}

}
