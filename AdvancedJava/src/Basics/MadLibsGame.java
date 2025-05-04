package Basics;
import java.util.Scanner;

public class MadLibsGame {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String adj;
		String animal;
		String place;
		String verb;
		String noun;
		
		
		System.out.print("Adjective ");
		adj = sc.nextLine();
		System.out.print("Animal ");
		animal = sc.nextLine();
		System.out.print("Place ");
		place = sc.nextLine();
		System.out.print("Verb ");
		verb = sc.nextLine();
		System.out.print("Noun ");
		noun = sc.nextLine();
		
		System.out.println("Today I saw a " + adj + " " + animal + " at the " + place + ".");
		System.out.println("It was trying to " + verb + " a " + noun + "!");

	}
}
