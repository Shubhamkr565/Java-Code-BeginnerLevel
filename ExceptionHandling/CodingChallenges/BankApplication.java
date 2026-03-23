// Problem Statement
// ●
// ●
// ●
// You are developing a simple banking application. The bank has a rule that every
// account must maintain a minimum balance of ₹1000.
// A customer is allowed to withdraw money only if the remaining balance after
// withdrawal is greater than or equal to ₹1000.
// If a customer tries to withdraw money that violates this rule, the program should throw a
// custom exception called InsufficientBalanceException.
// Requirements
// Your program should perform the following tasks:
// 1. Create a custom exception class named:
// InsufficientBalanceException
// 2. Create a BankAccount class with the following:
// ○
// ○
// A variable balance
// A method withdraw(int amount)
// 3. The withdraw() method should:
// ○
// Allow withdrawal if the remaining balance ≥ ₹1000
// ○
// Otherwise throw InsufficientBalanceException
// 4. In the main method:
// ○
// Create a bank account with an initial balance.
// ○
// Ask the user to enter the withdrawal amount.
// ○
// Handle the exception using try-catch
// Expected Behaviour
// Case 1: Valid Withdrawal
// Current Balance: 5000
// Enter amount to withdraw: 2000
// Withdrawal successful
// Remaining Balance: 3000
// Case 2: Invalid Withdrawal
// Current Balance: 5000
// Enter amount to withdraw: 4500
// Exception: Minimum balance of ₹1000 must be maintained




package ExceptionHandling.CodingChallenges;
import java.util.Scanner;

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}

class BankAccount{
    int balance;
    BankAccount(int balance){
        this.balance = balance;
    }
    void withdrow(int amount)throws InsufficientBalanceException{
        if(balance-amount < 1000){
            throw new InsufficientBalanceException("Minimun balance of ₹1000 must be maintained.");
        }
        balance = balance-amount;
        System.out.println("Withdraw Successful");
        System.out.println("Remaining Balance: "+balance);
    }
}


public class BankApplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(5000);

        System.out.println("Current Balance: 5000");
        System.out.println("Enter Amount to Withdraw: ");
        int amount = sc.nextInt();
        try{
            account.withdrow(amount);
        }
        catch(InsufficientBalanceException e){
            System.out.println("Exception: "+e.getMessage());
        }
        sc.close();
    }
}
