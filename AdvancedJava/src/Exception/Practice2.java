package Exception;

public class Practice2 {

    public static void main(String[] args) {
        int num[] = {1, 5, 11, 8, 9}; // cleaner way to initialize

        try {
        	System.out.println("Number at index 2 : "+num[2]);
            System.out.println(num[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index error! " + e.getMessage());
        }
    }
}
