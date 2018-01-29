import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String cont = "y";

		while (cont.equalsIgnoreCase("y")) {
			// Your code should start here

			try {
				System.out.println("Please enter a number: ");
				int userNum = scan.nextInt();
				scan.nextLine(); 
				System.out.println(userNum);
			} catch (InputMismatchException e) { // child exception must always be listed before the parent
				System.out.println("Please enter a valid integer!");
				scan.nextLine(); // this will clear out the incorrect value entered into the scanner
				continue; // this will take the program back to the top of the while loop
			} catch (Exception e) { // this is possible because Exception is a parent class of InputMismatchException
				System.out.println("Hey, I'm not sure what happened -- some error occurred");
				scan.nextLine(); // this will clear out the incorrect value entered into the scanner
				continue; // this will take the program back to the top of the while loop
			}
			
			
			// this is where your code should end if your using this as a template
			System.out.println("Do you want to continue? y/n");
			cont = scan.nextLine();

		}

		// Let the user know the program has ended
		System.out.println("Goodbye");

		scan.close();

	}

}
