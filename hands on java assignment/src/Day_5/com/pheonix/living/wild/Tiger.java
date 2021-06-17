package Day_5.com.pheonix.living.wild;

import Day_5.com.pheonix.interfaces.Walkable;
import Day_5.com.pheonix.living.Animal;

public class Tiger extends Animal implements Walkable {

	@Override
	public void move() {
		System.out.println("Tiger moves");
	}

	@Override
	public void run() {
		System.out.println("Tiger Runs");
	}

	@Override
	public void jump() {
		System.out.println("Tiger jumps");
	}

	@Override
	public void walk() {
		System.out.println("Tiger walks");
	}

}
