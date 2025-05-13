package Arrays;

public class SearchElem {

	public static void main(String[] args) {
		
		int numbers[] = {5,6,15,10,14,8,9};
		int target = 10;
		boolean isFound = false;
		
		for(int i=0; i<numbers.length; i++) {
			if(target == numbers[i]) {
				System.out.println("Number found at index : "+ i);
				isFound = true;
				break;
			}
		}
		if(isFound) {
			System.out.println("Invalid Number");
		}
	}
}
