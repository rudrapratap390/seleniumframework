package test;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateTest {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println(date.toString());
		
		SimpleDateFormat dateSimple1 = new SimpleDateFormat("MM/dd/yyyy");
		
		String formattedDate1 = dateSimple1.format(date);
		
		SimpleDateFormat dateSimple2 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		String formattedDate2 = dateSimple2.format(date);
		
		System.out.println(formattedDate1);
		
		System.out.println(formattedDate2);
		
		
		
		
	}

}
