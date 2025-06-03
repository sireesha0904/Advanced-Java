 package Complexity;
// Print all elements of an array
public class LinearComplexity {

	public static void main(String[] args) {
		String[] courses = {"Java", "Angular", "ReactJs", "Python"};
		System.out.println("List of Courses Available ");
		for(String s : courses) {
			System.out.println(s);
		}
	}
}

//Time complexity is O(n) and Space complexity O(1)
