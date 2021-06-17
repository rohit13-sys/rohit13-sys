package Day_5.com.pheonix.machines;

import Day_5.com.pheonix.interfaces.Movable;

public class Robot implements Movable {

	public void processData() {
		System.out.println("Robot processes data");
	}

	public void senseInfo() {
		System.out.println("robot senses Information");
	}

	public void useArtificialIntelligence() {
		System.out.println("Robot uses artificial intelligence");
	}

	@Override
	public void move() {
		System.out.println("Robot moves");
	}
}
