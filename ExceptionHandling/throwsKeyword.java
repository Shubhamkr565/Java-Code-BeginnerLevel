package ExceptionHandling;
import java.util.Scanner;

public class throwsKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
            int x = num1/num2;
            System.out.println(x);
            System.out.println("Program end.....");
        sc.close();
    }
}
