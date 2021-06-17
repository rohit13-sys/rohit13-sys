package Day_3;

public class ForEach1Demo {

	//Enhanced For loop:1D Array
	public static void main(String args[]) {
		System.out.println("Double 1D Array using new keyword:");
		double[] arr1 = new double[10];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i;
		}
		for (double arrIterator : arr1) {
			System.out.print(arrIterator + "\t");
		}

		System.out.println("\n\n*****************************");
		System.out.println("float 1D Array without using new keyword:");
		float[] arr2 = { 1.0f, 2.0f, 5.2f, 6.5f, 0.25f };
		for (float arrIterator : arr2) {
			System.out.print(arrIterator + "\t");
		}
		
		System.out.println("\n\n*****************************");
		System.out.println("String 1D Array:Flowers");
		String[] arr3={"Rose","Lily","Jasmine","SunFlower"};
		for(String arrIterator:arr3){
			System.out.print(arrIterator+"\t");
		}
		
		System.out.println("\n\n*****************************");
		System.out.println("String 1D Array:Country");
		String[] arr4={"India","China","Cambodia","Albania"};
		for(String arrIterator:arr4){
			System.out.print(arrIterator+"\t");
		}
	}
}
