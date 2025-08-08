package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String>  hs = new HashSet<>();
		//insert
		hs.add("hello");
		hs.add("hello");
		hs.add("World");
		
		
		
		Iterator<String> itr = hs.iterator();
		
		// Iterator itr = hs.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		

	}

}
