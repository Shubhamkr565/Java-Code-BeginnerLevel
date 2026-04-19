package multithreading;

class myThread implements Runnable{
    public void run(){
        System.out.println("Download Started...");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Download Completed...");
    }
}



public class Download {
    public static void main(String[] args) throws InterruptedException{
        myThread m1 = new myThread();

        Thread t1 = new Thread(m1);

        t1.start();

        while(t1.isAlive()){
            System.out.println("Downloading... Please wait");

            Thread.sleep(1000);
        }
        System.out.println("Now you can Open the file.");
        t1.join();
    }
    
}
