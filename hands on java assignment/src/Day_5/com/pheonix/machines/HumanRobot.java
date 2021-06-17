package Day_5.com.pheonix.machines;

import Day_5.com.pheonix.interfaces.Walkable;

public class HumanRobot extends Robot implements Walkable {

	@Override
	public void run() {
		System.out.println("HumanRobot runs");
	}

	@Override
	public void jump() {
		System.out.println("HumanRobot jumps");
	}

	@Override
	public void walk() {
		System.out.println("HumanRobot walks");
	}

}
