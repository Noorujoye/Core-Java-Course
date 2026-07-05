package OOPs.Variables;
import java.util.*;
public class Instance {
    static int wheels = 4;
    static void showwheels() {
        System.out.println("Car has " + wheels + " wheels.....");
    }

    public static void main(String[] args) {
        showwheels();
    }
}


class BankAccount{
    // Instance fields----
   //  In Istannces everything objects has its own copies or unique things...

    private String accountHolder; // unique per account
    private double balance;

    // Static fields

    private static double annualInterest = 0.04; // this datta will share among all....accounts
    private static int accountCounter = 0;

    // Constructor
    BankAccount(String name, double intitialdeposit){
        this.accountHolder = name;
        this.balance = intitialdeposit;
        accountCounter++;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdrawal(double amount){
        if (balance >= amount){
            balance -= amount;
        }else{
            System.out.println("Insufficient fund");
        }
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Noorain Warsi", 101.1);



    }
}

