package Enums;

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,SATURDAY; 
}
public class EnumsEx {

	public static void main(String[] args ) {
		
		Day today = Day.TUESDAY;
		
		System.out.println(today);
		System.out.println(Day.MONDAY);
	}
}
