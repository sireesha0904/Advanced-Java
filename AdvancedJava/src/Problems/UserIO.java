package Problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class UserIO {

    public static void main(String[] args) throws IOException {
        
        System.out.println("Enter a number here: ");
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        String input = bf.readLine();         // Read input as String
        int num = Integer.parseInt(input);    // Convert to int
        
        System.out.println("You entered: " + num);
        
        bf.close();
    }
}
