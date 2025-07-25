package DSA.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subset {
public static void generate(int index, int[] arr, List<Integer> curr, List<List<Integer>> res) {
	if(index == arr.length) {
		   res.add(new ArrayList<>(curr));
		   return;
	}
	curr.add(arr[index]);
	generate(index + 1, arr, curr, res);
	
	curr.remove(curr.size()-1);
	generate(index + 1, arr, curr, res);
}
	public static void main(String[] args) {
		
		  List<List<Integer>> result = new ArrayList<>();
		int[] a = {1,2,3};
		generate(0, a, new ArrayList<>(), result);
		System.out.println("All subsets: " + result);
	}
}
