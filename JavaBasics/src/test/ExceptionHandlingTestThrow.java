package test;

public class ExceptionHandlingTestThrow {
	
	static void demo() throws IllegalAccessException{
		
		System.out.println("inside demo method");
		throw new IllegalAccessException();
	}

	public static void main(String[] args) {
		
		try {
			demo();
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
		}
		
		try {
			
			System.out.println("inside try");
			throw new ArrayIndexOutOfBoundsException("Dummy exception");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("inside catch");
			e.printStackTrace();
			
		}finally {
			
			System.out.println("inside finally");
		}
		

	}

}
