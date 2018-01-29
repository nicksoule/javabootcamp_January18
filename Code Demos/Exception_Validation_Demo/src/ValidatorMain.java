import java.util.Scanner;

public class ValidatorMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int test = scan.nextInt();		
		// String validation example (token) 
		String name = Validator.getString(scan, "Please enter your first name: ");
		System.out.println(name);
		
		// int validation example
		int num = Validator.getInt(scan, "Please enter a number: ");
		System.out.println(num);
		
		// int validation with range -- using the overloaded method
		int numRange = Validator.getInt(scan, "Please enter a number between 1 and 10: ", 1, 10);
		System.out.println(numRange);
		
		// double validation example
		double dubValidate = Validator.getDouble(scan, "Please enter a floating point number: ");
		System.out.println(dubValidate);

	}

}
