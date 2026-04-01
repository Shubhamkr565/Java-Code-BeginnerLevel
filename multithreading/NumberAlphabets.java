package multithreading;

class Number extends Thread{
    public void run(){
        for (int i=0; i<=10; i++){
            System.out.println("Thread Number: "+i);
        }
    }
}

class Alphabates extends Thread{
    public void run(){
        for (char ch = 'A'; ch <= 'E'; ch++){
            System.out.println("Alphabet: "+ch);
        }
    }
}

public class NumberAlphabets {
    public static void main(String[] args){
        Number n1 = new Number();
        Alphabates a1 = new Alphabates();

        n1.start();
        a1.start();
    }
}
