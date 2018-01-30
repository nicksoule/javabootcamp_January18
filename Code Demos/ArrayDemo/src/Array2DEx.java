import java.util.Arrays;

public class Array2DEx {

	public static void main(String[] args) {
		int[] arrTest = { 1, 2, 3, 4 };
		int[] arrTest2 = { 1, 2, 3, 4 };
		int[] arrTest3 = { 1, 2, 3, 4 };
		int[][] arr = { arrTest, arrTest2, arrTest3 }; // creating a rectangular array
		arr[0] = arrTest;

		System.out.println(Arrays.toString(arr[0]));

		int[][] arr2 = { { 3, 4, 7, 8 }, { 8, 12, 34, 56 }, { 9, 32, 11, 15 }, { 6, 72, 33, 4 } };
		// for Wednesday: figure out how to use loop through the 2D array above
		

		String[][] names = new String[3][]; // this is a jagged array -- we only need to declare the row count (the
											// second bracket can be empty)
		names[0] = new String[5];
		names[1] = new String[16];
		names[2] = new String[47];
	}

}
