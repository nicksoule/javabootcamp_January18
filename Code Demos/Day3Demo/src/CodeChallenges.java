import java.util.Scanner;

public class CodeChallenges {

	public static void main(String[] args) {
		// Morning Challenge
		Scanner scan = new Scanner(System.in);

		int userNum = scan.nextInt();
		if (userNum % 15 == 0) {
			System.out.println("Number is divisible by 15");
		}
		if (userNum % 5 == 0) {
			System.out.println("Number is divisible by 5");
		}
		if (userNum % 3 == 0) {
			System.out.println("Number is divisible by 3");
		}
		
		// Afternoon Challenge - Fizz Buzz
		
		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0) {
				System.out.println(i + " Fizz Buzz");
			}
			else if (i % 5 == 0) {
				System.out.println(i + " Buzz");
			}
			else if (i % 3 == 0) {
				System.out.println(i + " Fizz");
			} else {
				System.out.println(i);
			}
		}
		scan.close();
	}

}
