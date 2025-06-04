package DSA.Arrayproblems;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // Forward Traversal
        System.out.println("Forward Traversal:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }

        // Reverse Traversal
        System.out.println("Reverse Traversal:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }
}

