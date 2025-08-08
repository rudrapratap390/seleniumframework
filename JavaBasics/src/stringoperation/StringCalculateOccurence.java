package stringoperation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StringCalculateOccurence {

	public static void main(String[] args) {

		String str = "HelloWorld";

		char[] charArr = str.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c:charArr) {
			
			map.put(c, map.getOrDefault(c,0) + 1 );
			// h 1
			// e 2
			
			
		}
		
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		/*
		 * ArrayList<Character> list = new ArrayList<>();
		 * 
		 * 
		 * 
		 * for(int i=0; i<charArr.length;i++) {
		 * 
		 * // System.out.println(charArr[i]);
		 * 
		 * // hm.put(i, charArr[i]);
		 * 
		 * list.add(charArr[i]); //H int counter = 0 ; for (int j= i+1
		 * ;j<charArr.length-1;j++) {
		 * 
		 * //H - e //e - l // l - l if(list.contains(charArr[j])) { counter++; } else {
		 * break; }
		 * 
		 * // System.out.println(charArr[i] + "is present " + counter + " times");
		 * 
		 * }
		 * 
		 * System.out.println(charArr[i] + " is present " + counter + " times"); }
		 * 
		 * 
		 * System.out.println(hm);
		 * 
		 * for(Map.Entry<Integer,Character> entry: hm.entrySet()) {
		 * 
		 * char hmVal = entry.getValue();
		 * 
		 * }
		 * 
		 * //
		 */
	}

}
