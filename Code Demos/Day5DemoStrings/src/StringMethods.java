import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		String hello = "Hello";
		hello = hello + " World"; // Hello World
		System.out.println(hello);

		String hello2 = "Hello";
		hello2 = hello2.concat(" World");
		System.out.println(hello2);

		boolean checkEqual = hello.equalsIgnoreCase(hello2);

		if (checkEqual) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equal");
		}

		char character = hello.charAt(1);
		System.out.println(character);

		String newChar = Character.toString(character); // example casting a character to a string

		System.out.println(hello.length());

		System.out.println(hello.indexOf("l"));
		System.out.println(hello.lastIndexOf("l"));

		System.out.println(hello.endsWith("world"));

		System.out.println(hello.replace('l', '5'));

		String[] helloArr = hello.split(" ");
		System.out.println(Arrays.asList(helloArr));

		System.out.println(hello.substring(7, 10)); // the end is not exclusive
		System.out.println(hello.substring(7)); // if you use this it will take everything thing from the specified
												// index to the end of the string

		System.out.println(hello.toLowerCase());
		System.out.println(hello.toUpperCase());

		String test = "      y      ";
		System.out.println(test.length());
		System.out.println(test.trim().length()); // used the trim method to strip the whitespace and because trim()
													// returns a string I can chain the length() method to it to test
													// the accuracy

	}

}
