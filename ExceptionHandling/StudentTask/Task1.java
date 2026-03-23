package ExceptionHandling.StudentTask;

public class Task1 {
    public static void main(String[] args){
        // System.out.println("Program Start.....\n");
        try{
            System.out.println("A");
            int  x = 10/0;
            System.out.println("B");
        }catch(Exception e){
            System.out.println("C");
        }
        System.out.println("D");
    }
}



// Options
// A.   A,B,C,D
// B.   A,C,D
// C.   A,B,D
// D.   Compile error