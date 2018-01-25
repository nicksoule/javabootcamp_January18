
public class ContinueEx {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int randomNum = (int) (Math.random() * 10); // generate a number from 0 - 9
			
			if (randomNum > 7) {
				System.out.println("Hey, this # is greater than 7 -- go to the top of the loop!");
				continue;
			}
			
			System.out.println(randomNum);
		}

	}

}
