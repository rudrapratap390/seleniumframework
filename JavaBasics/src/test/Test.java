package test;

public class Test {
	
	public static final void main(String...strings) {
		
	
		
		System.out.println("hello world.");
		
		// calling the overlloaded method
		
		main();
		main(new Double[] {1.0, 2.0, 3.0});

	}

	/*
	 * public static void main(String[] abc) {
	 * 
	 * System.out.println(abc.length);
	 * 
	 * System.out.println("hello world.");
	 * 
	 * // calling the overlloaded method
	 * 
	 * main(); main(new Double[] {1.0, 2.0, 3.0});
	 * 
	 * }
	 */
	// main method is overloaded 
	
	public static void main() {
		
		
		
		System.out.println("overloaded method");

	}
	
	public static void main(Double[] args) {
        System.out.println("Double[] args main method called");
            }


}
