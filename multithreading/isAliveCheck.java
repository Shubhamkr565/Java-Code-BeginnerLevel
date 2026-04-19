package multithreading;


class isAliveThread implements Runnable{
    public void run(){
        for(int i=0; i<20; i++){
            String tName = Thread.currentThread().getName();

            System.out.println(tName+ " is running....");
        }
    }
}

public class isAliveCheck {
    public static void main(String[] args){
        isAliveThread obj = new isAliveThread();

        Thread t1 = new Thread(obj); // Thread

        System.out.println("Before start(): " + t1.isAlive());

        t1.start();

        System.out.println("After start(): " + t1.isAlive());
    }

        
    
}
