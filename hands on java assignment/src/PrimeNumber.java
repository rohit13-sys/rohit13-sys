import java.util.Scanner;

public class PrimeNumber {

	public static String prime(int num) {
		String isPrime = null;
		for (int i = 2; i <=num/2; i++) {
			if (num % i == 0) {
				isPrime = "No";
			}

			else if (num % i != 0) {
				isPrime = "Yes";
			}

			else if (num == 0 || num == 1) {
				isPrime = "No";
			}
		}
		return isPrime;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String isPrime = prime(n);
		if (isPrime.equals("Yes")) {
			System.out.println(+n + " is prime");
		} else if (isPrime.equals("No")) {
			System.out.println(+n + " is not prime");
		}
	}
}
