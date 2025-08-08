package test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	
	// can not store duplicate values
	// sequnce is not maintained 

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		
		hs.add("hello");
		hs.add("welcome");
		hs.add("to");
		hs.add("Java");
		
		System.out.println(hs);
		
		Iterator<String> itr = hs.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
	}

}
