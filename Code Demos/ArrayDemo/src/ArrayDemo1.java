import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		String[] strArr = new String[3];
		System.out.println(Arrays.toString(strArr));
		
		strArr[0] = "Steven";
		
		System.out.println(Arrays.asList(strArr));
		
		String strArr2[] = {"Steven","Ben","Emily","Nikki"};
		System.out.println(strArr2.length);
		
		
		int intArr[] = {1,2,3,4}; // this is declaring and initializing in one step
		int[] intArr2 = new int[4]; // this is declaring with a size - the default values are 0
		intArr2[0] = 1; // this is assigning a value to the specific index
		intArr2[1] = 2;
		intArr2[2] = 2;
		intArr2[3] = 2;
		
		Car[] car1 = new Car[2]; // you can create an array of any type of object
		
		System.out.println(Arrays.toString(car1));
		
		boolean[] arr3;
		arr3 = new boolean[4];
		
		arr3[1] = true;
		arr3[3] = true;
		
		System.out.println(Arrays.toString(arr3));
		
		final int SIZE = 3;
		String[] newArr = new String[SIZE];
		System.out.println(newArr.length);
		
		String p1 = "emily";
		String p2 = "mercy";
		String p3 = "zach";
		
		//String[] names2 = new String[SIZE]; // if you do initialize with a size you must use the index notation to assign values
		String[] names2 = {p1,p2,p3};
		

	}

}
