import java.util.Scanner;

public class MethodPractice {

	// Methods you write can go here

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Methods we write do not go here
		// We call the methods here

		// this is how we call non-static methods
		// we need to create an object of the class type to chain it to
		MethodPractice testMethod = new MethodPractice();
		testMethod.sayHello();
		System.out.println(checkSeven(7, "Antonella"));

		// static methods don't need to be chained to an object if they are located in
		// the main method
		System.out.println(sayHelloName("Grant Chirpus"));
		
		// Methods that have a return value like String allow us to assign them to a
		// variable of the same type to be used later
		String testingName = sayHelloName("Antonella");
		System.out.println(testingName);
		//System.out.println(addNums(3,4));
		int addedNumbers = addNums(3,4);

		System.out.println(addedNumbers * 3);
		int mult5 = addedNumbers * 5;
		
		
		System.out.println();
		System.out.println("Please enter a number: ");
		int userNum1 = scan.nextInt();
		System.out.println("Please enter a number: ");
		int userNum2 = scan.nextInt();
		System.out.println(addNums(userNum1, userNum2));
		
		System.out.println("Please enter a word");
		String userWord = scan.nextLine();
		
		System.out.println(addIng(scan));
		System.out.println(addIng("Develop"));
		
		// overloaded print example
		System.out.println("Please enter a number to demonstrate overloading: ");
		int overload = scan.nextInt();
		System.out.println(addNums(overload, 5));
		
	}

	// Methods you write can go here

	// 5 Steps for writing methods
	// 1. visibility modifier: where the method can be seen (Ex. public or private)
	// 2. static or nothing (if not static we need to create an object to use it)
	// 3. return type: should match what you need to return if nothing use void
	// 4. method name: should be a verb to show action
	// 5. parameter list: things needed in the method, can be blank

	// this is an example of a non-static method
	public void sayHello() {
		System.out.println("Hello");

	}

	// this is an example of a static method
	public static String sayHelloName(String userName) {

		return "Hello, " + userName;
	}

	private static boolean checkSeven(int num, String name) {
		if (num == 7 && name.equalsIgnoreCase("Antonella")) {
			return true;
		}

		return false;
	}
	
	// Method Challenge #1 
	// create an int method that takes in two int values and adds them together
	
	public static int addNums(int num1, int num2) {
		
		int add = num1 + num2;
		System.out.println("Testing that this method is working ");
		return add;
	}
	
	// Method Challenge # 2 
	// create a String method that takes in a string from the scanner and adds ing to the end
	public static String addIng(String word) {
		return word+ "ing";
	}
	
	public static String addIng(Scanner scnr) {
		System.out.println("Please enter a word: ");
		String word = scnr.nextLine();
		return word + "ing";
	}
	
	
	// Method overloading examples
	// 1. To overload must have same name an type
	// 2. Must have one of the differences listed below to qualify
	//    a. Different parameters types
	//    b. Different parameter order
	//    c. Different # of parameters
	
	public static int testOverload(int num1, int num2) {
		
		return num1 * num2;
	}
	
	// this is the overloaded method
	// this works because the parameter types are different than the ones above
	public static int testOverload(int num3, String name) {
		return 0;
	}
	
	// Method Challenge #3 Overloading
	public static int addNums(int num) {
		int randomNum = (int) (Math.random() * 101); // generate a number from 0 - 100
		return num + randomNum;
	}
	

}
