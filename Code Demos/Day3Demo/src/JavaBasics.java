
public class JavaBasics {

	public static void main(String[] args) {
		final String TEST = "hello";
		// TEST = "no"; we cannot do this - the constant cannot be reassigned
		
		final int TESTINT = 4;
		
		// primitive type declarations
		byte b = 127;
		short s = 32767;
		int i = 13333;
		float fl = 6.7F; // can use lowercase f
		double d = 5.6667;
		char c = 'c';
		boolean bool = true;
		long l = 12343534535L; // can use lowercase l
		
		// implicit conversion examples
		int numOfItems = 5;
		System.out.println(3.0/1.5);
		System.out.println(3.0/2);
		System.out.println((numOfItems + 10) / 2);
		System.out.println((numOfItems + 10) / 2.0);
		
		// explicit casting (type casting)
		double x = (double) 3/ (double) 5;
		double x1 = (double) (3/5); // prints 0.0 because division is done before casting
		System.out.println(x);
		System.out.println(x1);
		
		// example 2 -- common error forgetting to cast
		int kidsInFamily1 = 3;
		int kidsInFamily2 = 4;
		int numOfFamilies = 2;
		
		double avgKidsPerFamily = (double)(kidsInFamily1 + kidsInFamily2) / numOfFamilies;
		
		System.out.println(avgKidsPerFamily);
		
		
		
	}

}
