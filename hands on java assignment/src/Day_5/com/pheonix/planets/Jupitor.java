package Day_5.com.pheonix.planets;

public class Jupitor extends Planet {

	@Override
	public void move() {
		System.out.println("Jupitor moves");
	}

	@Override
	public void rotate() {
		System.out.println("Jupitor rotates");
	}

	@Override
	public void revolve() {
		System.out.println("Jupitor revolve");
	}

	@Override
	public boolean supportsLife() {
		System.out.println("Jupitor Deosn't sopports Life");
		return false;
	}

}
