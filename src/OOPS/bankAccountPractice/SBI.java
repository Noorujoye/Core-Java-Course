package OOPS.bankAccountPractice;

public class SBI {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(0425231057 , "Noorain Warsi" , 10000);
        BankAccount ba1 = new BankAccount(0425231057 , "Noorain Warsi" , 10000);
        BankAccount ba2 = new BankAccount(0425231057 , "Noorain Warsi" , 10000);

        ba.getDetails();
        System.out.println("");
        ba.withdraw(1000);
        System.out.println("");
        ba.getDetails();
        ba.deposit(1000);
        ba.getDetails();

        ba1.withdraw(10000);
        ba1.getDetails();
    }
}
