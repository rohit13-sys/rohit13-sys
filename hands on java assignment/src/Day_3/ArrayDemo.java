package Day_3;

public class ArrayDemo {

	//1D Array
	public static void main(String args[]) {
		int arr1[] = new int[10];

		System.out.println("Int array using new keyword:");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i;
			System.out.println(arr1[i]);
		}
		
		System.out.println("*****************************");
		int arr2[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Int array without using new keyword:");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("*****************************");
		System.out.println("String array-1:Cities");
		String arr3[] = { "Ahmedabad", "Gandhinagar", "Surat", "Vadodara" };
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		System.out.println("*****************************");
		System.out.println("String array-2:Hobbies");
		String arr4[] = { "Gaming", "playing", "sleeping", "Roaming" };
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
	}
}
