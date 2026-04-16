package multithreading;

class SumOfInteger implements Runnable{
    public void run(){
        int sum = 0;
        for(int i=0; i<20; i++){
            sum += i;
        }
        System.out.println("Sum of All Integers: "+ sum);
    }
}



public class SumOfAllInteger {
    public static void main(String[] args){
        SumOfInteger s1 = new SumOfInteger();

        Thread t1 = new Thread(s1);

        t1.start();
    }
}
