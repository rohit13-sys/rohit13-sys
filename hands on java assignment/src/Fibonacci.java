import java.util.Scanner;

public class Fibonacci {

	public static void fibo(int terms){
		
		int a=0,b=0,c=1;
		if(terms<0){
			System.out.println("incorrect input");
		}
		else if(terms>0){
			for(int i=0;i<terms;i++){
				a=b;
				b=c;
				c=a+b;
				System.out.println(a);
			}
		}
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		fibo(n);
	}
}
