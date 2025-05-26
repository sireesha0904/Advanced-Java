package CollectionEx;

import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.Collection;
import java.util.List;

public class ListInterfaceEx {

	public static void main(String[] args) {
//		
//		List<Integer> list = new ArrayList<>();
//		list.add(5);
//		list.add(10);
//		list.add(2);
//		
//		for(int l : list) {
//			System.out.println(l);
//		}
//		
//		System.out.println("Value at index 0 : "+list.get(0));
//		list.add(1,15);
//		System.out.println("After Insertion : "+list);
		
		
		List<String> s = new LinkedList<String>();
		s.add("Java");
		s.add("Python");
		s.addFirst("C");
		s.add("Java");  // duplicate allowed 
		s.addLast("Ruby");
		
		for(String str : s) {
			System.out.println("LinkedList : "+str);
		}
	
		System.out.println("Get String at index 2 : "+s.get(2));
	}
}
