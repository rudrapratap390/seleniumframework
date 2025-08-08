package test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		//array list - dynamic array 
		// item can accessed randomly
		// size increases and decreases automatically
		    
		 ArrayList<String> al = new ArrayList<>();
		 	
		
		 
		 al.add("welcome");
		 al.add("to");
		 al.add("collection framework");
		 al.add(0, "Hello");
		 
		System.out.println(al);
		
		//al.remove(0);
		
		//System.out.println(al);
		
		for(int i = 0 ; i < al.size(); i++) {
			
			System.out.println(al.get(i));
			
		}
		

	}

}
