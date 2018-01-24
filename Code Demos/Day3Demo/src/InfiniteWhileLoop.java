
public class InfiniteWhileLoop {

	public static void main(String[] args) {
		
		// this code will continue endlessly unless I add a stop condition
		
		while (true) {
			int randomNum = (int)(Math.random() *10); // this will generate a number from 0-9
			
			System.out.println(randomNum);
			
			if(randomNum == 7) {
				System.out.println("7 has been found -- exit loop");
				break;
			}
			
		}

	}

}
