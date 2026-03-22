package ExceptionHandling;

public class text {
    public static void main(String[] args){
        try{
            int a = 10;
            int b = 0;

            int c = a/b;
            System.out.println(c);
        }catch(ArithmeticException ae){
            System.out.println("Dividing by Zero not allowed!");
        }
    }
}
