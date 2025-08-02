import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertionsTest {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 3;
		//hard assertion
	//	Assert.assertEquals(b,a);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(b, a);
		int sum = a +  b;
		System.out.println(sum);
		
		sa.assertAll("Test execution failed");
//demo 
		
	}

}
