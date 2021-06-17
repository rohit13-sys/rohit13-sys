package Day_3;

public class Array2DDemo {

	//2D Array
	public static void main(String args[]) {
		System.out.println("Int 2D Array using new keyword:");
		int arr1[][] = new int[4][4];
		for (int row = 0; row < arr1.length; row++) {
			for (int col = 0; col < arr1[row].length; col++) {
				arr1[row][col] = row * col;
				System.out.print(arr1[row][col] + "\t");
			}
			System.out.println();
		}
		System.out.println("*****************************");
		System.out.println("Int 2D Array without using new keyword:");

		int arr2[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		for (int row = 0; row < arr2.length; row++) {
			for (int col = 0; col < arr2[row].length; col++) {
				System.out.print(arr2[row][col] + "\t");
			}
			System.out.println();
		}
	}
}
