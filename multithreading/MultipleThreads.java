package multithreading;


class ThreadA extends Thread{
    public void run(){
        for(int i=0; i<30; i++){
            System.out.println("Inside Thread A: " +i);
        }
        System.out.println("End of Thread A......");
    }
}

class ThreadB extends Thread{
    public void run(){
        for(int i=50; i<100; i++){
            System.out.println("Inside Thread B: "+i);
        }
        System.out.println("End of Thread B.....");
    }
}


class ThreadC extends Thread{
    public void run(){
        for(int i=4; i<50; i++){
            System.out.println("Inside Thread B: "+i);
        }
        System.out.println("End of Thread C...... ");
    }
}






public class MultipleThreads{
        public static void main(String[] args){
            ThreadA t1 = new ThreadA();
            ThreadB t2 = new ThreadB();
            ThreadC t3 = new ThreadC();
            
            t1.start();
            t2.start();
            t3.start();
            
            for(int i=20; i<40; i++){
                System.out.println("Inside Main Thread: "+i);
            }
            System.out.println("End of main Thread.....");
    }
}
