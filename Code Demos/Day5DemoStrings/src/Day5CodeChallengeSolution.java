import java.util.Scanner;

/*
 * 
Given an "out" string length 4, such as "<<>>", 
and a word, return a new string where the word 
is in the middle of the out string, e.g. "<<word>>".
Note: use str.substring(i, j) to extract the 
String starting at index i and going up to but not including index j.


makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
 * 
 */
public class Day5CodeChallengeSolution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a repeating pattern of characters (max length 4): ");
		String out = scan.nextLine();
		System.out.println("Please enter a word: ");
		String word = scan.nextLine();

		System.out.println(makeOutWord(out, word));
		scan.close();

	}
	public static String makeOutWord(String out, String word) {
		  String begin = out.substring(0,2); // evaluates to <<
		  String end = out.substring(2,out.length()); // evaluates to >>
		  
		return begin + word + end;
	}
}
