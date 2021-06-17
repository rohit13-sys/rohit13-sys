package Day_2.MathOperations;

public class OverloadTest {

	public static void main(String args[]) {
		
		MathEngine math = new MathEngine();
		System.out.println("method 1:" + math.multiply(3, 4));
		math.multiply(3, 4, 5);
		System.out.println("method 3:"+math.multiply(3.5f, 4));
		System.out.println("method 4:"+math.multiply(3, 4.5f));
	}
}
