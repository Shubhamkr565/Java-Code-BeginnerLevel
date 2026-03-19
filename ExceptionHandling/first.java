package ExceptionHandling;
import java.util.Scanner;

public class first {
    public static void main(String[] args){
        System.out.println("program starts.....");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        int result = num1/num2;
        System.out.println(result);

        sc.close();

        System.out.println("Program ends...");
    }
}


// you see the program complies successfully.
// if we pass num2 as 0, our program will terminate abnormally without executing the last statement.
// During execution, the JVM detects division by zero
// JVM creates an object of ArithmeticException.