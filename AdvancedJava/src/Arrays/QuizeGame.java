package Arrays;

import java.util.Scanner;

public class QuizeGame {

    public static void main(String[] args) {

        // QUESTIONS array[]
        String[] ques = {
            "1. What is the size of an int variable in Java?",
            "2. Which keyword is used to inherit a class in Java?",
            "3. What is the default value of a boolean variable in Java?",
            "4. Which of the following is not a Java keyword?",
            "5. Which method is the entry point of any Java program?"
        };

        // OPTIONS array[][]
        String[][] options = {
            {"A) 2 bytes", "B) 4 bytes", "C) 8 bytes", "D) Depends on the system"},
            {"A) this", "B) import", "C) extends", "D) implements"},
            {"A) true", "B) false", "C) 0", "D) null"},
            {"A) static", "B) try", "C) Integer", "D) new"},
            {"A) start()", "B) main()", "C) run()", "D) init()"}
        };

        // Correct answers
        String[] ans = {"B", "C", "B", "C", "B"};

        // Variables
        int score = 0;
        String guess;

        Scanner sc = new Scanner(System.in);

        // Welcome Message
        System.out.println("WELCOME TO THE QUIZ GAME! ENJOY!!");
        System.out.println("**********************************\n");

        // Quiz Loop
        for (int i = 0; i < ques.length; i++) {
            System.out.println(ques[i]);

            for (int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            guess = sc.next().toUpperCase();  // convert input to uppercase

            if (guess.equals(ans[i])) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Incorrect! Correct answer: " + ans[i] + "\n");
            }
        }

        // Final Score
        System.out.println("**********************************");
        System.out.println("Your final score is: " + score + " out of " + ques.length);
        System.out.println("Thank you for playing!");
        System.out.println("**********************************");

        sc.close();
    }
}
