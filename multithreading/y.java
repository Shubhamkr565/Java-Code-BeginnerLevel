package multithreading;

public class y extends Thread {
    @Override
    public void run(){
        for(int i=0; i<30; i++){
            System.out.println("Inside run() method: "+i);
        }
        System.out.println("End of run() method....");
    }
    public static void main(String[] args){
        y y1 = new y();

        y1.start();
        for(int i=25; i<=60; i++){
            System.out.println("Inside main() method: "+i);
        }
        System.out.println("End main() method....");
    }
}
