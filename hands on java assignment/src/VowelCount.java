import java.util.Scanner;

public class VowelCount {

	public static int countVowels(String str){
		int count=0;
		for(int k=0;k<str.length();k++){
			char ch = str.charAt(k);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=countVowels(str);
		System.out.println(count);
	}
}
