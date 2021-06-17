package Day_5.com.pheonix.living.pet;

import Day_5.com.pheonix.interfaces.Walkable;
import Day_5.com.pheonix.living.Animal;

public class Cat extends Animal implements Walkable {

	@Override
	public void run() {
		System.out.println("Cat runs");
	}

	@Override
	public void jump() {
		System.out.println("Cat jumps");
	}

	@Override
	public void move() {
		System.out.println("Cat moves");
	}

	@Override
	public void walk() {
		System.out.println("Cat walks");
	}

}
