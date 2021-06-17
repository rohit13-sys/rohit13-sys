package Day_3;

public class ForEach2DDemo {

	// Enhanced For loop:2D Array
	public static void main(String args[]) {
		System.out.println("int 2D Array using new keyword:");
		int[][] arr1 = new int[4][4];
		for (int row = 0; row < arr1.length; row++) {
			for (int col = 0; col < arr1[row].length; col++) {
				arr1[row][col] = row * col;
			}
		}
		for (int[] row : arr1) {
			for (int col : row) {
				System.out.print(col + "\t");
			}
			System.out.println();
		}

		System.out.println("\n*****************************");
		System.out.println("int 2D[2][4] Array without using new keyword:");
		int[][] arr2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		for (int[] row : arr2) {
			for (int col : row) {
				System.out.print(col+"\t");
			}
			System.out.println();
		}
	}
}
