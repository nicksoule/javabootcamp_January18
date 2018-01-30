import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		int[] arr1 = { 2, 47, 54, 12, 6 };
		// don't do this if you are trying to keep the values in the original array
		int[] arr2 = arr1;
		arr2[1] = 167;
		System.out.println("Array 1: " + Arrays.toString(arr1));
		System.out.println("Array 2: " + Arrays.toString(arr2));

		int[] arr3 = Arrays.copyOf(arr1, 56);
		arr3[1] = 185;
		System.out.println("Array 3: " + Arrays.toString(arr3));

		int[] arr4 = Arrays.copyOfRange(arr3, 2, 5); // will copy a range the end element in not inclusive
		System.out.println(Arrays.toString(arr4));
		
		Arrays.sort(arr1);

		System.out.println(Arrays.toString(arr1));
		System.out.println();
		arr1[2] = 103;
		System.out.println(Arrays.toString(arr1));

		Arrays.fill(arr1, 5); // this is filling the array with all 5s
		System.out.println(Arrays.toString(arr1));

		Arrays.fill(arr1, 2, arr1.length, 4);

		System.out.println(Arrays.toString(arr1));
	}

}
