import java.math.BigDecimal;

public class BigDecimalEx {

	public static void main(String[] args) {
		System.out.println(0.2 + 0.7);

		BigDecimal b = new BigDecimal("203.47"); // this is just an example to show how to declare a BigDecimal
		System.out.println(new BigDecimal("0.2").add(new BigDecimal("0.7"))); // this will return the proper result
		double d = 0.7;
		System.out.println(new BigDecimal("0.2").add(new BigDecimal(d))); // this will not return the right result based
																			// off of the variable -- the fix is part of
																			// the code challenge

	}

}
