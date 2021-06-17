package Day_5.com.pheonix.planets;

import Day_5.com.pheonix.interfaces.Movable;
import Day_5.com.pheonix.interfaces.Revolvable;
import Day_5.com.pheonix.interfaces.Rotatable;

public abstract class Planet implements Movable, Rotatable, Revolvable {

	private int noOfMoons;

	public int getNoOfMoons() {
		return noOfMoons;
	}

	public void setNoOfMoons(int noOfMoons) {
		this.noOfMoons = noOfMoons;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void revolve() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub

	}

	protected abstract boolean supportsLife();

	@Override
	public String toString() {
		return "Planet [noOfMoons=" + noOfMoons + "]";
	}

}
