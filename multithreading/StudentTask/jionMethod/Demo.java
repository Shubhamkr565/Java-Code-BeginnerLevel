package multithreading.StudentTask.jionMethod;

public class Demo {
    public static void main(String[] args){

        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB(t1);

        t1.setName("Rohit Thread");
        t2.setName("Kohali Thread");

        t1.start();
        t2.start();

        try{
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        for(int i=1; i<=5;i++){
            System.out.println(Thread.currentThread().getName()+ " is running "+ i);
        }
    }
}
