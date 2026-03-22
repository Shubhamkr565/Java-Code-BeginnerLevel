package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MultipleError {
    public static void main(String[] args){
        System.out.println("Program Start......");
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter num1: ");
            int num1 = sc.nextInt();

            System.out.println("Enter num2: ");
            int num2 = sc.nextInt();

            int num3 = num1/num2;
            System.out.println(num3);
        }catch(ArithmeticException ae){
            ae.printStackTrace();
            System.out.println("Division by Zero is not allowed...");
        }
        catch(InputMismatchException ime){
            System.out.println("\nPlease pass the proper numbers (digit)");
            ime.printStackTrace();
        }
        catch(NullPointerException npe){
            System.out.println("Result is not more than 5 so s1 is null");
        }
        finally{
            System.out.println("Program end.....");
        }
        sc.close();
        
    }
}
