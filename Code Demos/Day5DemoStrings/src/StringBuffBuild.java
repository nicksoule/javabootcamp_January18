
public class StringBuffBuild {

	public static void main(String[] args) {

		// example of how to loop through a string below
//		String testing = "Abcdefghijklm";
//		
//		for (int i = 0; i < testing.length() ; i++) {
//			System.out.println(testing.charAt(i));
//		}
		
		StringBuffer sb = new StringBuffer(); // if not initialized with a value has a default size of 16
		StringBuffer sb2 = new StringBuffer();
		
		System.out.println(sb.capacity());
		sb.append("This is a test to see how this works");
		System.out.println(sb.capacity()); 
		System.out.println(sb.length());
		sb.append("Hello World");
		System.out.println(sb.reverse().toString().toLowerCase());
		
		System.out.println();
		System.out.println("This starts the StringBuilder");
		StringBuilder sb3 = new StringBuilder();
		System.out.println(sb3.capacity());
		sb3.append("This is a test to see how this works");
		System.out.println(sb3.capacity()); 
		System.out.println(sb3.length());
		sb3.append("Hello World");
		System.out.println(sb3.reverse().toString().toLowerCase());

	}

}
