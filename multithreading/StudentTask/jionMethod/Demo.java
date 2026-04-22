/*
Problem Statement:

--Students are given three classes:

ThreadA extends Thread : Rohit
ThreadB extends Thread : Kohali
Demo class (contains the main method: default main thread): Surya

The program uses the join() method to control the execution order of threads.


Task Requirements:

--Rename the threads as follows:

ThreadA: Rohit Thread
ThreadB: Kohali Thread
Main Thread: Surya Thread

--Each thread should print its name 5 times in the following format:

Rohit Thread is running: 1
Rohit Thread is running: 2
Rohit Thread is running: 3
Rohit Thread is running: 4
Rohit Thread is running: 5


Execution Order Requirement:

--Kohali Thread should wait for the completion of Rohit Thread.
--Surya Thread (main thread) should wait for the completion of Kohali Thread.


*/

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
