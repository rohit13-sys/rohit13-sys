package Day_2.MathOperations;

public class MathEngine {

	int multiply(int a, int b) {
		return a * b;
	}

	void multiply(int a, int b, int c) {
		int d = a * b * c;
		System.out.println("method 2:"+d);
	}

	float multiply(float a, int b) {
		return a * b;
	}

	float multiply(int a, float b) {
		return a * b;
	}

}
