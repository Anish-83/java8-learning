package Day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CollectionPractice {
	public static void main(String args[]) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		
		names.forEach(name -> System.out.println("Name: " + name));
		
		
		
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("Alice", 12);
		hm.put("Bob", 16);
		hm.put("Charlie", 13);
		
		hm.forEach((k,v) -> System.out.println(k+" is "+v+" years old."));
		
		
		HashSet<Integer> hs= new HashSet<>();
		
		hs.add(12);
		hs.add(16);
		hs.add(13);
		
		hs.forEach( v -> System.out.println("Value::"+v));
		
	}
}
