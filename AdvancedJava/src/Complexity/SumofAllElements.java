package Complexity;

class Add{
public static int add(int[] arr) {
	int sum = 0;
	for(int i = 0; i<arr.length; i++) {
		sum += arr[i];
	}
	return sum;
			
}
}
public class SumofAllElements {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		int res = Add.add(arr);
		System.out.println(res);
	}
}
