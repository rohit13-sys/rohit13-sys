import java.util.Scanner;

public class MultiplicationTable {

	public static void mulTable(int n,int range) {
		int ans;
		for (int i = 1; i <= range; i++) {
			ans = n * i;
			System.out.println(+n + "*" + i + "=" + ans);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int range=sc.nextInt();
		mulTable(n,range);
	}
}
