package Basics;
import java.util.Scanner;

public class CompoundIntrestCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal;
        double rate;
        int time;
        int frequency;
        double amount;

        System.out.print("Enter Initial amount you invest or deposit (Principal): ");
        principal = sc.nextDouble();

        System.out.print("Annual interest rate (in %): ");
        rate = sc.nextDouble();

        System.out.print("Time period in years: ");
        time = sc.nextInt();

        System.out.print("Number of times interest is compounded per year: ");
        frequency = sc.nextInt();

        // Correct formula with rate converted to decimal
        amount = principal * Math.pow(1 + (rate / 100) / frequency, frequency * time);

        System.out.println("The Amount after " + time + " years is Rs. " + amount);

        sc.close();
    }
}
