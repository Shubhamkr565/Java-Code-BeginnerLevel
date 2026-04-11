package multithreading;

public class MyRunnable implements Runnable {
    public void run(){
        for(int i=20; i<40; i++){
            System.out.println("Inside run() of MyRunnable: ");
        }
    }
    public static void main(String[] args){
        MyRunnable m1 = new MyRunnable(); // Create runnable object
        Thread t1 = new Thread(m1); // pass Runnable object to Thread
        t1.start();     // Start thread

        // main thread functionallity
        for(int i=20; i<40; i++){
            System.out.println("Inside main(): ");
        }
    }
}
