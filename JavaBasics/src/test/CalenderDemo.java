package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		
		
	Calendar calendar = Calendar.getInstance();
	SimpleDateFormat dateSimple1 = new SimpleDateFormat("MM/dd/yyyy");
	
	System.out.println(dateSimple1.format(calendar.getTime()));
	
	System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

	}

}
