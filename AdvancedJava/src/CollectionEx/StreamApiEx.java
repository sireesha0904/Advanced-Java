package CollectionEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiEx {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
	
		// instead of loop we can use this 
		
		list.stream() 
		.filter(n -> n%2==0)
		.map(n -> n*2)
		.forEach(System.out::println);
		
		
		// Using Stream
//		int sum = 0;
//		for(int n : list) {
//			if(n%2==0) {
//				n = n*2;
//				sum = sum+n;
//			}
//		}
		
	}
}
