
public class ArrayDemo3 {

	public static void main(String[] args) {

		double[] prices = { 3.99, 4.05, 2.50, 1.99 };

		// getSum(prices); 
		System.out.println(getSum(prices));

	}

	public static double getSum(double[] prices) {
		double sum = 0.0;
		for (int i = 0; i < prices.length; i++) {
			sum = sum + prices[i];

		}
		// this line was added to show that you can put print statements inside of
		// methods that have a return type and it will still print
		System.out.println("This is a test to make sure this is working");
		return sum / prices.length;
	}

}
