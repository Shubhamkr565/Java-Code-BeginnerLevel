package ExceptionHandling.StudentTask;

public class Task2 {
    public static void main(String[] args){
        try{
            int arr[] = new int[5];
            System.out.println(arr[5]);
        }catch(ArithmeticException ae){
            System.out.println("Arithmetic");
        }catch(Exception e){
            System.out.println("Exception");
        }
    }
}


// Options
// A. Arithmetic
// B. Exception
// C. Runtime error
// D. Compile error

