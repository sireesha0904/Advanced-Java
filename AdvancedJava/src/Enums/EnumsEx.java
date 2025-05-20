package Enums;

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,SATURDAY; 
}
public class EnumsEx {

	public static void main(String[] args ) {
		
		Day today = Day.MONDAY;
		
		System.out.println(today);
		System.out.println(Day.TUESDAY);
		
		if(today == Day.MONDAY) {
			System.out.println("Start of the work week!");
		}
		
	}
}
