package test;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExmaple {

	public static void main(String[] args) {

		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(1);
		lhs.add(2);
		lhs.add(2);
		
		System.out.println(lhs);
		
		Iterator<Integer> itr = lhs.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
	}

}
