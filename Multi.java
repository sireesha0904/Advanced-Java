
 //Java Thread Example by implementing Runnable interface
class Multi implements Runnable {
    public static void main(String[] args) {
        Multi m = new Multi();
        Thread t = new Thread(m);  // Using the constructor Thread(Runnable r)  
        t.run();
    }
    
    public void run() {
        System.out.println("This is a running thread");
    }
}
