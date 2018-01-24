import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		int caseSwitch = 1;
		switch (caseSwitch) {
		case 1:
		case 3:
		case 5:
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2");
			break;
		default:
			System.out.println("Default case");
			break;
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a grade: ");
		double grade = scan.nextDouble();

		switch ((int) grade / 10) {
		case 1:
			System.out.println("10 - 19");
			break;
		case 2:
			System.out.println("20 - 29");
			break;
		case 3:
			System.out.println("30 - 39");
			break;
		default:
			System.out.println("Your number didn't match");
		}
		System.out.println("Goodbye");
	}

}
