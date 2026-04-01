package multithreading;

class MyThread1 extends Thread{
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println("Thread 1: "+ i);
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println("Thread 2: "+i);
        }
    }
}

public class Thread2 {
    public static void main(String[] args){
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        
        t1.start();
        t2.start();
    }
}
