package CollectionEx;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;

public class ListInterfaceEx {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(10);
		list.add(2);
		
		for(int l : list) {
			System.out.println(l);
		}
		
		System.out.println("Value at index 0 : "+list.get(0));
		list.add(1,15);
		System.out.println("After Insertion : "+list);
		
	}
}
