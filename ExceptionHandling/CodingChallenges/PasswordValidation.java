// Problem Statement: Password Validation System
// You are building a user registration system.
// The password must satisfy the following rules:
// ● Minimum length 8 characters
// ● Must contain at least one digit
// If the password does not follow these rules, throw a custom exception:
// InvalidPasswordException

package ExceptionHandling.CodingChallenges;
import java.util.Scanner;

// Custom Exception
class InvalidPasswordException extends Exception{
    public InvalidPasswordException(String message){
        super(message);
    }
}
public class PasswordValidation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter Your Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Password: ");
            String pass = sc.nextLine();

            boolean hasNumber = false;
            for(int i=0; i<pass.length(); i++){
                if(Character.isDigit(pass.charAt(i))){
                    hasNumber = true;
                    break;
                }
            }
            // validation
            if(pass.length() < 8 ||  !hasNumber){
                throw new InvalidPasswordException("Invalid Password! Must be 8+ chars and content at least one number ");
            }
            System.out.println("Vaild password!.");
        }
        catch(InvalidPasswordException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Something went wrong!.");
        }
        finally{
            System.out.println("Program end....");
        }
        sc.close();
    }
}
