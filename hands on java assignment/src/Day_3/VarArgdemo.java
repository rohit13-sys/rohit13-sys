package Day_3;

public class VarArgdemo {

	//Variable Argument
	public static double average(int...a){
		double sum=0;
		for(int i:a){
			sum=sum+i;
		}
		return (sum/a.length);
	}
	public static void main(String[] args) {
		double ans=average(5,6,7,8,9,10);
		System.out.println("Average is: "+ans);
	}

}
