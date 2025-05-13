package Arrays;
 //Looping through an Array

public class LoopArrays {

	public static void main(String[] args) {
		
		String courses[] = {"Java", "Spring", "React", "Angular", "Python"};
		
//		for(int i=0; i<courses.length; i++) {
//			System.out.println(courses[i]);
//		}
		
		
		for(String cour : courses) {
			System.out.println(cour);
		}
	}
}
