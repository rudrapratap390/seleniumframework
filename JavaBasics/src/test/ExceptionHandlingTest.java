package test;

public class ExceptionHandlingTest {

	public static void main(String[] args) {
	
		try{
			
			System.out.println("inside try");
			
			int num = 10 /0;
			
		}catch(Exception e){
			
			System.out.println("inside catch");
			//System.out.println(e.getMessage());
			e.printStackTrace();
			
		}finally {
			
			System.out.println("inside finally");
		}
		

	}

}
