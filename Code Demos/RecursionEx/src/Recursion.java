import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number to start the count down timer: ");
		int userNum = scan.nextInt();
		countDown(userNum);
		
		scan.close();

	}
	
	public static void countDown(int countInt) {
		
		if (countInt == 0) {
			System.out.println("GO!");
		} else {
			System.out.println(countInt);
			// this is where the recursion starts
			// the method is calling itself and decrementing
			countDown(countInt - 1);
		}
		
	}

}
