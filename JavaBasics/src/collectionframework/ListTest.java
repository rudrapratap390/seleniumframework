package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		//create an interger array
		//convert to list 
		//iterate
		
		int[] a = new int[3];
		a[0]=1;
		a[1]=1;
		a[2]=1;
		System.out.println(a);
		
		
   Integer[] nums = {1,2,3,4,5};	
	 
	List<Integer> numbers = new ArrayList<>();
	numbers = Arrays.asList(nums);
	
	/*
	 * numbers.add(1); numbers.add(3); numbers.add(2); numbers.add(2);
	 * numbers.add(null);
	 */
	for (int i = 0; i<numbers.size(); i++) {
		
		System.out.println(numbers.get(i));
		
	}
	
	Iterator<Integer> it = numbers.iterator();
	
	while(it.hasNext()) {
		
		System.out.println(it.next());
	}
		

	}

}
