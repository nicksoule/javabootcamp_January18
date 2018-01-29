import java.util.Scanner;

public class ValidationDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// example # 1 
		System.out.println("Please enter a number: ");

		if (scan.hasNextInt()) { // you must check for scanner input before assigning when using the hasNext methods
			int userNum = scan.nextInt();
			scan.nextLine();
			System.out.println(userNum);
		} else {
			System.out.println("You did not enter a whole number! ");
			scan.nextLine();
		}
		
		// example # 2 - includes a loop
		System.out.println();
		System.out.println("Example # 2");
		
		System.out.println("Please enter a whole number: ");
		while (!scan.hasNextInt()) { // this will continue looping as long as a whole number is not entered
			System.out.println("Please enter a whole number: ");
			scan.nextLine();
		}
		
		int userInput = scan.nextInt(); // now the user number will be assigned
		System.out.println("You made it, you entered what I was looking for " + userInput);
		
		
		
		scan.close();

	}

}
