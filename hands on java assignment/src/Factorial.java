import java.util.Scanner;

public class Factorial {

	public static int fact(int num) {
		int factorial = 1;
		if (num < 0) {
			System.out.println("Error,the number is negative");
		} else if (num >= 0) {
			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					factorial = factorial * i;
				}
				System.out.println("the factorial of " + num + " is :" + factorial);
			} else if (num == 0) {
				System.out.println("the factorial of zero is 1");
			}
		}
		return factorial;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fact(n);
	}
}
