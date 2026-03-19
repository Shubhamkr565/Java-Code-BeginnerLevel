package ExceptionHandling;
import java.util.Scanner;
public class second {
    public static void main(String[] args){
        System.out.println("Program starts....");
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter number 1:");
            int num1 = sc.nextInt();
            System.out.println("Enter number 2:");
            int num2 = sc.nextInt();

            int result = num1/num2;
            System.out.println(result);
            System.out.println("Inside try....");
        }catch(ArithmeticException ae){
            System.out.println("Division by Zero is not allowed...");
            ae.printStackTrace();  //"Show me full details of the error so I can debug it."
        }
        sc.close();

        System.out.println("Program ends....");

    }
}


// if the exception occures in the try block.
// The exception object is passed to the catch block.
// The catch block handles the exception.

