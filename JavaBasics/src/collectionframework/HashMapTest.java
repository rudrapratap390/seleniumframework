package collectionframework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String,String>	map = new HashMap<String,String>();
		
		map.put("Name", "Rudra");
		map.put("Sex", "Male");
		System.out.println(map);
		System.out.println(map.get("Name"));
		System.out.println(map.get("Sex"));
		map.put("Name", "Don");
		System.out.println(map.get("Name"));
		System.out.println(map.get("Sex"));
		System.out.println(map);
		
		//Search 
		
		if(map.containsKey("Age")) {
			
			System.out.println("exist");
		} else
			System.out.println("does not exist");
		
		System.out.println(map.get("country"));
		
		int[] arr = {1,2,3,4,5};
		
		for(int a:arr) {
			
			System.out.println(a);
		}
		
		/*for(Map.Entry<String, String> entry: map.entrySet()) {
			
			System.out.println(entry.getKey() +  entry.getValue());
			
		}*/

	}

}
