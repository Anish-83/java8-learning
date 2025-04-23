package Day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
	public static void main(String args[]) {
		
//1.		IntStream.range(1, 11).forEach(System.out::print);
		
//2.		IntStream.range(1,10)
//			.skip(5)
//			.forEach(i->System.out.println(i));
		
		
//3.		System.out.println(IntStream.range(1,10)
//			.skip(5).sum());
		
//4.		Stream.of("Alice","Bob","Charlie")
//		    .sorted()
//			.findAny()
//			.ifPresent(System.out::print);
	
//5.		String[] names= {"Alice","Bob","Charlie","Alan","John","Alex"};
//			Arrays.stream(names)
//			.filter(x->x.startsWith("Al"))
//			.sorted()
//			.forEach(System.out::println);
		
//6.	Arrays.stream(new int [] {2,3,4,5})
//		.map(x->x*x)
//		.average()
//		.ifPresent(System.out::print);
	
//7.		List<String> names = Arrays.asList("Alice","Bob","Charlie","Alan","John","Alex");
//		
//			names.stream()
//			.map(String::toLowerCase)
//			.filter(x->x.contains("al"))
//			.forEach(System.out::println);
		
		List<String> names = Arrays.asList("Alice","Bob","Charlie","Alan","John","Alex");
		names.stream().map(String::toUpperCase).collect(Collectors.toList());
		names.stream().filter(s -> s.length() > 5).forEach(System.out::println);




		
	}
}
