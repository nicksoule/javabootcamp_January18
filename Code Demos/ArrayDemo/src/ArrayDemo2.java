import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the amount of books you want to enter: ");

		int numBooks = scan.nextInt();
		scan.nextLine();

		String[] books = new String[numBooks];

		System.out.println("You want to enter " + books.length + " books!");

		getBook(scan, books);
		System.out.println(Arrays.toString(books));
		System.out.println();

		// enhanced for loop example
		// the disadvantage to using this is you can't access the index directly
		// usually used to print values or add to the array

		for (String temp : books) { // left of colon needs to match the type of data structure we're looping
									// through & right hand side should be the actual array we want to loop through
			System.out.println(temp);

		}
		System.out.println();
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i]);
		}

	}

	public static void getBook(Scanner scan, String[] books) {
		for (int i = 0; i < books.length; i++) {
			System.out.println("Book # " + (i + 1)); // we used i + 1 to start the counter at 1
			books[i] = scan.nextLine();

		}

	}

}
