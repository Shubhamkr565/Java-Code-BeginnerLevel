package multithreading;


class Odd implements Runnable{
    public void run(){
        for(int i=0; i<20; i++){
            if(i%2!=0){
                System.out.println("Odd: "+i);
            }
        }
    }
}

class Even implements Runnable{
    public void run(){
        for(int i=2; i<20; i++){
            if(i%2==0){
                System.out.println("Even: "+ i);
            }
        }
    }
}


public class z {

    public static void main(String[] args){
        Odd o1 = new Odd();
        Even e1 = new Even();

        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(e1);

        t1.start();
        t2.start();
        

    }
}
