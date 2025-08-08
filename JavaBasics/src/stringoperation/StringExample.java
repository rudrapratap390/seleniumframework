package stringoperation;

import java.util.ArrayList;
import java.util.List;

public class StringExample {

	public static void main(String[] args) {
	
		
		  String str1 = "Hello";
		  
		  System.out.println(str1.substring(1));
		  
		  System.out.println(str1);
		  
		  System.out.println(str1.substring(1, 3));
		  
		  // System.out.println("Last index " + str1.lastIndexOf(str1)); //
		  System.out.println("First index " + str1.indexOf(str1));
		  
		  if(str1.equals("Hello")) {
		  
		  System.out.println("value mtched");
		  
		  }
		  
		  System.out.println(str1.contains("llo"));
		  
		  System.out.println(str1.startsWith("Hel"));
		  
		  String str2 = "Hello World there";
		  
		  System.out.println( str2.split(" ")[1]); String arr[] = str2.split(" ");
		  
		  System.out.println(arr[2]);
		  
		  System.out.println(str2);
		  
		  
		  //reverse a string
		  
		  String str3 = "Hello"; StringBuilder sb = new StringBuilder(str3);
		  System.out.println(sb); System.out.println(sb.reverse());
		  System.out.println(sb);
		 
	    
	    //using char arry
	    String str4 = "Hello";
	    //5
	    //4
	    char[] arrChar = str4.toCharArray();
	    
        String revArr = "";
	    for(int i = arrChar.length - 1; i >= 0 ;i--) {
	    	
	    	//4 - o
	    	//3 - l
	    	//2 - l
	    	//1 - e
	    	//0
	    	
	    	System.out.println(arrChar[i]);
	    	revArr = revArr + arrChar[i];
	    	    	
	    }
	    
	    System.out.println(revArr);
	    
//	    System.out.println("Reversed string " + rev);
	    
	    
	    
	  
	    
		
		
		
	}

}
