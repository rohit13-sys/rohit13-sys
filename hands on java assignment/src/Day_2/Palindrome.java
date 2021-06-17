package Day_2;

import java.util.Scanner;

public class Palindrome {

	public static boolean checkPalindrome(String s) {
		String string = s;
		char[] chars = s.toCharArray();
		StringBuilder str = new StringBuilder();
		for (int i = chars.length - 1; i >= 0; i--) {
			str.append(chars[i]);
		}

		String strFinal = str.toString();
		if (strFinal.equals(s)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		boolean ans = checkPalindrome(s);
		if (ans) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}
