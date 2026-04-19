package multithreading.GettingSetting;


class newThread implements Runnable{
    public void run(){
        for(int i=0; i<20; i++){
            String tName = Thread.currentThread().getName();
            System.out.println(tName+ " is running....");
        }
    }
}

public class RunThread {
    public static void main(String[] args){
        newThread job = new newThread();

        Thread one= new Thread(job, "My Thread-A:");
        Thread two = new Thread(job, "My Thread-B:");

        one.start();
        two.start();
    }

}
