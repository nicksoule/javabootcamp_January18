
public class DoWhileEx {

	public static void main(String[] args) {
		
		int i = 1;
		int month = 36;
		double futureValue = 0;
		double monthlyPmt = 330.63;
		double intRate = 5.99/100;
		
		// the do loop will always execute at least once
		do {
			
			futureValue = (futureValue + monthlyPmt) * (1 + intRate);
			i++;
			
		} while (i <= month);
		
		System.out.println(futureValue);

	}

}
