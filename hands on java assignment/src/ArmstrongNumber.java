import java.util.Scanner;

public class ArmstrongNumber {

	public static void armstrong(int num) {
		int a = 0, b, temp;
		temp = num;
		while (num > 0) {
			b = num % 10;
			num = num / 10;
			a = a + (b * b * b);
		}
		if (temp == a) {
			System.out.println(+temp + " is armstrong");
		} else {
			System.out.println(+temp + " is not armstrong");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		armstrong(n);
	}
}
