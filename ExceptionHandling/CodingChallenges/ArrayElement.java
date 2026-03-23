// Problem Statement: Array Element Access
// ● Write a Java program that stores 5 numbers in an array.
// ● Ask the user to enter an index to access an element of the array.
// ● If the user enters an index outside the valid range, the program should handle the
//   exception and display a friendly message.


package ExceptionHandling.CodingChallenges;
import java.util.Scanner;
public class ArrayElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.println("Enter an index to access an element of the array: ");
        int index = sc.nextInt();

        try{    
            System.out.println("In the Array index No: "+index+" value: "+arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("index Outside the valid range....");
        }
        finally{
            System.out.println("Program end...");
        }
        sc.close();
    }
}
