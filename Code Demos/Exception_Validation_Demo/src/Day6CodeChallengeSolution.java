
import java.math.BigDecimal;
import java.util.Scanner;

/*
 * 	 Your goal: write a method that returns a BigDecimal that will properly return the result 0.2 + 0.7 when entered from the scanner.
 *	 You must use the validator class to validate that the user has entered a double value 
 *	 Hint: look at the setScale() method 
 *	 returned value to the console should show 0.9
 *
 */
public class Day6CodeChallengeSolution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(returnResult(scan));

	}

	public static BigDecimal returnResult(Scanner scan) {
		double userInput = Validator.getDouble(scan, "Please enter a floating point number: ");
		double userInput2 = Validator.getDouble(scan, "Please enter a second floating point number: ");
		BigDecimal num = new BigDecimal(userInput);

		num = num.add(new BigDecimal(userInput2));
		num = num.setScale(1, BigDecimal.ROUND_UP); // if you see a linestrike through the setScale() method it's
													// because the method is deprecated as of Java 9, but it can still
													// be used and will work for our needs

		return num;
	}

}
