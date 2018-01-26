import java.util.Scanner;

public class FactorialEx {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int input = scan.nextInt();

		long result = getFact(input);
		long result2 = getFact2(input);

		System.out.println(result);
		System.out.println(result2);
		scan.close();

	}

	/**
	 * @param input
	 * @return long
	 * 
	 *         this is an example of how to solve factorial without recursion
	 */
	public static long getFact(int input) {
		long result = 1;

		for (int i = 1; i <= input; i++) {
			result *= i; // this is the same thing as result = result * i;

		}
		return result;
	}

	// this is recursion
	public static long getFact2(int input) {
		if (input == 1 || input == 0) {
			return 1; // this will only execute if 1 or 0 is entered or when the method call from
						// recursion hits this
		}
		return input * getFact2(input - 1); // recursive method call, input is always multiplied by the returned method
											// -- if 1 or 0 is reached by the if conditional the recursive method is
											// causing that

	}

}
