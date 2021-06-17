import java.util.Scanner;

public class StringReverse {

	public static String reverse(String str){
		char[] str1=str.toCharArray();
		StringBuilder str2=new StringBuilder();
		for(int i=str1.length-1;i>=0;i--){
			str2.append(str1[i]);
		}
		return str2.toString();
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(reverse(str));
	
	}
}
