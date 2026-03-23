package ExceptionHandling.StudentTask;

public class Task9 {
    public static void main(String[] args){
        try{
        System.out.println("Try");
        System.exit(0);
        }
        finally{
            System.out.println("Finally");
        }
    }
}


// Options:
// A. Try
// B. Finally
// C. Compilation Error
// D. Runtime Error.



// System.exit(0); is called
// → JVM terminates immediately
// Because JVM stops, finally block does NOT execute


// Key Rule:
// finally runs almost always
// Exception:
// System.exit()
// JVM crash