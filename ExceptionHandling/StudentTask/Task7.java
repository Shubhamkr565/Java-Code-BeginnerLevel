package ExceptionHandling.StudentTask;

public class Task7 {
    static int text(){
    int x = 10;
    try{
        return x;
    }
    finally{
        x = 20;
    }
}
    public static void main(String[] args){
        System.out.println(text());
    }    
}


// Options:
// A. 10
// B. 20a
// C. Compilation Error
// D. Runtime Error.