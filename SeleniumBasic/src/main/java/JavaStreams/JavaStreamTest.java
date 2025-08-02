package JavaStreams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamTest {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<>();
		
		name.add("Alex");
		name.add("Arjun");
		name.add("Abhi");
		name.add("Don");
		name.add("Sona");
		int count = 0;
		
		
		for(int i = 0 ; i<name.size(); i++) {
			
			if(name.get(i).startsWith("A")) {
				
				count++;
			}
			
		}
		
		System.out.println(count);
		
		//Stream operation
		//lambda function
		
		long countStream = name.stream().filter(s->s.startsWith("A")).count();
		
		System.out.println(countStream);
		
		//Stream.of("Alok","Johnny","Don","Michaael").filter(s -> s.length() >= 4).forEach(s -> System.out.println(s));
	//	Stream.of("Alok","Johnny","Don","Michaael").filter(s -> s.length() >= 4).filter(s->s.contains("Al")).forEach(s->System.out.println(s));
		//map method is used to modify stream 
	//	Stream.of("Alok","Johnny","Don","Michaael").map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	//	List<String> names = Arrays.asList("Alok","Johnny","Don","Michael","Ann");
		
	//	names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	//	Stream.of("Alok","Johnny","123","DON").filter(s->s.matches("[A-Z]")).forEach(s->System.out.println(s));
		
		//merge 2 list , sort it and print
		
		ArrayList<String> nameList = new ArrayList<>();		
		nameList.add("Alex");
		nameList.add("Arjun");
		nameList.add("Abhi");
		nameList.add("Don");
		nameList.add("Sona");
		
		List<String> countryList =	Arrays.asList("India","UK");
		
	   Stream.concat(nameList.stream(), countryList.stream()).forEach(s->System.out.println(s));
	   
	   boolean flag = countryList.stream().anyMatch(s->s.equalsIgnoreCase("India"));
	   System.out.println(flag);
	   
	   List<String> converetdList = nameList.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
	   System.out.println(converetdList.get(2));
	   
	   //find unique numbers in an array and sort it
	   Integer[] numbers = {1,3,2,2,5,7,6,6,9,2,4};
	//Arrays.asList(numbers).stream().distinct().sorted().forEach(s->System.out.println(s));;
	  List<Integer> convertedList =  Arrays.asList(numbers).stream().distinct().sorted().collect(Collectors.toList());
	  System.out.println(convertedList);
	
	
	
	
		

	}

}
