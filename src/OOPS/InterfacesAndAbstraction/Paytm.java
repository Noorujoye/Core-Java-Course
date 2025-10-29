package OOPS.InterfacesAndAbstraction;

import java.util.Scanner;

interface Payment{
    void pay(int amount);// take a amount as parameter
}
//credit card payment
class CreditCardPayment implements Payment {
    public void pay(int amount){
        System.out.println("Paid " +  amount + "using CreditCard");
    }
}
class UpiPayment implements Payment{
    public void pay(int amount){
        System.out.println("Paid" +  amount + "using UPI");
    }

}
public class Paytm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose payment Method: ");
        System.out.println("1. credit card");
        System.out.println("2. UPi: ");

        int option = sc.nextInt();
        System.out.println("Enter the amount: ");
        int amount = sc.nextInt();

        Payment payment; //refernence of interface

        if (option == 1) {
            payment = new CreditCardPayment();
        } else {
            payment = new UpiPayment();
        }

        payment.pay(amount);
        sc.close();

    }
}
