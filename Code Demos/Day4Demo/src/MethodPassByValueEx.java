
public class MethodPassByValueEx {

	public static void main(String[] args) {
		// Java is pass by value therefore the original variables will maintain their
		// original state after being passed into the method unless they are reassigned
		int myNum = 8;

		System.out.println("myNum before being passed into the method: " + myNum);
		System.out.println("This is the return from the method: " + modifyNum(myNum));
		System.out.println("myNum after being passed into the method: " + myNum); // showing that it maintains the
																					// original state

		myNum = modifyNum(myNum); // example showing it will only change if reassigned
		System.out.println(myNum);

		System.out.println(feedModifyNum(15));

	}

	public static int modifyNum(int num) {
		// int newNum = feedModifyNum(15);
		return feedModifyNum(num);
	}

	public static int feedModifyNum(int num) {
		return num * 5;
	}

}
