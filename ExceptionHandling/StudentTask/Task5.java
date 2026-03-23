package ExceptionHandling.StudentTask;

public class Task5 {
    public static void main(String[] args){
        try{
            int x = 10/0;
        }
        // catch(ArithmeticException ae){
        //     System.out.println("A");
        // }
        finally{
            // System.out.println("B");
            System.out.println("Finally");
        }
    }
}


// Options
// A. A
// B. B
// C. A B
// D. Compile error




// Options
// A. Finally
// B. ArithmeticException + Finally
// C. Compile error
// D. Runtime error