import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Basic Calculator");
        System.out.println("Enter first Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("Choose Operator: ");
        System.out.println("1. Add ");
        System.out.println("2. Sub ");
        System.out.println("3. Mul ");
        System.out.println("4. Div ");

        int choice = sc.nextInt();
        switch(choice){
            case 1: 
                System.out.println("Result = "+(a+b));
                break;
            case 2: 
                System.out.println("Result = "+ (a-b));
                break;
            case 3: 
                System.out.println("Result = "+ (a*b));
                break;
            case 4: 
                if (b!=0)
                System.out.println("Result = "+ (a/b));
                break;
            default:
                System.out.println("Invaild Choice");
        }
        
        sc.close();
    }
}
