package Day_5.com.pheonix.planets;

public class Earth extends Planet {

	
	@Override
	public void move() {
		System.out.println("Earth moves");
	}

	@Override
	public void rotate() {
		System.out.println("Earth rotates");
	}

	@Override
	public void revolve() {
		System.out.println("Earth revolves");
	}

	@Override
	public boolean supportsLife() {
		System.out.println("Earth supports Life");
		return true;
	}

}
