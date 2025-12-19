package OOPS.bankAccountPractice;


public class BankAccount {
    private int accountNum;
    private String name;
    private double balance;

    BankAccount(int accountNum , String name , double balance) {
        this.accountNum=accountNum;
        this.name=name;
        this.balance=balance;
    }

    public int getAccountNum() {
        return accountNum;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(int deposit) {
        this.balance += deposit;
    }
    public void withdraw(int withdraw) {
        this.balance -= withdraw;
    }

    public void getDetails() {
        System.out.println("AccountHolder   : " + this.getName()
                         + "\nAccount Number  : "+ this.getAccountNum()
                         + "\nAccount Balance : " + this.getBalance());
    }
}
