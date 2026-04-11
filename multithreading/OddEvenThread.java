package multithreading;

class OddRunnable implements Runnable{
    public void run(){
        for(int i=0; i<20; i++){
            if(i%2!=0){
                System.out.println("Odd: "+ i);
            }
        }
    }
}

class EvenRunnable implements Runnable{
    public void run(){
        for(int i=2; i<20; i++){
            System.out.println("Even: "+i);
        }
    }
}

public class OddEvenThread {
    public static void main(String[] args){
        OddRunnable odd1 = new OddRunnable();

        EvenRunnable even1 = new EvenRunnable();

        Thread t1 = new Thread(odd1);
        Thread t2 = new Thread(even1);

        t1.start();
        t2.start();
    }
}
