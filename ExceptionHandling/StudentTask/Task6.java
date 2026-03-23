package ExceptionHandling.StudentTask;

public class Task6 {
    static int text(){
        try{
            return 1;
        }
        finally{
            return 2;
        }
    }
    public static void main(String[] args){
        System.out.println(text());
    }
}


// Options:
// A. 1
// B. 2
// C. Compilation Error
// D. Runtime Error.