package multithreading.GettingSetting;

class A_Thread implements Runnable{
    public void run(){
        for(int i=0; i<20; i++){
            String tName = Thread.currentThread().getName();
            System.out.println(tName+ " is running...");
        }
    }
}


class B_Thread implements Runnable{
    public void run(){
        for(int i=20; i<40; i++){
            String tName = Thread.currentThread().getName();
            System.out.println(tName + " is running...");
        }
    }
}

class C_Thread implements Runnable{
    public void run(){
        for(int i=50; i<70; i++){
            String tName = Thread.currentThread().getName();
            System.out.println(tName + " is running...");
        }
    }
}




public class multipleThread {
    public static void main(String[] args){
        A_Thread A = new A_Thread();

        B_Thread B = new B_Thread();

        C_Thread C = new C_Thread();

        Thread t1 = new Thread(A, "A_Thread");

        Thread t2 = new Thread(B,"B_Thread");

        Thread t3 = new Thread(C, "C_Thread");

        t1.start();
        t2.start();
        t3.start();  

    }

}
