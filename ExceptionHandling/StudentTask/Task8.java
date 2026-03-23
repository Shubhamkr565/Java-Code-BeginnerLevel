package ExceptionHandling.StudentTask;

public class Task8 {
    public static void main(String[] args){
        try{
            try{
                int x = 10/0;
            }
            catch(NullPointerException e){
                System.out.println("Inner Catch");
            }
        }
        catch(Exception e){
            System.out.println("Outer Catch");
        }   
    }
}



// Options:
// A. Inner Catch
// B. Outer Catch
// C. Compilation Error
// D. Runtime Error.