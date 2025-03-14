import java.util.*;

class InsufficientFundsException extends Exception{
    
    public String toString(){
        return "Insufficient Balance! Please Deposit Enough Amount Before withdrawal.";
    }
}

class BankAccount{
    private int accountNumber;
    private double balance = 0;

    BankAccount(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public String deposit(double amount){
        balance += amount;
        return "-------------------------------------\nAn Amount of " + amount + " was Successfully deposited to your Account.\nYour current Balance is " + balance + ". Account ID: " + accountNumber + "\n-------------------------------------";
    }

    public String withdraw(double amount) throws InsufficientFundsException{
        if (amount > balance){
            throw new InsufficientFundsException();
        } 
        else {
            balance -= amount;
        }
        return "-------------------------------------\nAn Amount of " + amount + " has been Deducted from you Account.\nYour current Balance is " + balance + "  .Account ID: " + accountNumber + "\n-------------------------------------";
    }
}

public class BSDSF22M021_WEB_LAB04_TASK1{
    public static void main(String[] args){
        try{
            Scanner in = new Scanner(System.in);
            BankAccount bankaccount = new BankAccount(101036);

            System.out.print("Enter Amount to deposit to your Account: ");
            double amount = in.nextDouble();
            in.nextLine();

            String out = bankaccount.deposit(amount);
            System.out.println(out);

            System.out.print("Enter Amount to withdraw from your Account: ");
            amount = in.nextDouble();
            in.nextLine();

            out = bankaccount.withdraw(amount);
            System.out.println(out);

        } catch (InsufficientFundsException e){
            System.out.println("-------------------------------------\nException: " + e);
        } finally {
            System.out.println("-------------------------------------\nTransaction Complete :)");
        }
    }
}