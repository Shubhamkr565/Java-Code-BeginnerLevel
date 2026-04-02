package multithreading;

class EvenNumber implements Runnable{
    public void run(){
        for(int i=1; i<=10; i++){
        if(i%2==0){
            System.out.println(Thread.currentThread().getName() + " -> Even: " + i);
        }
    }
    }
    
}

class OddNumber implements Runnable{
    public void run(){
        for(int i=1; i<=10; i++){
        if(i%2 != 0){
            System.out.println(Thread.currentThread().getName() + " -> Odd: " + i);
        }
    }
    }
    
}

public class Runnable1 {
    public static void main(String[] args){
        Thread t1 = new Thread(new EvenNumber(), "Thread-1");
        Thread t2 = new Thread(new OddNumber(), "Thread-2");

        t1.start();
        t2.start();
    }
}
