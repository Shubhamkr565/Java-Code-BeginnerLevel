// Age Validation System

// 👉 Rules:

// Age must be ≥ 18
// If not → throw InvalidAgeException

// 👉 Task:

// Take age from user
// If age < 18 → throw custom exception


package ExceptionHandling.CodingChallenges;
import java.util.Scanner;

class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}


public class AgeValidation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter Age: ");
            int age = sc.nextInt();

            if(age < 18){
                throw new InvalidAgeException("Age must be >= 18");
            }
            System.out.println("Vaild Age.");
        }catch(InvalidAgeException e){
            System.out.println("Exception: "+e.getMessage());
        }
        catch(Exception e){
            System.out.println("Invalid input! Please enter a number.");

        } finally{
            System.out.println("Program End...");
            sc.close();
        }
        sc.close();
    }
}
