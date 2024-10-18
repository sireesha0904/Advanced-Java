
//Using the Thread Class: Thread(Runnable r, String name)
public class MyThread implements Runnable {
    public void run() {
        System.out.println("This thread is running");
    }

    // main method  
    public static void main(String[] args) {
        //creating an Object of class 
        Runnable r = new MyThread();
        // creating an object of the class Thread using Thread(Runnable r, String name)  
        Thread t = new Thread(r, "MyThread");
        t.start();// the start() method moves the thread to the active state 

        String str = t.getName();// getting the thread name by invoking the getName() method  
        System.out.println(str);
    }
}
