package multithreading.StudentTask.jionMethod;

public class ThreadB extends Thread {
    ThreadA t1;

    ThreadB(ThreadA t1){
        this.t1 = t1;
    }

    @Override
    public void run(){
        try{
            t1.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + " is running "+ i);
        }
    }
}
