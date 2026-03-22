package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args){
        System.out.println("Program Start....");
        Scanner sc = new Scanner(System.in);

        try{
            String s1 = null;
            System.out.println("Enter num1: ");
            int n1 = sc.nextInt();

            System.out.println("Enter num2: ");
            int n2 = sc.nextInt();

            int x = n1/n2;
            if (x > 10){
                s1 = "Welcome";
            }
            System.out.println(s1.toUpperCase());
        }
        catch(InputMismatchException ab){
            ab.printStackTrace();
        }
        catch(ArithmeticException ae){
            ae.printStackTrace();
        }
        catch(NullPointerException np){
            np.printStackTrace();
        }
        System.out.println("End of main()....");

        sc.close();
    }
}
