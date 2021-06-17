import java.util.Scanner;

public class CharCount {

	public static int countChar(String str,char ch){
		int count=0;
		char[] chars=str.toCharArray();
		for(int i=0;i<chars.length;i++){
			if(chars[i]==ch){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char ch=sc.next(). charAt(0);
		int count=countChar(str,ch);
		System.out.println(count);
	}
}
