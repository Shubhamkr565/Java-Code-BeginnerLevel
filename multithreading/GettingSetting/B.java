package multithreading.GettingSetting;

class ThreadA implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<20; i++){
            String tname = Thread.currentThread().getName();
            System.out.println(tname +" is running...."); 
        }
    }
}

class ThreadB implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<20; i++){

        String tname = Thread.currentThread().getName();
        System.out.println(tname +" is running....");
        }
    }
}




public class B {
    public static void main(String[] args){
        ThreadA ta = new ThreadA();
        ThreadB tb = new ThreadB();

        Thread t1 = new Thread(ta, "My Thread-A ");
        Thread t2 = new Thread(tb, "My Thread-B ");

        t1.start();
        t2.start();
    }
}
