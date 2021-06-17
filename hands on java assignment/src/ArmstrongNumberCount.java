import java.util.Scanner;

class ArmstrongNumberCount {

	public static void armstrongCount(int count) {
		int n, a, sum = 0;
		for (int i = 1; i <= count; i++) {
			n = i;
			while (n > 0) {
				a = n % 10;
				sum = sum + (a * a * a);
				n = n / 10;
			}
			if (sum == i) {
				System.out.println(i + " ");
			}
			sum = 0;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		armstrongCount(count);

	}
}
