package test;

public class SeleniumTest {

	public static void main(String[] args) {
	
		String str = "Please use temporary password 'rahulshettyacademy' to Login.";
		String[] str1 = str.split("'");
		
		System.out.println(str1.length);
		System.out.println(str1[0]);
		System.out.println(str1[1]);
		System.out.println(str1[2]);

	}

}
