package String;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming");             // Java Programming
        sb.insert(0, "Welcome to ");           // Welcome to Java Programming
        sb.replace(11, 15, "Python");          // Welcome to Python Programming
        sb.delete(0, 11);                      // Python Programming
        sb.reverse();                          // gnimmargorP nohtyP

        System.out.println(sb);                // Output: gnimmargorP nohtyP
    }
}
