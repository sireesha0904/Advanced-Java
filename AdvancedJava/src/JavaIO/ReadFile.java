package JavaIO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            // Step 1: Point to the file
            FileReader fr = new FileReader("output.txt");
            
            // Step 2: Wrap with BufferedReader for easier reading
            BufferedReader br = new BufferedReader(fr);
            
            // Step 3: Read each line
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
            // Step 4: Close readers
            br.close();
            fr.close();
            
        } catch (IOException e) {
            System.out.println("Could not read the file: " + e.getMessage());
        }
    }
}
