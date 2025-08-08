package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<>();
		
		hm.put(1, "hello");
		hm.put(2, "there");
		hm.put(null, "Java");
		hm.put(null, "Python");
		hm.put(3, null);
		hm.put(4, null);
		System.out.println(hm);
		
		//Iterator<E> itr = hm.entrySet().iterator();
		
		for (Map.Entry<Integer, String> e : hm.entrySet()) {
			
			System.out.println(e.getKey() + e.getValue());
			
		}
		
		
		

	}

}
