package MultiThreading;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);  // Setting the thread's name
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " (Priority: " + Thread.currentThread().getPriority() + ") - Step " + i);
            try {
                // Sleep for 500 milliseconds after each step
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Creating threads
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        // Setting priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        thread2.setPriority(Thread.NORM_PRIORITY); // Priority 5 (Default)
        thread3.setPriority(Thread.MAX_PRIORITY); // Priority 10

        // Starting the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Yielding the current thread
        Thread.yield(); // Suggests the current main thread to give a chance to other threads to execute.

        try {
            // Wait for thread1 and thread2 to finish
            thread1.join();  // Ensures that main thread waits for thread1 to finish
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished waiting for thread1 and thread2.");

        try {
            // Let the main thread sleep for 2 seconds
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread execution complete.");
    }
}
